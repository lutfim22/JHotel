import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
//import java.util.regex.*;
import java.text.*;
/**
 * class Pesanan untuk memodelkan pesanan.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.10
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private  int id;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;
    //private String string;

    public Pesanan()
    {
        
    }
    
    /**
     * Constructor for objects of class Pesanan.
     * 
     *
     */

    public  Pesanan(double jumlahHari, Customer pelanggan)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        isAktif = true;
        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date d1 = c.getTime(); //the midnight, that's the first second of the day.
    }
    /*
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar, int tanggal, int bulan, int tahun)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        biaya = kamar.getDailyTariff()*jumlahHari;
        this.tanggalPesan = new GregorianCalendar(tahun,bulan,tanggal).getTime();
    }
    
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar, Date tanggalPesan)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        biaya = kamar.getDailyTariff()*jumlahHari;
        this.tanggalPesan = tanggalPesan;
    }
    */

    public int getId()
    {
        return id;
    }

    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai biaya.
     * 
     * @return biaya
     */
    public double getBiaya()
    {
        //code
        
        return biaya;
    }
    
    public double getJumlahHari()
    {
        return jumlahHari;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai pelanggan.
     * 
     * @return pelanggan
     */
    public Customer getPelanggan()
    {
        //code
        return pelanggan;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai status diproses.
     * 
     * @return isDiproses
     */
    public boolean getStatusAkrif()
    {
        return isAktif;
    }
    public boolean getStatusDiproses()
    {
        //code
        
        return isDiproses;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai status selesai.
     * 
     * @return isSelesai
     */
    public boolean getStatusSelesai()
    {
        //code
        
        return isSelesai;
    }
    
    public Room getRoom()
    {
        return kamar;
    }
    
    public Date getTanggalPesan()
    {
        DateFormat df = new SimpleDateFormat("'DOB : 'dd MMMM yyyy");
        String hasil = df.format(tanggalPesan);
        System.out.println(hasil);
        return tanggalPesan;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai biaya.
     * 
     *
     */
    public void  setId(int id)
    {
        this.id = id;
    }
    public void setBiaya()
    {
        
        biaya = kamar.getDailyTariff()*jumlahHari;
    }
    
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menenetukan nilai pelanggan.
     * 
     *
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan = pelanggan;
    }


    public void setStatusAktif(boolean aktif) {
        isAktif = aktif;
    }

    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai status diproses.
     * 
     * @param diproses
     */

    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai status selesai.
     * 
     *
     */
    public void setStatusSelesai(boolean selesai)
    {
        isSelesai = selesai;
    }
    
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }
    
    public void setTanggalPesan(Date tanggalPesan)
    {
        
        this.tanggalPesan = tanggalPesan;
    }
    
    public String toString()
    {
        String final_status = "KOSONG";
        
        if (isDiproses == true && isSelesai == false){
            final_status = "DIPROSES";
        } else if (isDiproses == false && isSelesai == false){
            final_status = "KOSONG";
        } else if (isDiproses == false && isSelesai == true){
            final_status = "SELESAI";
        }
        
        return  "Dibuat Oleh " +pelanggan.getNama() +
                ".Proses booking untuk" +kamar.getHotel()+
                "Kamar Nomor " + kamar.getNomorKamar()+
                "dengan tipe kamar yang diinginkan "+kamar.getTipeKamar()+
                ". Status :" +final_status+ ".";
    }
}
