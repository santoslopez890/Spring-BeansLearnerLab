package beansLearner.example.Beans.Models;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
public class Alumni {
    Students students;
    Instructors instructors;

    Classroom Alumniclassroom;
    @Autowired
    public Alumni(@Qualifier("previousCohort")Classroom classroom){
       Alumniclassroom=classroom;
    }

    @PostConstruct
    public void executeBootcamp(){
        Alumniclassroom.hostLecture(Alumniclassroom.getInstructors(),1200);

    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
