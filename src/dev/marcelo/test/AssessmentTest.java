package dev.marcelo.test;

import dev.marcelo.Assessment;
import dev.marcelo.Enrollment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class AssessmentTest {
    private Assessment assessment;
    private DecimalFormat df = new DecimalFormat("0.0");

    @BeforeEach
    void setup(){
        assessment = new Assessment();
    }

    @Test
    void givenCalculateImc_whenReturnImc_thenSucceed(){
        assessment.setHeight(1.71d);
        assessment.setWeight(66d);

        Double actual = assessment.calculateImc();

        assertEquals(df.format(22.57), df.format(actual));
    }

    @Test
    void givenGetStatusAssessment_whenReturnUNDERWEIGHT_thenSucceed(){
        assessment.setImc(18.4d);

        assessment.getStatusAssessment();
        String actual = assessment.getStatus();

        assertEquals("UNDER WEIGHT", actual);

    }

    @Test
    void givenGetStatusAssessment_whenReturnNORMALWEIGHT_thenSucceed(){
        assessment.setImc(20d);

        assessment.getStatusAssessment();
        String actual = assessment.getStatus();

        assertEquals("NORMAL WEIGHT", actual);

    }

    @Test
    void givenGetStatusAssessment_whenImcEqual18_5ReturnNORMALWEIGHT_thenSucceed(){
        assessment.setImc(18.5d);

        assessment.getStatusAssessment();
        String actual = assessment.getStatus();

        assertEquals("NORMAL WEIGHT", actual);

    }

    @Test
    void givenGetStatusAssessment_whenImcEqual24_9ReturnNORMALWEIGHT_thenSucceed(){
        assessment.setImc(24.9d);

        assessment.getStatusAssessment();
        String actual = assessment.getStatus();

        assertEquals("NORMAL WEIGHT", actual);

    }

    @Test
    void givenGetStatusAssessment_whenImcGreaterThan24_9ReturnOVERWEIGHT_thenSucceed(){
        assessment.setImc(25.9d);

        assessment.getStatusAssessment();
        String actual = assessment.getStatus();

        assertEquals("OVER WEIGHT", actual);

    }

    @Test
    void givenIncludeAssessmentEnrollment_whenAssessmentIncludeInEnrollment_thenSucceed(){
        Enrollment enrollment = new Enrollment();
        assessment.setEnrollment(enrollment);
        assessment.includeAssessmentEnrollment();
        int actual = assessment.getEnrollment().getAssessments().size();

        assertEquals(1, actual);

    }

}