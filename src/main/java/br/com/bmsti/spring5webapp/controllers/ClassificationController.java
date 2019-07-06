package br.com.bmsti.spring5webapp.controllers;

import br.com.bmsti.spring5webapp.repositories.ClassificationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author angelo santos
 * @version 1.0
 * @since 06/07/2019
 */
@Controller
public class ClassificationController {

    private ClassificationRepository classificationRepository;

    public ClassificationController(ClassificationRepository classificationRepository) {
        this.classificationRepository = classificationRepository;
    }

    @RequestMapping("/classifications")
    public String getClassification(Model model) {

        model.addAttribute("classifications", classificationRepository.findAll());

        return "classifications";
    }
}
