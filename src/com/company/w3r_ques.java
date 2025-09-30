package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

class Classroom{
    String classNames;
    String []studentsName;

    public Classroom(String classNames, String[] studentsName) {
        this.classNames = classNames;
        this.studentsName = studentsName;
    }
    public void printClassroom() {
        System.out.println("Class Name: " + classNames);
        System.out.print("Students: ");
        for (String student : studentsName) {
            System.out.print(student + " ");
        }
        System.out.println();
    }
}
public class w3r_ques {
    public static void main(String[] args) {
//        Question 7 : Constructor with Array Initialization

        String[] student = {"kabir","Raghav","Pratham","Aaditya"};
        Classroom c = new Classroom("jupiter",student);
        c.printClassroom();


    }
}
