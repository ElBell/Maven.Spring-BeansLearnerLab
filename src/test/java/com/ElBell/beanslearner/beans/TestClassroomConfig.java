package com.ElBell.beanslearner.beans;

import com.ElBell.beanslearner.Classroom;
import com.ElBell.beanslearner.Instructors;
import com.ElBell.beanslearner.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestClassroomConfig {
    @Autowired @Qualifier("currentCohort")
    Classroom currentClassroom;
    @Autowired @Qualifier("students")
    Students students;
    @Autowired
    Instructors instructors;
    @Test
    public void testCurrentCohortStudents() {
        //Given
        Students expected = students;

        //When
        Students actual = currentClassroom.getStudents();

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCurrentCohortInstructors(){
        //Given
        Instructors expected = instructors;

        //When
        Instructors actual = currentClassroom.getInstructors();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Autowired @Qualifier("previousCohort")
    Classroom previousClassroom;
    @Autowired @Qualifier("previousStudents")
    Students previousStudents;
    @Test
    public void testPreviousCohortStudents() {
        //Given
        Students expected = previousStudents;

        //When
        Students actual = previousClassroom.getStudents();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousCohortInstructors() {
        //Given
        Instructors expected = instructors;

        //When
        Instructors actual = previousClassroom.getInstructors();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
