package dev.marcelo.test;

import dev.marcelo.Assessment;
import dev.marcelo.Enrollment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class EnrollmentTest {
    private Enrollment enrollment;

    @BeforeEach
    void setup(){
        enrollment = new Enrollment();
    }

    @Test
    void givenGetLastAssessment_whenReturnLastAssessment_thenSucceed(){
        Assessment assessment1 = new Assessment();
        assessment1.setId(1L);
        assessment1.setEnrollment(enrollment);
        assessment1.includeAssessmentEnrollment();

        Assessment assessment2 = new Assessment();
        assessment2.setId(55L);
        assessment2.setEnrollment(enrollment);
        assessment2.setAssessmentDate(LocalDate.of(2022, Month.JULY, 14));
        assessment2.includeAssessmentEnrollment();

        Assessment assessment3 = new Assessment();
        assessment3.setId(105L);
        assessment3.setEnrollment(enrollment);
        assessment3.setAssessmentDate(LocalDate.of(2022, Month.OCTOBER, 14));
        assessment3.includeAssessmentEnrollment();

        Assessment lastAssessment = enrollment.getLastAssessment();
        Long actual = lastAssessment.getId();

        assertEquals(105L, actual);
    }

    @Test
    void givenGetLastAssessment_whenReturnAssessmentByDate_thenSucceed(){
        Assessment assessment1 = new Assessment();
        assessment1.setId(1L);
        assessment1.setEnrollment(enrollment);
        assessment1.includeAssessmentEnrollment();

        Assessment assessment2 = new Assessment();
        assessment2.setId(55L);
        assessment2.setEnrollment(enrollment);
        assessment2.setAssessmentDate(LocalDate.of(2022, Month.JULY, 14));
        assessment2.includeAssessmentEnrollment();

        Assessment assessment3 = new Assessment();
        assessment3.setId(105L);
        assessment3.setEnrollment(enrollment);
        assessment3.setAssessmentDate(LocalDate.of(2022, Month.OCTOBER, 14));
        assessment3.includeAssessmentEnrollment();

        Assessment lastAssessment = enrollment.getAssessmentByDate(LocalDate.now());
        Long actual = lastAssessment.getId();

        assertEquals(1L, actual);
    }

    @Test
    void givenGetLastAssessment_whenThrowsRunTimeExceptionAssessmentByDate_thenSucceed(){
        Assessment assessment1 = new Assessment();
        assessment1.setId(1L);
        assessment1.setEnrollment(enrollment);
        assessment1.includeAssessmentEnrollment();

        Assessment assessment2 = new Assessment();
        assessment2.setId(55L);
        assessment2.setEnrollment(enrollment);
        assessment2.setAssessmentDate(LocalDate.of(2022, Month.JULY, 14));
        assessment2.includeAssessmentEnrollment();

        Assessment assessment3 = new Assessment();
        assessment3.setId(105L);
        assessment3.setEnrollment(enrollment);
        assessment3.setAssessmentDate(LocalDate.of(2022, Month.OCTOBER, 14));
        assessment3.includeAssessmentEnrollment();

        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> enrollment.getAssessmentByDate(LocalDate.now()));

        assertEquals("Assessment not found", runtimeException.getMessage());
    }

}