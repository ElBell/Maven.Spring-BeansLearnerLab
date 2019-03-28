package com.ElBell.beanslearner;

import com.google.common.collect.Iterables;

import java.util.Arrays;

public class Instructor extends Person implements Teacher {
    int numberOfHoursTaught = 0;
    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        numberOfHoursTaught += numberOfHours;
        learners.forEach(learner -> learner.learn(numberOfHours/Iterables.size(learners)));
    }

    public int getNumberOfHoursTaught() {
        return numberOfHoursTaught;
    }
}
