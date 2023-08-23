package beansLearner.example.Beans.Models;

import beansLearner.example.Beans.Repos.Teacher;

public class Classroom {
    Instructors instructors;
    Students students;
    public Classroom(Instructors instructors,Students students ){
        this.students=students;
        this.instructors=instructors;
    }
    public void hostLecture(Teacher teacher, double numberOfHours){
    teacher.lecture(students.personTypeList,numberOfHours);
    }

    public Object getInstructors() {
        return instructors;
    }

    public Object getStudents() {
        return students;
    }
}
