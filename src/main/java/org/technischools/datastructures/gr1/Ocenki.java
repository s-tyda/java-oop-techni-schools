package org.technischools.datastructures.gr1;


import java.util.*;

//9. System oceniania studentów z jednego przedmiotu.
// System powinien pozwalać na dodawanie oceny uczniowi,
// wyświetlenie ocen ucznia oraz wyliczenie średniej z ocen danego ucznia.

public class Ocenki {
    private Map<String, List<Integer>> LibrusTfuTfu = new HashMap<>();
    public void addOcenki(String Name, Integer Ocena) {
        if(!LibrusTfuTfu.containsKey(Name)) {
            List<Integer> grades = new ArrayList<>();
            grades.add(Ocena);
            LibrusTfuTfu.put(Name, grades);
        }
        else {
            LibrusTfuTfu.get(Name).add(Ocena);
        }
    }
    public void seeGrades(String Name) {
        System.out.println(Name+" : "+LibrusTfuTfu.get(Name));
    }

    public Float avgGrades(String Name) {
        int sum = 0;
        if (!LibrusTfuTfu.containsKey(Name)) {
            return null;
        }
        for (int ele: LibrusTfuTfu.get(Name)) {
            sum += ele;
        }
        return (float) sum / LibrusTfuTfu.get(Name).size();
    }
    public static void main(String[] args) {
        Ocenki ocenki = new Ocenki();
        ocenki.addOcenki("Hasrow", 1);
        ocenki.addOcenki("Hasrow", 2);
        ocenki.addOcenki("Hasrow", 1);
        ocenki.addOcenki("Hasrow", 6);
        ocenki.addOcenki("Hasrow", 1);
        ocenki.seeGrades("Hasrow");
        System.out.println(ocenki.avgGrades("czarny kolaga"));

    }
}

