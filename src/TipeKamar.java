
/**
 * Enumeration class TipeKamar - berisi tipe-tipe kamar pada JHotel.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.10
 */
public enum TipeKamar
{
    Single("Single"), Double("Double"), Premium("Premium");
    
    private String deskripsi;
    
    TipeKamar(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }
    
    public String toString()
    {
        return deskripsi;
    }
}
