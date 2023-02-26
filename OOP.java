package com.company;

public class OOP {
    public static void main(String[] args) {
        Student me = new Student(44, "Abhishek Anand", 89);
        System.out.println(me.rno);
        System.out.println(me.name);
        System.out.println(me.marks);
        me.greetings();
    }
}

class Student {
    int rno;
    String name;
    float marks;

    void greetings(){
        System.out.println("Hello my name is" + this.name);
    }

    Student() {
        this.rno = 43;
        this.name = "Abhishek Anand";
        this.marks = 94.5f;
    }

    Student (int roll, String naam, int per) {
        this.rno = roll;
        this.name = naam;
        this.marks = per;
    }
}

