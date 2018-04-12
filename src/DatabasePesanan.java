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
        if(PESANAN_DATABASE.contains(baru)){
            if(baru.getStatusAktif()){
                return false;
            }
            else{
                PESANAN_DATABASE.add(baru);
                return true;
            }
        }
        else{
            PESANAN_DATABASE.add(baru);
            return true;
        }
    }
    
    /** 
    * Method yang digunakan untuk mengambil data pemesanan.
    * @return Pesanan mengembalikan data pemesanan.
    */
    public static Pesanan getPesanan(Room kamar)
    {
        for(Pesanan pesanan : PESANAN_DATABASE){
            if(pesanan.getRoom().equals(kamar)){
                return pesanan;
            }
        }
        return null;
    }

    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan pesanan : PESANAN_DATABASE){
            if(pesanan.getPelanggan().equals(pelanggan)){
                if(pesanan.getStatusAktif()){
                    return pesanan;
                }
            }
        }
        return null;
    }

    public static boolean removePesanan(Pesanan pesan)
    {
        for(Pesanan pesanan : PESANAN_DATABASE){
            if(pesanan.equals(pesan)) {
                if(pesanan.getRoom() != null){
                    Administrasi.pesananDibatalkan(pesanan);
                }
                else{
                    if(pesanan.getStatusAktif()){
                        pesanan.setStatusAktif(false);
                    }
                }
                if(PESANAN_DATABASE.remove(pesanan)){
                    return true;
                }
            }
        }
        return false;
    }
}
