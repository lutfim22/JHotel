
/**
 * class Pesanan untuk memodelkan pesanan.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.10
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;

    /**
     * Constructor for objects of class Pesanan.
     * 
     * @param biaya
     * @param pelanggan
     */
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        biaya = kamar.getDailyTariff()*jumlahHari;
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
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai biaya.
     * 
     * @param biaya
     */
    public void setBiaya()
    {
        
        biaya = kamar.getDailyTariff()*jumlahHari;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menenetukan nilai pelanggan.
     * 
     * @param baru
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan = pelanggan;
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
     * @param diproses
     */
    public void setStatusSelesai(boolean selesai)
    {
        isSelesai = selesai;
    }
    
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }
    
    /**
     * untuk menampilkan data pada class Pesanan.
     */
    public void printData()
    {
        System.out.printf("\nPesanan\n");
        //System.out.println("Nama Pelanggan: " +nama_pelanggan);
        System.out.println("Status layanan diproses: " +isDiproses);
        System.out.println("Status layanan selesai: " +isSelesai);
        System.out.println("Jumlah Hari: " +jumlahHari);
        System.out.println("Biaya: " +biaya);
    }
}
