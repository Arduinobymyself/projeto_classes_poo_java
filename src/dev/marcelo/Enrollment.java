package dev.marcelo;

/*
Crie uma classe que modele a matrícula de um aluno de academia:
Atributos: Id matricula, data da matrícula, aluno e avaliações físicas.
Métodos: Informações da última avaliação e informações de uma avaliação pela data.
*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Enrollment {
    // attributes
    private Long id;
    private LocalDate enrollmentDate = LocalDate.now(); // importação
    private Customer customer; //composição uma classe dentro de outra
    private List<Assessment> assessments = new ArrayList<Assessment>();

    // methods
    public Assessment getLastAssessment(){
        int indexLastAssessments = this.assessments.size() - 1;
        Assessment lastAssessment = this.assessments.get(indexLastAssessments);
        return lastAssessment;
    }

    public Assessment getAssessmentByDate(LocalDate dateAssessment){
        Assessment assessment = this.assessments.stream()
                .filter(a -> a.getAssessmentDate().equals(dateAssessment))
                .findFirst()
                .orElseThrow(() -> {
                    throw new RuntimeException("Assessment not found.");
                });
        return assessment;
    }



    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Assessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<Assessment> assessments) {
        this.assessments = assessments;
    }
}
