package by.vyun.rewiew_question.dto;

import by.vyun.rewiew_question.entity.QuestionCategoryType;
import lombok.Builder;


@Builder
public class TemplateReviewQuestionDto {
    private Long id;
    private String description;
    private String type;
    private boolean active = true;
}
