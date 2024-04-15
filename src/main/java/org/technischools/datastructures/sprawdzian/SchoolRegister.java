package org.technischools.datastructures.sprawdzian;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolRegister {
    private Map<String, Map<String, List<Integer>>> grades;

    public void addGrade(String subject, String student, Integer grade){
        if (!grades.containsKey(subject)) {
            grades.put(subject, new HashMap<>());
        }
        if (!grades.get(subject).containsKey(student)) {
            grades.get(subject).put(student, new ArrayList<>());
        }
        grades.get(subject).get(student).add(grade);
    }

    public void showGrades(String subject, String student) {
        if (!grades.containsKey(subject)) {
            grades.put(subject, new HashMap<>());
        }
        if (!grades.get(subject).containsKey(student)) {
            grades.get(subject).put(student, new ArrayList<>());
        }
        System.out.println(grades.get(subject).get(student));
    }

    public void showGrades(String subject) {
        Map<String, List<Integer>> gradesSubject = grades.get(subject);
        if (gradesSubject != null){
            for (Map.Entry<String, List<Integer>> entry: gradesSubject.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    private double studentMean(List<Integer> grades) {
        if (grades == null || grades.size() == 0) {
            return 0d;
        }

        double sum = 0d;
        for (Integer integer: grades) {
            sum += integer;
        }
        return sum / grades.size();
    }

    public double subjectMean(String subject) {
        Map<String, List<Integer>> gradesSubject = grades.get(subject);
        if (gradesSubject != null){
            int studentsCount = gradesSubject.keySet().size();

            if (studentsCount == 0) {
                return 0d;
            }

            double sum = 0d;
            for (Map.Entry<String, List<Integer>> entry: gradesSubject.entrySet()) {
                sum += studentMean(entry.getValue());
            }
            return sum / studentsCount;
        }
        return 0d;
    }
}
