package main.controller.event;

import main.model.Event;
import main.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class EventWebController {

    @Autowired
    private EventService eventService;

    @GetMapping("/events")
    public String showEvents(Model model) {
        model.addAttribute("events", eventService.findAll());
        return "events/list";
    }

    @GetMapping("/events/{id}")
    public String showEventDetails(@PathVariable String id, Model model) {
        Optional<Event> event = eventService.findById(id);
        if (event.isPresent()) {
            model.addAttribute("event", event.get());
            return "events/detailed";
        } else {
            return "error/404";
        }
    }
}

