
/**
 * class Customer untuk memodelkan Customer.
 *
 * @author (Luthfi Musthafa_1506673656)
 * @version (2018.03.01)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    protected int id;
    protected String nama;
    
    /**
     * Constructor for objects of class Customer
     * 
     * @param id, nama.
     */
    public Customer(int id, String nama)
    {
        //instance variable
        this.id = id;
        this.nama = nama;
    }

    /**
     * Accessor for objects of class Customer
     * untuk mendapatkan nilai id
     * 
     * @return id.
     */
    public int getID()
    {
        // put your code here
        
        return id;
    }
    
    /**
     * Accessor for objects of class Customer
     * untuk mendapatkan nilai nama
     * 
     * @return nama.
     */
    public String getNama()
    {
        //put your code here
        
        return nama;
    }
    
    /**
     * Mutator for objects of class Customer
     * untuk menentukan nilai id
     * 
     * @param id.
     */
    public void setID(int id)
    {
       //put your code here
       this.id = id;
    }
    
    /**
     * Mutator for objects of class Customer
     * untuk menentukan nilai id
     * 
     * @param nama.
     */
    public void setNama(String nama)
    {
        //code
        this.nama = nama;
    }
    
    public void printData()
    {
        
    }
}
