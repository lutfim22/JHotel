import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.*;
/**
 * class JHotel sebagai class utama.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.20
 */
public class JHotel
{    
    /**
     * Main method untuk class JHotel.
     * 
     * @param args
     */
    public static void main(String args[])
    {
        System.out.print('\u000C');
        System.out.println("Welcome to JHotel");

        //Modul6
        DatabaseCustomer.addCustomer(new Customer("Luthfi", 18, 4, 2018));
        DatabaseCustomer.addCustomer(new Customer("Test", 18, 4, 2018));
        DatabaseCustomer.addCustomer(new Customer("Test1", 18, 4, 2018));

        for(Customer cust : DatabaseCustomer.getCustomerDatabase()){
            System.out.println(cust);
        }

        DatabaseHotel.addHotel(new Hotel("Hotel1", new Lokasi(1,1,"desc"),7));
        DatabaseHotel.addHotel(new Hotel("Hotel1", new Lokasi(1,1,"desc1"),7));
        DatabaseHotel.addHotel(new Hotel("Hotel1", new Lokasi(1,1,"desc2"),7));

        for(Hotel hotel : DatabaseHotel.getHotelDatabase()){
            System.out.println(hotel);
        }

        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1),"s201"));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2),"s202"));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3),"s203"));

        for(Room kamar : DatabaseRoom.getRoomDatabase()){
            System.out.println(kamar);
        }


        DatabasePesanan.addPesanan(new Pesanan(1,DatabaseCustomer.getCustomer(1)));
        DatabasePesanan.addPesanan(new Pesanan(2,DatabaseCustomer.getCustomer(2)));
        DatabasePesanan.addPesanan(new Pesanan(3,DatabaseCustomer.getCustomer(3)));

        for(Pesanan pesanan : DatabasePesanan.getPesananDatabase()){
            System.out.println(pesanan);
        }

        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)),DatabaseRoom.getRoom(DatabaseHotel.getHotel(1),"s201"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)),DatabaseRoom.getRoom(DatabaseHotel.getHotel(2),"s202"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)),DatabaseRoom.getRoom(DatabaseHotel.getHotel(3),"s203"));
        for(Pesanan pesanan : DatabasePesanan.getPesananDatabase()){
            System.out.println(pesanan);
        }

        Administrasi.pesananDibatalkan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)));
        Administrasi.pesananDibatalkan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)));
        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)));
        for (Pesanan pesanan1 : DatabasePesanan.getPesananDatabase()){
            System.out.println(pesanan1);
        }


        /*Modul5
        Customer testing = new Customer(22, "Luthfi", 14, 00, 2018);
        //testing.getDOB();
      
        Pesanan pesanan = new Pesanan();

        DatabasePesanan.addPesanan(pesanan);
        
        System.out.println("\n\ntoString kelas Customer untuk kondisi pertama : \n\n");
        System.out.println(testing.toString());
        DatabasePesanan.removePesanan();
        System.out.println("\n\ntoString kelas Customer untuk kondisi kedua   : \n\n");
        System.out.println(testing.toString());
        
        Lokasi lokasi = new Lokasi(69, 69, "Jauh");
        Hotel hotel = new Hotel("Alexis", lokasi, 7);
        Room kamar = new SingleRoom(hotel, "S201", true, StatusKamar.Vacant);
        Pesanan pesan = new Pesanan(10, testing, kamar, 14, 00, 2018);

        kamar.setPesanan(pesan);
        
        System.out.println("\n\ntoString kelas Room untuk kondisi pertama : \n\n");
        System.out.println(kamar.toString());
        kamar.setStatusAvailable(false);
        System.out.println("\n\ntoString kelas Room untuk kondisi kedua   : \n\n");
        System.out.println(kamar.toString());
        
        pesan.setStatusDiproses(true);
        pesan.setStatusSelesai(false);
        
        System.out.println("\n\ntoString kelas Pesanan untuk kondisi pertama : \n\n");
        System.out.println(pesan.toString());

        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);

        System.out.println("\n\ntoString kelas Pesanan untuk kondisi kedua   : \n\n");
        System.out.println(pesan.toString());
        
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(true);

        System.out.println("\n\ntoString kelas Pesanan untuk kondisi ketiga   : \n\n");
        System.out.println(pesan.toString());
        */
                
        
        /* Modul4
        Lokasi lokasi = new Lokasi(69,69,"bebas");
        Hotel hotel = new Hotel("ASaasd",lokasi,7);
        Room singleRoom = new SingleRoom(hotel,"222",true,StatusKamar.Booked);
        Customer customer = new Customer(22,"Luthfi");
        singleRoom.setDailyTariff(2000);
        Pesanan pesanan = new Pesanan(3,customer,singleRoom);
        
        lokasi.printData();
        customer.printData();
        hotel.printData();
        
        Administrasi.pesananDitugaskan(pesanan, singleRoom);
        singleRoom.printData();
        pesanan.printData();
        
        if(singleRoom instanceof DoubleRoom){
            System.out.println("\nBenar Double Room");
        }
        else{
            System.out.println("\nBukan Double Room");
        }
        
        Room doubleRoom = new DoubleRoom(hotel,"222",true,StatusKamar.Processed);
        doubleRoom.setDailyTariff(20000);
        Pesanan p1 = new Pesanan(3,customer,doubleRoom);
        
        Administrasi.pesananDitugaskan(p1, doubleRoom);
        doubleRoom.printData();
        p1.printData();
        
        Administrasi.pesananDibatalkan(doubleRoom);
        doubleRoom.printData();
        p1.printData();
        
        if(doubleRoom instanceof DoubleRoom){
            System.out.println("\nBenar Double Room");
        }
        else{
            System.out.println("\nBukan Double Room");
        }
        
        Room premiumRoom = new PremiumRoom(hotel,"222",true,StatusKamar.Booked);
        premiumRoom.setDailyTariff(20000);
        Pesanan p2 = new Pesanan(3,customer,premiumRoom);
        
        Administrasi.pesananDitugaskan(p2, premiumRoom);
        premiumRoom.printData();
        p2.printData();
        */
        
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
