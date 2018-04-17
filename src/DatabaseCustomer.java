import java.util.ArrayList;

/**
 * berisi Database Customer.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.10
 */
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    public static ArrayList<Customer> getCustomerDatabase() {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }

    /**
     * untuk menambahkan data customer.
     * 
     * @return false
     */
    public static boolean addCustomer(Customer baru)
    {
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getID() != baru.getID()){
                CUSTOMER_DATABASE.add(baru);
                LAST_CUSTOMER_ID = baru.getID();
                return true;
            }
        }
        return false;
    }

    public Customer getCustomer(int id)
    {
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getID() == id){
                return customer;
            }
        }
        return null;
    }
    
    /**
     * untuk menghapus data customer.
     * 
     * @return false
     */
    public static boolean removeCustomer(int id)
    {
        for(Customer customer : CUSTOMER_DATABASE){
            if (customer.getID() == id){
                Pesanan pesan = DatabasePesanan.getPesananAktif(customer);
                if(pesan != null){
                    DatabasePesanan.removePesanan(pesan);
                }
                CUSTOMER_DATABASE.remove(customer);
                return true;
            }
        }
        return false;
    }
}
