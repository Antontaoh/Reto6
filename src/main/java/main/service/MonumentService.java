package main.service;


import main.model.Monument;
import main.repository.MonumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonumentService {

    @Autowired
    private MonumentRepository monumentRepository;

    public List<Monument> findAll() {
        return monumentRepository.findAll();
    }

    public Optional<Monument> findById(String id) {
        return monumentRepository.findById(id);
    }

    public Monument save(Monument monument) {
        return monumentRepository.save(monument);
    }

    public void deleteById(String id) {
        monumentRepository.deleteById(id);
    }
}
