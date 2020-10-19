package by.vyun.rewiew_question.repo;

import by.vyun.rewiew_question.entity.QuestionCategoryType;
import by.vyun.rewiew_question.entity.TemplateReviewQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TemplateReviewQuestionRepo extends JpaRepository<TemplateReviewQuestion, Long> {

    public List<TemplateReviewQuestion> findAll();
    public List<TemplateReviewQuestion> findByDescriptionIsContaining(String text);
    public List<TemplateReviewQuestion> findByDescriptionIsContainingAndTypeEqualsAndActiveIs(String text, QuestionCategoryType type, boolean active);
    public TemplateReviewQuestion getFirstById(Long id);



}
