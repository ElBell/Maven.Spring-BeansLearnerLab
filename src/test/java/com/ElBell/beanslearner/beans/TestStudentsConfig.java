package com.ElBell.beanslearner.beans;

import com.ElBell.beanslearner.Student;
import com.ElBell.beanslearner.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestStudentsConfig {
    @Autowired @Qualifier("students")
    Students currentStudents;

    @Test
    public void testCurrentStudentsLenth() {
        //Given
        int expected = 43;

        //When
        int actual = currentStudents.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStudentNames() {
        //Given
        String[] currentStudentNames = new String[]{"Arcelia", "Ajah",
            "Alex", "Ashley B.", "Ashley S.", "Aswathy", "Brian",
            "Cara", "Charles", "Cristina", "David", "Davis", "Delenda",
            "Eleonor", "Eric", "Francisco", "Jim", "Joseph", "Julian",
            "Jutta", "Kat", "Kate", "Kyle", "Laxmi", "Leah", "Mark", "Marlys",
            "Marshilla", "Michael", "Neela", "Nirmala", "Reese",
            "Robyn", "Sean Green", "Sean Grey", "Shuchi", "Sravani",
            "Sunhyun", "Swampna", "Swathi", "William", "Yang", "Zaina"};

        List<String> expected = new ArrayList<>(Arrays.asList(currentStudentNames));
        //When
        List<Student> actualCurrentStudents = currentStudents.getPersonList();

        //Then
        actualCurrentStudents.forEach(student -> Assert.assertTrue(expected.contains(student.getName())));
    }

    @Autowired @Qualifier("previousStudents")
    Students previousStudents;
    @Test
    public void testPreviousStudentsLength() {
        //Given
        int expected = 32;

        //When
        int actual = previousStudents.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStudentsNames() {
        //Given
        String[] previousStudentNames = new String[]{"Maggie", "Steffon",
            "Khalil", "Dr.J", "Rachelle", "Brian", "David", "Sean", "Whitney", "Jenn",
            "Demetrius", "Michelle", "Eugene", "Tommy", "Allison", "Frankie", "April",
            "Shivram", "Xzavia", "Ray", "Brandon", "Beau", "Kevin", "Simon", "Veronica",
            "Elliot", "Conner", "Mexi", "Kaleb", "Mark", "Jared", "Sam"};

        List<String> expected = new ArrayList<>(Arrays.asList(previousStudentNames));

        //When
        List<Student> actualPreviousStudents = previousStudents.getPersonList();

        //Then
        actualPreviousStudents.forEach(student -> Assert.assertTrue(expected.contains(student.getName())));
    }
}