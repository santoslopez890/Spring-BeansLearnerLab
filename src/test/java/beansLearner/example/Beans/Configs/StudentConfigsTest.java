package beansLearner.example.Beans.Configs;

import beansLearner.example.Beans.Models.Students;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentConfigsTest {
    @Autowired
    private StudentConfigs config;

    @Test
    public void contextLoads() throws Exception {
        assertThat(config).isNotNull();
    }

    @Test
    void currentStudents() {
        String expected = "8 Santos";
        Students actualStudents = config.students();
        Assert.assertEquals(expected, actualStudents.toString());
    }

    @Test
    void previousStudents() {
        String expected = "9 Bob Lee";
        Students actualStudents = config.previousStudents();
        Assert.assertEquals(expected, actualStudents.toString());
    }
}
