package by.vyun.rewiew_question.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum QuestionType {
    SINGLE ("single"),
    MULTIPLE ("multiple");

    String label;
}
