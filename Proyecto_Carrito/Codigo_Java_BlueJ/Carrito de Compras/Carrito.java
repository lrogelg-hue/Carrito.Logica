import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> listaProductos;

    public Carrito() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        listaProductos.add(p);
    }

    public double cotizar() {
        double total = 0;
        for (Producto p : listaProductos) {
            total += p.getPrecio();
        }
        return total;
    }
    
    public ArrayList<Producto> getProductos() {
        return listaProductos;
    }
}