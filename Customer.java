import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.*;
/**
 * class Customer untuk memodelkan Customer.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.10
 */
public class Customer
{
    // instance variables - replace the example below with your own
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    private String string;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
        Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        +"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", Pattern.CASE_INSENSITIVE);
    private GregorianCalendar obj1;
    
    /**
     * Constructor for objects of class Customer.
     * 
     * @param id
     * @param nama
     */
    public Customer(int id, String nama, int tanggal, int bulan, int tahun)
    {
        this.id = id;
        this.nama = nama;
    }
    
    
    public Customer(int id, String nama, Date dob)
    {
        this.id = id;
        this.nama = nama;
        this.dob = dob;
    }

    /**
     * Accessor for objects of class Customer
     * untuk mendapatkan nilai id.
     * 
     * @return id
     */
    public int getID()
    {
        // put your code here
        
        return id;
    }
    
    /**
     * Accessor for objects of class Customer
     * untuk mendapatkan nilai nama.
     * 
     * @return nama
     */
    public String getNama()
    {
        //put your code here
        
        return nama;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public Date getDOB()
    {
        return dob;
    }
    
    /**
     * Mutator for objects of class Customer
     * untuk menentukan nilai id.
     * 
     * @param id
     */
    public void setID(int id)
    {
       this.id = id;
    }
    
    /**
     * Mutator for objects of class Customer
     * untuk menentukan nilai id.
     * 
     * @param nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    public void setEmail(String email)
    {
        
        //Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email)
        if(validate(email) == true)
        {
            this.email = email;
            System.out.println("Email: "+email+" valid");
        }else{
            this.email = email;
            System.out.println("Email: "+email+" tidak valid");
        }
    }
    
    public static boolean validate(String emailStr) 
    {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
    
    public void setDOB(Date dob)
    {
        this.dob = dob;
    }
    
    public String toString()
    {
        return string;
    }
    
    /**
     * untuk menampilkan data pada class Customer.
     */
    public void printData()
    {
        System.out.printf("\nCustomer\n");
        System.out.println("ID: " +id);
        System.out.println("Nama: " +nama);
    }
}
