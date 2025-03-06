package main.controller.restaurant;

import main.model.Restaurant;
import main.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class RestaurantWebController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public String showRestaurants(Model model) {
        model.addAttribute("restaurants", restaurantService.findAll());
        return "restaurants/list";
    }

    @GetMapping("/restaurants/{id}")
    public String showRestaurantDetails(@PathVariable String id, Model model) {
        Optional<Restaurant> restaurant = restaurantService.findById(id);
        if (restaurant.isPresent()) {
            model.addAttribute("restaurant", restaurant.get());
            return "restaurants/detailed";
        } else {
            return "error/404";
        }
    }
}

