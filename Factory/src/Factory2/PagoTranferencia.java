/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author labesp
 */
public class PagoTranferencia implements Pagos
{
double totalTrasferencia=0;
    @Override
    public void procesarPago(double monto) {
        System.out.println("Se paga con tranferencia la cantidad de: "+ monto);
    totalTrasferencia=totalTrasferencia + monto;
    System.out.println("Total Trsanferencia Pagado" + totalTrasferencia );
}
    
}
