public class Usuario extends Persona {
    private String password;

    public Usuario(String strNombre, String password) {
        super(strNombre);
        this.password = password;
    }
    
    public boolean login(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}