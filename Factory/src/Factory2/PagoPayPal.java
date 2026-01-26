/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author labesp
 */
public class PagoPayPal implements Pagos {
 double totalPayPal=0;
    @Override
    public void procesarPago(double monto) {
        System.out.println("Se paga con PayPal la catidad de: " + monto);
        totalPayPal=totalPayPal+monto;
        System.out.println("Total PayPal Pagado" +totalPayPal);
    }
    
}
