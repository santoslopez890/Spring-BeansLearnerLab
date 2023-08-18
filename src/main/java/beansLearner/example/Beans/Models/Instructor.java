package beansLearner.example.Beans.Models;

import beansLearner.example.Beans.Repos.Learner;
import beansLearner.example.Beans.Repos.Teacher;

import java.util.ArrayList;
import java.util.Collection;

public class Instructor extends Person implements Teacher {
    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        ArrayList<Learner> learners1=new ArrayList<>((Collection) learners);
        //((Collection<? extends Learner>) learners).size()
        learners.forEach(l->l.learn(numberOfHours/((Collection<? extends Learner>) learners).size()));
//        learners1.forEach(l -> l.learn(numberOfHours/learners1.size()));
    }
}
