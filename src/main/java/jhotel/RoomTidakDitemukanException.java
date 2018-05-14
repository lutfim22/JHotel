package jhotel;

/**
 * exception saat kelas room tidak ditemukan (null)
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.05.14
 */
public class RoomTidakDitemukanException extends Exception{
    private Hotel hotel_error;
    private String room_error;

    /**
     * constructor untuk kelas RoomTidakDitemukanException
     *
     * @param hotel_input objek Hotel
     * @param room_input objek Room
     */
    public RoomTidakDitemukanException(Hotel hotel_input, String room_input){
        super("Kamar yang terletak di : ");
        hotel_error = hotel_input;
        room_error = room_input;
    }

    /**
     * mendapatkan pesan error untuk exception
     *
     * @return string
     */
    public String getPesan(){
        return super.getMessage() + hotel_error + " dan dengan nomor kamar " + room_error + " tidak ditemukan.";
    }
}
