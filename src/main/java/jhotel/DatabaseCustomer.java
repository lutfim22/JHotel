package jhotel;

import java.util.ArrayList;

/**
 * berisi Database Customer.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.05.14
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * method untuk membuat arraylist berisi customer
     *
     * @return CUSTOMER_DATABASE
     */
    public static ArrayList<Customer> getCustomerDatabase() {
        return CUSTOMER_DATABASE;
    }

    /**
     * untuk mendapatkan ID dari customer terakhir
     *
     * @return LAST_CUSTOMER_ID
     */
    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }

    /**
     * untuk menambahkan data customer.
     * 
     * @return true
     */
    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException
    {
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getID() == baru.getID() || customer.getEmail().equals(baru.getEmail())){
                throw new PelangganSudahAdaException(baru);
            }
        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }

    /**
     * untuk mendapatkan customer dengan id yang ditentukan
     *
     * @param id menentukan id customer
     * @return customer
     */
    public static Customer getCustomer(int id)
    {
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getID() == id){
                return customer;
            }
        }
        return null;
    }

    /**
     * untuk mendapatkan customer yang login menggunakan email dan passwordnya.
     *
     * @param email menentukan nilai email
     * @param password menentukan nilai password
     * @return customer
     */
    public static Customer getCustomerLogin(String email, String password)
    {
        for(Customer customer : CUSTOMER_DATABASE){
            if(customer.getEmail().equals(email) && customer.getPassword().equals(password)){
                return customer;
            }
        }
        return null;
    }
    /**
     * untuk menghapus data customer.
     * 
     * @return true
     */
    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException
    {
        for(Customer customer : CUSTOMER_DATABASE){
            if (customer.getID() == id){
                Pesanan pesan = DatabasePesanan.getPesananAktif(customer);
                try {
                    DatabasePesanan.removePesanan(customer);
                }
                catch (PesananTidakDitemukanException e){
                    System.out.println(e.getPesan());
                }
                if (CUSTOMER_DATABASE.remove(customer)){
                    return true;
                }
            }
        }
        return false;
    }
}
