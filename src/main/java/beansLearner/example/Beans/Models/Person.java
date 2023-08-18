package beansLearner.example.Beans.Models;

import org.springframework.context.annotation.Bean;


public class Person {

    final Long id;



    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
