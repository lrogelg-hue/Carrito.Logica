public class Main {
    public static void main(String[] args) {
        // 1. Crear el cliente y su método de pago
        Cliente cliente1 = new Cliente("Luis", "Ciudad de Guatemala, Zona 1");
        Tarjeta tarjeta1 = new Tarjeta("1234567812345678", "Luis");
        
        // 2. Crear los productos disponibles
        Producto laptop = new Producto("Laptop Dell", 850.00);
        Producto mouse = new Producto("Mouse Inalámbrico", 25.50);
        
        // 3. Iniciar el carrito y agregar productos
        Carrito miCarrito = new Carrito();
        miCarrito.agregarProducto(laptop);
        miCarrito.agregarProducto(mouse);
        
        // 4. Cotizar el total
        double totalAPagar = miCarrito.cotizar();
        System.out.println("Total cotizado en el carrito: $" + totalAPagar);
        
        // 5. Validar el pago con el Banco
        Banco banco = new Banco();
        System.out.println("\nIniciando proceso de pago...");
        
        if (banco.verificarTarjeta(tarjeta1)) {
            banco.pagar(totalAPagar, tarjeta1);
            
            // 6. Si el pago es exitoso, registrar y enviar el documento
            Documento recibo = new Documento();
            recibo.registrarYEnviar(cliente1, miCarrito);
        } else {
            System.out.println("El proceso de compra fue cancelado por el banco.");
        }
    }
}