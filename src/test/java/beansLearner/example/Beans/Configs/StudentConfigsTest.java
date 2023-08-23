package beansLearner.example.Beans.Configs;

import beansLearner.example.Beans.Repos.Learner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import org.junit.runner.RunWith;


@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class StudentConfigsTest {
    @Autowired
    ClassroomConfig classroomConfig;
    @Autowired
    StudentConfigs mockStudents;



    @MockBean
    private Learner repository;

    @Test
    void students() {
    }

    @Test
    void previousStudents() {
    }
}
