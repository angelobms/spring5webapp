package br.com.bmsti.spring5webapp.controllers;

import br.com.bmsti.spring5webapp.repositories.VitaminRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author angelo santos
 * @version 1.0
 * @since 06/07/2019
 */
@Controller
public class VitaminController {

    private VitaminRepository vitaminRepository;

    public VitaminController(VitaminRepository vitaminRepository) {
        this.vitaminRepository = vitaminRepository;
    }

    @RequestMapping("/vitamins")
    public String getVitamin(Model model) {

        model.addAttribute("vitamins", vitaminRepository.findAll());

        return "vitamins";
    }
}
