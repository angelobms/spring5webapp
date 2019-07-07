package br.com.bmsti.spring5webapp.controllers;

import br.com.bmsti.spring5webapp.repositories.FruitRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author angelo santos
 * @version 1.0
 * @since 06/07/2019
 */
@Controller
public class FruitController {

    private FruitRepository fruitRepository;

    public FruitController(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @RequestMapping("/fruits")
    public String getFruit(Model model) {

        model.addAttribute("fruits", fruitRepository.findAll());

        return  "fruits";
    }
}
