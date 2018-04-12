
/**
 * Class SingleRoom untuk tipe room single.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.20
 */
public class SingleRoom extends Room
{
    // instance variables - replace the example below with your ow
    private static TipeKamar TIPE_KAMAR = TipeKamar.Single;
    
    public SingleRoom()
    {
        //
    }
    
    /**
     * Constructor for objects of class SingleRoom
     */
    public SingleRoom(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar, isAvailable, status_kamar);
    }
    
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }
}
