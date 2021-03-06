package by.vyun.rewiew_question.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum QuestionCategoryType {
    BUYER_QUESTION("Buyer"),
    END_USER_QUESTION("End user"),
    SELLER_QUESTION("Seller");

//    private int id;
    private String label;

    QuestionCategoryType(String label) {
        this.label = label;
    }
}
