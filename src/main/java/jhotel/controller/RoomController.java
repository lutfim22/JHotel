package jhotel.controller;
import jhotel.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RoomController {
    @RequestMapping("/vacantrooms")
    public ArrayList<Room> vacantRoom()
    {
        ArrayList<Room> ROOM_DATABASE = DatabaseRoom.getVacantRooms();
        return ROOM_DATABASE;
    }

    @RequestMapping("/hotel/{id_hotel}/{nomor_kamar}")
    public Room getRoom(@PathVariable int id_hotel, @PathVariable String nomor_kamar){
        Room room = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel),nomor_kamar);
        return room;
    }
}
