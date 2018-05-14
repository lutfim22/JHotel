package jhotel;

/**
 * Class DoubleRoom untuk tipe room double.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.05.14
 */
public class DoubleRoom extends Room
{
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR = TipeKamar.Double;

    /**
     * default constructor for object of class DoubleRoom
     */
    public DoubleRoom()
    {
        //
    }
    
    /**
     * Overloading constructor for objects of class DoubleRoom
     *
     * @param hotel objek hotel
     * @param nomor_kamar nomor kamar
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar)//, StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
        setDailyTariff(75000);
    }

    /**\
     * mengambik nilai objek customer2
     *
     * @return customer2
     */
    public Customer getCustomer2()
    {
        return customer2;
    }
    
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }

    /**
     * menentukan nilai objek customer2
     *
     * @param customer2 objek customer2
     */
    public void setCustomer2(Customer customer2)
    {
        this.customer2 = customer2;
    }

    /**
     * menentukan daily tarif untuk class DoubleRoom
     *
     * @param dailytariff nilai daily tariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
}
