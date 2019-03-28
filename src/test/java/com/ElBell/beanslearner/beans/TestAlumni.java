package com.ElBell.beanslearner.beans;

import com.ElBell.beanslearner.Instructors;
import com.ElBell.beanslearner.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestAlumni {
    @Autowired
    Alumni alumni;
    @Test
    public void testLearned1200() {
        //Given
        int expected = 1200;

        //Then
        Students students = alumni.getStudents();

        //When
        students.forEach(student -> Assert.assertEquals(expected, student.getTotalStudyTime(), 0.1));
    }
    @Test
    public void testTaughtEqually() {
        //Given
        int expected = 7680;

        //When
        Instructors instructors = alumni.getInstructors();

        //Then
        instructors.forEach(instructor -> Assert.assertEquals(expected, instructor.getNumberOfHoursTaught()));
    }
}
