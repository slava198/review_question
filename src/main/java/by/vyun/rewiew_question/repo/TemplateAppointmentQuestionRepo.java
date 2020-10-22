package by.vyun.rewiew_question.repo;

import by.vyun.rewiew_question.entity.TemplateAppointmentQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateAppointmentQuestionRepo extends JpaRepository<TemplateAppointmentQuestion, Long> {

    TemplateAppointmentQuestion getFirstById(Long id);

}
