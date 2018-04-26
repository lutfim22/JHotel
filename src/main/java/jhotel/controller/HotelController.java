package jhotel.controller;
import jhotel.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HotelController {
    @RequestMapping("/hotel")
    public ArrayList<Hotel> hotelList()
    {
        ArrayList<Hotel> HOTEL_DATABASE = DatabaseHotel.getHotelDatabase();
        return HOTEL_DATABASE;
    }

    @RequestMapping("/hotel/{id}")
    public Hotel getHotel(@PathVariable int id) {
        Hotel hotel = DatabaseHotel.getHotel(id);
        return hotel;
    }
}
