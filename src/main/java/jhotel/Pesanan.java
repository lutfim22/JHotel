package jhotel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * class Pesanan untuk memodelkan pesanan.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.05.14
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

    /**
     * Default Constructor for objects of class Pesanan.
     *
     */
    public Pesanan()
    {
        
    }
    
    /**
     * Overloading Constructor for objects of class Pesanan.
     * 
     * @param jumlahHari berisi jumlah hari
     * @param pelanggan objek Customer
     */

    public  Pesanan(double jumlahHari, Customer pelanggan)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        id = DatabasePesanan.getLastPesananID()+1;
        isAktif = true;
        tanggalPesan = new Date();
    }

    /**
     * mendaptkan nilai id pesanan
     *
     * @return id
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
        return pelanggan;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai status aktif.
     * 
     * @return isAktif
     */
    public boolean getStatusAktif()
    {
        return isAktif;
    }

    /**
     * mendaptakan nilai status diproses.
     *
     * @return isDiproses
     */
    public boolean getStatusDiproses()
    {
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
        return isSelesai;
    }
    
    public Room getRoom()
    {
        return kamar;
    }

    /**
     * mendaptakan nilai tanggal pesan
     *
     * @return tanggalPesan
     */
    public Date getTanggalPesan()
    {
        DateFormat df = new SimpleDateFormat("'DOB : 'dd MMMM yyyy");
        String hasil = df.format(tanggalPesan);
        System.out.println(hasil);
        return tanggalPesan;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai ID.
     * 
     * @param id berisi id pesanan
     */
    public void  setId(int id)
    {
        this.id = id;
    }

    /**
     * menentukan nilai biaya
     *
     */
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
     * @param pelanggan objek Costumer
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
     * @param diproses set status diproses
     */

    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai status selesai.
     * 
     * @param selesai status pesanan selesai
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
        
        if (isDiproses && !isSelesai){
            final_status = "DIPROSES";
        } else if (!isDiproses && !isSelesai){
            final_status = "KOSONG";
        } else if (!isDiproses && isSelesai){
            final_status = "SELESAI";
        }

        if (kamar != null) {
            return  "\nPesanan\n" +
                    "\nDibuat Oleh          : " +pelanggan.getNama()+
                    "\nJumlah hari          : " +jumlahHari+
                    "\nProses booking untuk : " +kamar.getHotel().getNama()+
                    "\nKamar Nomor          : " +kamar.getNomorKamar()+
                    "\ntipe kamar           : " +kamar.getTipeKamar()+
                    "\nStatus               : " +final_status;
        }
        return  "\nPesanan\n" +
                "\nDibuat Oleh          : " +pelanggan.getNama()+
                "\nJumlah hari          : " +jumlahHari+
                "\nProses booking untuk : null" +
                "\nKamar Nomor          : null" +
                "\ntipe kamar           : null" +
                "\nStatus               : " +final_status;
    }
}
