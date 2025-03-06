package main.controller.monument;

import main.model.Monument;
import main.service.MonumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class MonumentWebController {

    @Autowired
    private MonumentService monumentService;

    @GetMapping("/monuments")
    public String showMonuments(Model model) {
        model.addAttribute("monuments", monumentService.findAll());
        return "monuments/list";
    }

    @GetMapping("/monuments/{id}")
    public String showMonumentDetails(@PathVariable String id, Model model) {
        Optional<Monument> monument = monumentService.findById(id);
        if (monument.isPresent()) {
            model.addAttribute("monument", monument.get());
            return "monuments/detailed";
        } else {
            return "error/404";
        }
    }
}


