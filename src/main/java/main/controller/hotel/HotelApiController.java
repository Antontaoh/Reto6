package main.controller.hotel;

import main.model.Hotel;
import main.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hotels")
public class HotelApiController {

    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Hotel> getHotelById(@PathVariable String id) {
        return hotelService.findById(id);
    }

    @PostMapping
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return hotelService.save(hotel);
    }

    @PutMapping("/{id}")
    public Hotel updateHotel(@PathVariable String id, @RequestBody Hotel updatedHotel) {
        updatedHotel.setId(id);
        return hotelService.save(updatedHotel);
    }

    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable String id) {
        hotelService.deleteById(id);
    }
}

