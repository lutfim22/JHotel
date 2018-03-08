
/**
 * class JHotel sebagai class utama.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.02.22
 */
public class JHotel
{
    
    public static void main(String args[])
    {
        Customer bebas = new Customer(22, "Luthfi");
        Lokasi bebas1 = new Lokasi(101, 102, "Lamongan Pedalaman");
        Hotel bebas2 = new Hotel("Baru", bebas1, 20);
        Pesanan bebas3 = new Pesanan(20000, bebas);
        bebas.setNama("yere");
        bebas.printData();
        
        DatabaseCustomer.addCustomer(bebas);
        DatabasePesanan.addPesanan(bebas3);
        
    }
    
    public JHotel()
    {
        //code
    }
}
