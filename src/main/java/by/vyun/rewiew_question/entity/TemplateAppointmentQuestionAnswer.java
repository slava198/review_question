package by.vyun.rewiew_question.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class TemplateAppointmentQuestionAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String text;
    @ManyToOne
    TemplateAppointmentQuestion question;


}
