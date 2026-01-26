/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author labesp
 */
public class PagosFactory {
     public static Pagos crearPagos(int tipo){
        switch(tipo){
            case 1:
                return new PagoEfectivo();
            case 2:
                return new PagoTranferencia();
            case 3:
                return new PagoTargeta();
            case 4:
                return new PagoPayPal();
            case 5:
                return new PagoBitcoin();
                
            default: System.out.println("Juguete no disponible");
            
        }
        return null;
    }
}
