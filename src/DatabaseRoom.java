import java.util.ArrayList;
/**
 * berisi database ruangan.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.10
 */
public class DatabaseRoom
{
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

    /**
     *
     * @return ROOM_DATABASE
     */
    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }

    /**
     *
     * @param baru berisi objek Room
     */
    public static boolean addRoom(Room baru) throws RoomSudahAdaException
    {
        for(Room kamar : ROOM_DATABASE){
            if(kamar.getHotel().equals(baru.getHotel()) && kamar.getNomorKamar().equals(baru.getNomorKamar())){
                throw new RoomSudahAdaException(baru);
                //return false;
            }
        }
        ROOM_DATABASE.add(baru);
        return true;
    }

    /**
     *
     * @param hotel berisi objek Hotel
     * @param nomor_kamar berisi nomor kamar
     * @return kamar
     */
    public static Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for(Room kamar : ROOM_DATABASE){
            if(kamar.getHotel().equals(hotel) && kamar.getNomorKamar().equals(nomor_kamar)){
                return kamar;
            }
        }
        return null;
    }

    /**
     *
     * @param hotel berisi objek Hotel
     * @return tempRoom
     */
    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel)
    {
        ArrayList<Room> tempRoom = new ArrayList<Room>();

        for(Room kamar : ROOM_DATABASE){
            if(kamar.getHotel().equals(hotel)){
                tempRoom.add(kamar);
            }
        }
        return tempRoom;
    }

    /**
     *
     * @return tempRoom
     */
    public static ArrayList<Room> getVacantRooms()
    {
        ArrayList<Room> tempRoom = new ArrayList<Room>();

        for(Room kamar : ROOM_DATABASE){
            if(kamar.getStatusKamar().equals(StatusKamar.Vacant)){
                tempRoom.add(kamar);
            }
        }
        return tempRoom;
    }

    /**
     *
     * @param hotel berisi objek Hotel
     * @param nomor_kamar berisi nomor kamar
     * @return true
     */
    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException
    {
        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel) && kamar.getNomorKamar().equals(nomor_kamar)){
                Administrasi.pesananDibatalkan(kamar);
                if(ROOM_DATABASE.remove(kamar)){
                    return true;
                }
            }
        }
        throw new RoomTidakDitemukanException(hotel, nomor_kamar);
        //return false;
    }
}
