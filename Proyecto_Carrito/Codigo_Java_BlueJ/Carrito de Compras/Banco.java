
public class Banco {
    
    public boolean verificarTarjeta(Tarjeta tarjeta) {
        // Simulación lógica: aprueba si la tarjeta tiene 16 dígitos
        if (tarjeta != null && tarjeta.getNumero().length() == 16) {
            System.out.println("Banco: Transacción aprobada.");
            return true;
        } else {
            System.out.println("Banco: Tarjeta declinada.");
            return false;
        }
    }
    
    public void pagar(double monto, Tarjeta tarjeta) {
        if (verificarTarjeta(tarjeta)) {
            System.out.println("Pago de $" + monto + " procesado con éxito.");
        }
    }
}