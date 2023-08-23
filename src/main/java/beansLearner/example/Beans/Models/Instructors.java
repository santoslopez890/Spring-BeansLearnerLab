package beansLearner.example.Beans.Models;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors <instructorType extends Instructor> extends People{
    @SafeVarargs
    public Instructors(instructorType... instructorTypes){
        super(instructorTypes);
    }
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return super.spliterator();
    }


    public void lecture(List personTypeList, double numberOfHours) {

    }
}
