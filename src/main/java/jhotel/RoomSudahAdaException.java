package jhotel;

/**
 * class Customer untuk memodelkan Customer.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.05.14
 */
public class RoomSudahAdaException extends Exception{
    private Room room_error;

    /**
     * constructor untuk kelas RoomSudahAdaException
     *
     * @param room_input objek Room
     */
    public RoomSudahAdaException(Room room_input){
        super("Kamar dengan nomor ruang ");
        room_error = room_input;
    }

    /**
     * mendapatkan pesan error untuk exception
     *
     * @return string
     */
    public String getPesan(){
        return super.getMessage() + room_error.getNomorKamar() + " pada " + room_error.getHotel() + "\nSudah terdaftar.";
    }
}
