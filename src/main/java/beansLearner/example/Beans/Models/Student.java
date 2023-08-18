package beansLearner.example.Beans.Models;

import beansLearner.example.Beans.Repos.Learner;

public class Student extends Person implements Learner {
    Double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public void learn(Double numberOfHours) {
        totalStudyTime+=numberOfHours;
    }
}
