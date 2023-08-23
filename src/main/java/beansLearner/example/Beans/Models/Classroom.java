package beansLearner.example.Beans.Models;

import beansLearner.example.Beans.Repos.Teacher;

public class Classroom {
    Instructors<Instructor> instructors;
    Students students;
    public Classroom(Instructors instructors,Students students ){
        this.students=students;
        this.instructors=instructors;
    }
    public void hostLecture(Instructors teacher, double numberOfHours){
    teacher.lecture(students.personTypeList,numberOfHours);
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Object getStudents() {
        return students;
    }
}
