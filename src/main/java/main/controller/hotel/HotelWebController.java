package main.controller.hotel;

import main.model.Hotel;
import main.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class HotelWebController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/hotels")
    public String showHotels(Model model) {
        model.addAttribute("hotels", hotelService.findAll());
        return "hotels/list";
    }

    @GetMapping("/hotels/{id}")
    public String showHotelDetails(@PathVariable String id, Model model) {
        Optional<Hotel> hotel = hotelService.findById(id);
        if (hotel.isPresent()) {
            model.addAttribute("hotel", hotel.get());
            return "hotels/detailed";
        } else {
            return "error/404";
        }
    }
}

