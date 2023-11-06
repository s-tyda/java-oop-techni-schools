package org.technischools.oop.users;

public class Student extends User{
    private String semester;
    public Student(String login, String password, String semester) {
        super(login, password);
        this.semester = semester;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(this.semester);
    }
}
