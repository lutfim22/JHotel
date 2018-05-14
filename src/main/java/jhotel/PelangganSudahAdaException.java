package jhotel;

/**
 * class Customer untuk memodelkan Customer.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.05.14
 */
public class PelangganSudahAdaException extends Exception{
    private Customer pelanggan_error;

    /**
     * constructor untuk kelas PelangganSudahAdaException
     *
     * @param pelanggan_input objek Customer
     */
    public PelangganSudahAdaException(Customer pelanggan_input){
        super("Pelanggan dengan data: ");
        pelanggan_error = pelanggan_input;
    }

    /**
     * mendapatkan pesan error untuk exception
     *
     * @return string
     */
    public String getPesan(){
        return super.getMessage()+
                "\nID       : "+ pelanggan_error.getID()+
                "\nNama     : "+pelanggan_error.getNama()+
                "\nEmail    : "+pelanggan_error.getEmail()+
                "\nSudah terdaftar.";
    }
}
