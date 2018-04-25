package jhotel;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * class JHotel sebagai class utama.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.20
 */
@SpringBootApplication
public class JHotel
{    
    /**
     * Main method untuk class JHotel.
     * 
     * @param args
     */
    public static void main(String args[])
            throws PelangganSudahAdaException, PelangganTidakDitemukanException, HotelSudahAdaException, HotelTidakDitemukanException,
                   RoomSudahAdaException, RoomTidakDitemukanException, PesananSudahAdaException, PesananTidakDitemukanException{

        SpringApplication.run(JHotel.class, args);
        /*
        System.out.print('\u000C');
        System.out.println("Welcome to JHotel\n");

        //Modul 7
        Customer C1 = new Customer("Luthfi", 14, 2,1997,"test.email@tes.com");
        Customer C2 = new Customer("Joko", 4, 2,1997,"bebas.email@tes.com");
        Customer C3 = new Customer("Test", 19, 4,1945,"error.email@tes.com");

        Hotel H1 = new Hotel("Alexis", new Lokasi(1,1,"desc"),7);
        Hotel H2 = new Hotel("Alexis", new Lokasi(1,1,"desc"),7);
        Hotel H3 = new Hotel("Alexis", new Lokasi(1,1,"desc"),7);
        Hotel H4 = new Hotel("Alexis", new Lokasi(1,1,"desc"),7);

        Room R1 = new SingleRoom(H1,"s201");
        Room R2 = new SingleRoom(H2,"s202");
        Room R3 = new SingleRoom(H3,"s203");
        Room R4 = new SingleRoom(H4,"s204");

        Pesanan P1 = new Pesanan(3,C1);
        Pesanan P2 = new Pesanan(3,C1);
        Pesanan P3 = new Pesanan(3,C1);

        //Percobaan Exception Sudah ada
        System.out.println("Tes Exception Customer Sudah Ada\n");
        try {
            DatabaseCustomer.addCustomer(C1);
        }
        catch(PelangganSudahAdaException e) {
            System.out.println(e.getPesan());
        }
        try {
            DatabaseCustomer.addCustomer(C2);
        }
        catch(PelangganSudahAdaException e) {
            System.out.println(e.getPesan());
        }
        try {
            DatabaseCustomer.addCustomer(C3);
            DatabaseCustomer.addCustomer(C3);
        }
        catch(PelangganSudahAdaException e) {
            System.out.println(e.getPesan());
        }

        System.out.println("\nTes Exception Hotel Sudah Ada\n");
        try {
            DatabaseHotel.addHotel(H1);
        }
        catch(HotelSudahAdaException e) {
            System.out.println(e.getPesan());
        }
        try {
            DatabaseHotel.addHotel(H2);
        }
        catch(HotelSudahAdaException e) {
            System.out.println(e.getPesan());
        }
        try {
            DatabaseHotel.addHotel(H3);
        }
        catch(HotelSudahAdaException e) {
            System.out.println(e.getPesan());
        }
        try {
            DatabaseHotel.addHotel(H4);
            DatabaseHotel.addHotel(H4);
        }
        catch(HotelSudahAdaException e) {
            System.out.println(e.getPesan());
        }

        System.out.println("\nTes Exception Room Sudah Ada\n");
        try {
            DatabaseRoom.addRoom(R1);
        } catch (RoomSudahAdaException e){
            System.out.println(e.getPesan());
        }
        try {
            DatabaseRoom.addRoom(R2);
        } catch (RoomSudahAdaException e){
            System.out.println(e.getPesan());
        }
        try {
            DatabaseRoom.addRoom(R3);
        } catch (RoomSudahAdaException e){
            System.out.println(e.getPesan());
        }
        try {
            DatabaseRoom.addRoom(R4);
            DatabaseRoom.addRoom(R4);
        } catch (RoomSudahAdaException e){
            System.out.println(e.getPesan());
        }

        System.out.println("\nTes Exception Pesanan Sudah Ada\n");
        try {
            DatabasePesanan.addPesanan(P1);
        } catch (PesananSudahAdaException e){
            System.out.println(e.getPesan());
        }
        try {
            DatabasePesanan.addPesanan(P2);
        } catch (PesananSudahAdaException e){
            System.out.println(e.getPesan());
        }
        try {
            DatabasePesanan.addPesanan(P3);
            DatabasePesanan.addPesanan(P3);
        } catch (PesananSudahAdaException e){
            System.out.println(e.getPesan());
        }

        /*
        //Percobaan Exception Tidak ditemukan
        System.out.println("\nTes Exception Customer Tidak Ditemukan");
        try{
            DatabaseCustomer.addCustomer(C1);
            DatabaseCustomer.removeCustomer(10);
            DatabaseCustomer.removeCustomer(1);
        }
        catch (PelangganTidakDitemukanException e){
            System.out.println(e.getPesan());
        }

        System.out.println("\nTes Exception Hotel Tidak Ditemukan");
        try {
            DatabaseHotel.addHotel(H1);
            DatabaseHotel.removeHotel(1);
            DatabaseHotel.removeHotel(1);
        }
        catch (HotelTidakDitemukanException e) {
            System.out.println(e.getPesan());
        }

        System.out.println("\nTes Exception Room Tidak Ditemukan");
        try {
            DatabaseRoom.addRoom(R1);
            DatabaseRoom.removeRoom(H1, "S201");
            DatabaseRoom.removeRoom(H1, "S201");
        }
        catch (RoomTidakDitemukanException e) {
            System.out.println(e.getPesan());
        }

        System.out.println("\nTes Exception Pesanan Tidak Ditemukan");
        try {
            DatabasePesanan.addPesanan(P1);
            DatabasePesanan.removePesanan(C1);
            DatabasePesanan.removePesanan(C1);
        }
        catch (PesananTidakDitemukanException e) {
            System.out.println(e.getPesan());
        }*/

        /*
        //Database Akhir
        try {
            DatabaseCustomer.addCustomer(C1);
            DatabaseCustomer.addCustomer(C2);
            DatabaseCustomer.addCustomer(C3);
            DatabaseCustomer.removeCustomer(1);
            DatabaseCustomer.removeCustomer(1);
            DatabaseHotel.addHotel(H1);
            DatabaseHotel.addHotel(H2);
            DatabaseHotel.addHotel(H3);
            DatabaseHotel.addHotel(H4);
            DatabaseHotel.addHotel(H4);
            DatabaseHotel.removeHotel(1);
            DatabaseHotel.removeHotel(1);
            DatabaseRoom.addRoom(R1);
            DatabaseRoom.addRoom(R2);
            DatabaseRoom.addRoom(R1);
            DatabaseRoom.removeRoom(H1, "S201");
            DatabaseRoom.removeRoom(H1, "S201");
            DatabasePesanan.addPesanan(P1);
            DatabasePesanan.addPesanan(P2);
            DatabasePesanan.addPesanan(P2);
            DatabasePesanan.removePesanan(C1);
            DatabasePesanan.removePesanan(C1);
            DatabaseCustomer.addCustomer(C3);
        }
        catch(PelangganSudahAdaException e) {
            System.out.println(e.getPesan());
        }
        catch(PelangganTidakDitemukanException e1) {
            System.out.println(e1.getPesan());
        }
        catch(HotelSudahAdaException e2) {
            System.out.println(e2.getPesan());
        }
        catch (RoomSudahAdaException e3){
            System.out.println(e3.getPesan());
        }
        catch (PesananSudahAdaException e4){
            System.out.println(e4.getPesan());
        }
        catch (HotelTidakDitemukanException e5) {
            System.out.println(e5.getPesan());
        }
        catch (RoomTidakDitemukanException e6) {
            System.out.println(e6.getPesan());
        }
        catch (PesananTidakDitemukanException e7) {
            System.out.println(e7.getPesan());
        }
        */

        /*
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
        */

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
