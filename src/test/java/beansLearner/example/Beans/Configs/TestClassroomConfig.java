package beansLearner.example.Beans.Configs;

import beansLearner.example.Beans.Models.Classroom;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class TestClassroomConfig {
    @Autowired
    ClassroomConfig classroomConfig;

    @Autowired
    StudentConfigs mockStudents;

    @Autowired
    InstructorConfig mockInstructors;

    @Test
    void currentCohort() {
        String expectedInstructors = mockInstructors.getInstructors().toString();
        String expectedStudents = mockStudents.students().toString();

        Classroom actualClassroom = classroomConfig.currentCohort( mockInstructors.getInstructors(), mockStudents.students());

        Assert.assertEquals(expectedInstructors, actualClassroom.getInstructors().toString());
        Assert.assertEquals(expectedStudents, actualClassroom.getStudents().toString());
    }

    @Test
    void previousCohort() {
        String expectedInstructors = mockInstructors.getInstructors().toString();
        String expectedStudents = mockStudents.previousStudents().toString();

        Classroom actualClassroom = classroomConfig.previousCohort(
                mockInstructors.getInstructors(), mockStudents.previousStudents());

        Assert.assertEquals(expectedInstructors, actualClassroom.getInstructors().toString());
        Assert.assertEquals(expectedStudents, actualClassroom.getStudents().toString());
    }
}
