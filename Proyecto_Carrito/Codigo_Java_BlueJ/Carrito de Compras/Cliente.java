public class Cliente extends Persona {
    private String direccionEnvio;

    public Cliente(String strNombre, String direccionEnvio) {
        super(strNombre);
        this.direccionEnvio = direccionEnvio;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }
}