import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.*;
import java.text.*;
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

    /**
     * Constructor default untuk objek dari class Customer.
     */
    public Customer()
    {
        //code
    }
    
    /**
     * Overloading Constructor for objects of class Customer.
     *
     * @param nama berisi nama Customer
     * @param tanggal berisi tanggal
     * @param bulan berisi bulan
     * @param tahun berisi tahun
     */
    public Customer(String nama, int tanggal, int bulan, int tahun)
    {
        id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = new GregorianCalendar(tahun,bulan,tanggal).getTime();
    }

    /**
     * Overloading Constructor for objects of class Customer.
     *
     * @param nama berisi nama customer.
     * @param dob berisi objek Date.
     */
    public Customer(String nama, Date dob)
    {
        id = DatabaseCustomer.getLastCustomerID()+1;
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
     * @return nama berisi nama customer.
     */
    public String getNama()
    {
        //put your code here
        
        return nama;
    }

    /**
     * untuk mendapatikan nilai email.
     *
     * @return email berisi email.
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * untuk mendapatkan nilai tanggal bertipe Date
     *
     * @return dob
     */
    public Date getDOB()
    {
        
        DateFormat df = new SimpleDateFormat("'DOB : 'dd MMMM yyyy");
        String hasil = df.format(dob);
        System.out.printf(hasil);
        
        return dob;
    }
    
    /**
     * Mutator for objects of class Customer
     * untuk menentukan nilai id.
     * 
     * @param id berisi id.
     */
    public void setID(int id)
    {
       this.id = id;
    }
    
    /**
     * Mutator for objects of class Customer
     * untuk menentukan nilai id.
     * 
     * @param nama berisi nama.
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    /**
     * untuk menentukan nilai email.
     *
     * @param email berisi email.
     */
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

    /**
     * untuk validasi pattern email.
     *
     * @param emailStr berisi email yang ingin divaildasi.
     * @return mathcer.find()
     */
    public static boolean validate(String emailStr) 
    {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    /**
     * untuk menentukan nilai tanggal
     *
     * @param dob objek Date
     */
    public void setDOB(Date dob)
    {
        this.dob = dob;
    }

    /**
     * untuk mencetak String pada objek Customer
     *
     */
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this) != null){
            return "\nCustomer\n"+
                   "\nCustomer ID   : " +id+
                   "\nName          : " +nama+
                   "\nE-Mail        : " +email+
                   "\nDate of Birth : " +getDOB()+
                   "\nBooking order is in progress";        
        }
       
        else{
            return "\nCustomer\n"+
                   "\nCustomer ID   : " +id+
                   "\nName          : " +nama+
                   "\nE-Mail        : " +email+
                   "\nDate of Birth : " +getDOB();        
        }
        //return string;
    }
}
