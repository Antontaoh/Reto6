package main.service;

import main.model.Event;
import main.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    public Optional<Event> findById(String id) {
        return eventRepository.findById(id);
    }

    public Event save(Event event) {
        return eventRepository.save(event);
    }

    public void deleteById(String id) {
        eventRepository.deleteById(id);
    }
}

