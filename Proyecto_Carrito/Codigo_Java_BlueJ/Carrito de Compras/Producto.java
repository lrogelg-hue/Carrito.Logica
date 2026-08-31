public class Producto {
    private String strNombre;
    private double precio;

    public Producto(String strNombre, double precio) {
        this.strNombre = strNombre;
        this.precio = precio;
    }

    public String getNombre() {
        return strNombre;
    }

    public double getPrecio() {
        return precio;
    }
}