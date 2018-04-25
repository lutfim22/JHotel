package jhotel;
import java.util.ArrayList;

/**
 * berisi database hotel.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.10
 */
public class DatabaseHotel
{
    // instance variables - replace the example below with your own
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;

    public static ArrayList<Hotel> getHotelDatabase()
    {
        return HOTEL_DATABASE;
    }

    public static int getLastHotelID()
    {
        return LAST_HOTEL_ID;
    }
    /**
     * untuk menambahkan data hotel.
     * 
     * @return false
     */
    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException
    {
        for(Hotel hotel : HOTEL_DATABASE){
            if(hotel.getID() == baru.getID() || (hotel.getNama().equals(baru.getNama()) && hotel.getLokasi().equals(baru.getLokasi()))){
                throw new HotelSudahAdaException(baru);
                //return false;
            }
        }
        HOTEL_DATABASE.add(baru);
        LAST_HOTEL_ID = baru.getID();
        return true;
    }

    public static Hotel getHotel(int id)
    {
        for(Hotel hotel : HOTEL_DATABASE){
            if(hotel.getID() == id){
                return hotel;
            }
        }
        return null;
    }
    
    /**
     * untuk menghapus data hotel.
     * 
     * @return false
     */
    public static boolean removeHotel(int id) throws HotelTidakDitemukanException
    {
        for(Hotel hotel : HOTEL_DATABASE) {
            if (hotel.getID() == id) {
                ArrayList<Room> LIST_ROOM = DatabaseRoom.getRoomsFromHotel(hotel);
                for (Room kamar : LIST_ROOM){
                    try {
                        DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                    }
                    catch (RoomTidakDitemukanException e){
                        System.out.println(e.getPesan());
                    }
                }
                if (HOTEL_DATABASE.remove(hotel)){
                    return true;
                }

            }
        }
        return false;
    }
}
