package com.ElBell.beanslearner.beans;

import com.ElBell.beanslearner.Student;
import com.ElBell.beanslearner.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentsConfig {
    private static Student[] currentStudents = new Student[43];
    private static String[] currentStudentNames = new String[]{"Arcelia", "Ajah",
            "Alex", "Ashley B.", "Ashley S.", "Aswathy", "Brian",
            "Cara", "Charles", "Cristina", "David", "Davis", "Delenda",
            "Eleonor", "Eric", "Francisco", "Jim", "Joseph", "Julian",
            "Jutta", "Kat", "Kate", "Kyle", "Laxmi", "Leah", "Mark", "Marlys",
            "Marshilla", "Michael", "Neela", "Nirmala", "Reese",
            "Robyn", "Sean Green", "Sean Grey", "Shuchi", "Sravani",
            "Sunhyun", "Swampna", "Swathi", "William", "Yang", "Zaina"};

    private static Student[] previousStudents = new Student[32];
    private static String[] previousStudentNames = new String[]{"Maggie", "Steffon",
        "Khalil", "Dr.J", "Rachelle", "Brian", "David", "Sean", "Whitney", "Jenn",
        "Demetrius", "Michelle", "Eugene", "Tommy", "Allison", "Frankie", "April",
        "Shivram", "Xzavia", "Ray", "Brandon", "Beau", "Kevin", "Simon", "Veronica",
        "Elliot", "Conner", "Mexi", "Kaleb", "Mark", "Jared", "Sam"};

    static {
        for (int i = 0; i < 43; i++) {
            currentStudents[i] = new Student(i, currentStudentNames[i]);
            if (i<32) {
                previousStudents[i] = new Student(i, previousStudentNames[i]);
            }
        }
    }


    @Bean(name = "students")
    public Students currentStudents() {
        return new Students(currentStudents);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        return new Students(previousStudents);
    }
}
