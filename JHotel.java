
/**
 * class JHotel sebagai class utama.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.10
 */
public class JHotel
{    
    /**
     * Main method untuk class JHotel.
     * 
     * @param args[]
     */
    public static void main(String args[])
    {
        Lokasi l = new Lokasi(69,69,"bebas");
        
        Hotel h = new Hotel("ASaasd",l,7);
        SingleRoom sr = new SingleRoom(h,"222",true,StatusKamar.Booked);
        Customer c = new Customer(22,"Luthfi");
        Room r = sr;
        //Room r = new Room(h,);
        Pesanan p = new Pesanan(3,c,r);
        
        System.out.println("Welcome to JHotel");
        l.printData();
        c.printData();
        h.printData();
        
        Administrasi.pesananDitugaskan(p, r);
        r.printData();
        p.printData();
        
        /* Modul 3
        Lokasi lokasi = new Lokasi(69, 69, "Jauh");
        Customer customer = new Customer(22, "James");
        Hotel hotel = new Hotel("Alexis", lokasi, 7);
        Room room = new Room(hotel, "S201", true, customer, 20000, StatusKamar.Booked);
        Pesanan pesan = new Pesanan(12000, customer);
        pesan.setTipeKamar(TipeKamar.Single);
        
        System.out.println("Welcome to JHotel");
        lokasi.printData();
        customer.printData();
        hotel.printData();
        
        System.out.println("\n====================Method 1====================");
        Administrasi.pesananDitugaskan(pesan, room);
        room.printData();
        pesan.printData();
        
        System.out.println("\n====================Method 2====================");
        Administrasi.pesananDibatalkan(room);
        room.printData();
        pesan.printData();
        
        Administrasi.pesananDitugaskan(pesan, room);
        System.out.println("\n====================Method 3====================");
        Administrasi.pesananDibatalkan(pesan);
        room.printData();
        pesan.printData();
        
        Administrasi.pesananDitugaskan(pesan, room);
        System.out.println("\n====================Method 4====================");
        Administrasi.pesananSelesai(room);
        room.printData();
        pesan.printData();
        
        Administrasi.pesananDitugaskan(pesan, room);
        System.out.println("\n====================Method 5====================");
        Administrasi.pesananSelesai(pesan);
        room.printData();
        pesan.printData();
        */
    }
    
    /**
     * Constructor untuk class JHotel.
     */
    public JHotel()
    {
        //code
    }
}
