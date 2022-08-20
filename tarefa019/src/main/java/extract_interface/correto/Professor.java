package extract_interface.correto;

public class Professor extends Pessoa implements Conta{
    private String registro;

    @Override
    public boolean fazerLogin(String username, String password){
        return true;
    }
}
