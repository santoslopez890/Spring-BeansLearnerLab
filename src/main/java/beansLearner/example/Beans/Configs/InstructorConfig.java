package beansLearner.example.Beans.Configs;

import beansLearner.example.Beans.Models.Instructor;
import beansLearner.example.Beans.Models.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

public class InstructorConfig {
    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors(){

        return new Instructors(new Instructor(5L,"Kris"));
    }
    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors(){
        return new Instructors(new Instructor(6L,"Dolio"));
    }
    @Primary
    @Bean(name = "instructors")
    public Instructors instructors(){
        return new Instructors(new Instructor(7L,"Dolio"));
    }
}
