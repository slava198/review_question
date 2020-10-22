package by.vyun.rewiew_question.service;

import by.vyun.rewiew_question.entity.Product;
import by.vyun.rewiew_question.entity.TemplateAppointmentQuestion;
import by.vyun.rewiew_question.repo.ProductRepo;
import by.vyun.rewiew_question.repo.TemplateAppointmentQuestionAnswerRepo;
import by.vyun.rewiew_question.repo.TemplateAppointmentQuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminService {
    @Autowired
    TemplateAppointmentQuestionRepo questionRepo;
    @Autowired
    TemplateAppointmentQuestionAnswerRepo answerRepo;
    @Autowired
    ProductRepo productRepo;




    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }


}
