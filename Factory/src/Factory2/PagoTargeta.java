/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author labesp
 */
public class PagoTargeta implements Pagos {
 double totalTargeta=0;
    @Override
    public void procesarPago(double monto) {
        System.out.println("Se paga con targeta debito/creditola catidad de: " + monto);
    totalTargeta=totalTargeta+monto;
        System.out.println("Total Targeta Pagado" +totalTargeta);
    }
    
}
