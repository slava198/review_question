package by.vyun.rewiew_question.repo;

import by.vyun.rewiew_question.entity.TemplateAppointmentQuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateAppointmentQuestionAnswerRepo extends JpaRepository<TemplateAppointmentQuestionAnswer, Long> {
    TemplateAppointmentQuestionAnswer getFirstById(Long id);

}
