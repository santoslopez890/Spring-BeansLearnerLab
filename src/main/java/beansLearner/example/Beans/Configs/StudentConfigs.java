package beansLearner.example.Beans.Configs;

import beansLearner.example.Beans.Models.Student;
import beansLearner.example.Beans.Models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class StudentConfigs {
    @Bean (name = "students")
   public Students students(){

        return new Students(new Student(8L,"Santos"));
    }
    @Bean(name = "previousStudents")
   public Students previousStudents(){
        return new Students(new Student(9L,"Bob Lee"));
    }

}
