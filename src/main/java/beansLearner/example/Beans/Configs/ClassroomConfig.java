package beansLearner.example.Beans.Configs;

import beansLearner.example.Beans.Models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration

public class ClassroomConfig {
    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(){
        return new Classroom(new Instructors(new Instructor(1L,"Dolio")), new Students(new Student(3L,"Frank")));
    }
    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom previousCohort(){
        return new Classroom(new Instructors(new Instructor(2L,"fitzgerald")), new Students(new Student(4L,"Leon")));
    }
}
