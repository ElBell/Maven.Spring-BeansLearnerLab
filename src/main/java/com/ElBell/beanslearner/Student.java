package com.ElBell.beanslearner;

public class Student extends Person implements Learner {
    private double totalStudyTime = 0;
    public Student(long id, String name) {
        super(id, name);
    }
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }
    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }
}
