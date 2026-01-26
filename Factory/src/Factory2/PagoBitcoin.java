/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author labesp
 */
public class PagoBitcoin implements Pagos {
double totalBitcoin=0;
    @Override
    public void procesarPago(double monto) {
      System.out.println("Se paga con Bitcoin la cantidad de: " + monto);
     totalBitcoin=totalBitcoin+monto;
      System.out.println("Total Bitcoin Pagado" +totalBitcoin);
}
    
}
