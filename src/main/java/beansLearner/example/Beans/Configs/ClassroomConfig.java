package beansLearner.example.Beans.Configs;

import beansLearner.example.Beans.Models.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class ClassroomConfig {
    @Bean ("currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students){
        return new Classroom(new Instructors(new Instructor(1L,"Dolio")), new Students(new Student(3L,"Frank")));
    }
    @Bean ("previousCohort")
    @DependsOn({"instructors", "students"})
    public Classroom previousCohort(Instructors instructors, Students students){
        return new Classroom(new Instructors(new Instructor(2L,"fitzgerald")), new Students(new Student(4L,"Leon")));
    }


}
