
/**
 * berisi database pesanan.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.10
 */
public class DatabasePesanan
{
    private static Pesanan list_pesanan;

    /** 
    * 
    */
    
    public static boolean addPesanan(Pesanan baru)
    {
        list_pesanan = baru;
        return false;
    }

    /** 
    *
    */
    
    public static boolean removePesanan()
    {   
        list_pesanan = null;
        return false;
    }
    
    /** 
    * Method yang digunakan untuk mengambil data pemesanan.
    * @return Pesanan mengembalikan data pemesanan.
    */

    public static Pesanan getPesanan(Customer cust)
    {
        return list_pesanan;
    }
    
    /** 
    * Method yang digunakan untuk mengambil data pesanan dari dalam database.
    * @return String[] mengembalikan data dari database.
    */

    public static String[] getPesananDatabase()
    {
        return null;
    }

    /** 
    * Method yang digunakan untuk membatalkan pesanan.
    * @param Pesanan pesanan yang dibatalkan.
    */
    
    public static void pesananDibatalkan(Pesanan pesan)
    {
        
    }
}
