package main.controller.monument;

import main.model.Monument;
import main.service.MonumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/monuments")
public class MonumentApiController {

    @Autowired
    private MonumentService monumentService;

    @GetMapping
    public List<Monument> getAllMonuments() {
        return monumentService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Monument> getMonumentById(@PathVariable String id) {
        return monumentService.findById(id);
    }

    @PostMapping
    public Monument createMonument(@RequestBody Monument monument) {
        return monumentService.save(monument);
    }

    @PutMapping("/{id}")
    public Monument updateMonument(@PathVariable String id, @RequestBody Monument updatedMonument) {
        updatedMonument.setId(id);
        return monumentService.save(updatedMonument);
    }

    @DeleteMapping("/{id}")
    public void deleteMonument(@PathVariable String id) {
        monumentService.deleteById(id);
    }
}

