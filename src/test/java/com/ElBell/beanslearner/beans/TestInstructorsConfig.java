package com.ElBell.beanslearner.beans;

import com.ElBell.beanslearner.Instructor;
import com.ElBell.beanslearner.Instructors;
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
public class TestInstructorsConfig {
    @Autowired @Qualifier("usaInstructors")
    Instructors usaInstructors;

    @Test
    public void testUSInstructorsLength() {
        //Given
        int expected = 4;

        //When
        int actual = usaInstructors.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testUSInstructorsNames() {
        //Given
        String[] instructorNames = new String[]{"Ted", "Marcy", "Fred", "Dylan"};
        List<String> expected = new ArrayList<>(Arrays.asList(instructorNames));

        //When
        List<Instructor> actualPreviousInstructors = usaInstructors.getPersonList();

        //Then
        actualPreviousInstructors.forEach(instructor -> Assert.assertTrue(expected.contains(instructor.getName())));
    }

    @Autowired @Qualifier("ukInstructors")
    Instructors ukInstructors;

    @Test
    public void testUkInstructorsLength() {
        //Given
        int expected = 4;

        //When
        int actual = ukInstructors.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testUKInstructorsNames() {
        //Given
        String[] instructorNames = new String[]{"Edward", "Sammy", "Jenn", "April"};
        List<String> expected = new ArrayList<>(Arrays.asList(instructorNames));

        //When
        List<Instructor> actualPreviousInstructors = ukInstructors.getPersonList();

        //Then
        actualPreviousInstructors.forEach(instructor -> Assert.assertTrue(expected.contains(instructor.getName())));
    }

    @Autowired
    Instructors instructors;

    @Test
    public void testInstructorsLength() {
        //Given
        int expected = 5;

        //When
        int actual = instructors.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstructorsNames() {
        //Given
        String[] instructorNames = new String[]{"Kris", "Leon", "Nhu", "Dolio", "Melanie"};
        List<String> expected = new ArrayList<>(Arrays.asList(instructorNames));

        //When
        List<Instructor> actualPreviousInstructors = instructors.getPersonList();

        //Then
        actualPreviousInstructors.forEach(instructor -> Assert.assertTrue(expected.contains(instructor.getName())));
    }
}
