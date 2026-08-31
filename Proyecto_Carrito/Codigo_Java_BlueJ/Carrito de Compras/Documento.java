public class Documento {
    
    public void registrarYEnviar(Cliente cliente, Carrito carrito) {
        System.out.println("\n=== DOCUMENTO DE COMPRA ===");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Dirección de envío: " + cliente.getDireccionEnvio());
        System.out.println("Total Cotizado: $" + carrito.cotizar());
        System.out.println("Estado: Preparando para enviar.");
        System.out.println("===========================\n");
    }
}