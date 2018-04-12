import java.util.ArrayList;

/**
 * berisi database pesanan.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.10
 */
public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;
    private static boolean exist = false;

    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return PESANAN_DATABASE;
    }

    public static int getLastPesananId()
    {
        return LAST_PESANAN_ID;
    }

    public static boolean addPesanan(Pesanan baru)
    {
        //Pesanan baru = baru.getStatusAkrif();

        if (baru.getStatusAkrif() == false) {
            PESANAN_DATABASE.add(baru);
            return true;
        }
        else{
            return false;
        }
        //list_pesanan = baru;
        //return false;
    }

    /** 
    *
    */

    /*
    public static boolean removePesanan()
    {   
        list_pesanan = null;
        return false;
    }
    */
    
    /** 
    * Method yang digunakan untuk mengambil data pemesanan.
    * @return Pesanan mengembalikan data pemesanan.
    */

    public static Pesanan getPesanan(int id)
    {
        for(int i=0;i < PESANAN_DATABASE.size();i++){
            if(PESANAN_DATABASE.get(i).getId() == id) {
                exist = true;
                break;
            }
        }
        if(exist) {
            return PESANAN_DATABASE.get(id);
        } else {
            return null;
        }
    }
    public static Pesanan getPesanan(Customer cust)
    {
        return null;
        //return list_pesanan;
    }

    /*
    /** 
    * Method yang digunakan untuk mengambil data pesanan dari dalam database.
    * @return String[] mengembalikan data dari database.
    */

    /*
    public static String[] getPesananDatabase()
    {
        return null;
    }
    */
    
    public static void pesananDibatalkan(Pesanan pesan)
    {
        
    }
}
