package beansLearner.example.Beans.Models;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students<studentType extends Student> extends People<Student>{
    public Students(studentType... studentTypes){
        super(studentTypes);
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Student> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Student> spliterator() {
        return super.spliterator();
    }
}
