
public class PelangganSudahAdaException extends Exception{
    private Customer pelanggan_error;

    public PelangganSudahAdaException(){

    }

    public PelangganSudahAdaException(Customer pelanggan_input){
        super("Pelanggan dengan data: ");
        pelanggan_error = pelanggan_input;
    }

    public String getPesan(){
        return super.getMessage()+
                "\nID       : "+ pelanggan_error.getID()+
                "\nNama     : "+pelanggan_error.getNama()+
                "\nEmail    : "+pelanggan_error.getEmail()+
                "\nSudah terdaftar.";
    }
}
