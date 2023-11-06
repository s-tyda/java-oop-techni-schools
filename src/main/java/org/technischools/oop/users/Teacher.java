package org.technischools.oop.users;

public class Teacher extends User {
    protected String login;
    protected String password;
    protected String unit;
    public Teacher(String login, String password, String unit) {
        super(login, password);
        this.unit = unit;
    }
    @Override
    public void print() {
        super.print();
        System.out.println(this.unit);
    }
}
