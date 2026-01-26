/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory2;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class FactoryPagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int opcion;
        int monto;
        do{
            System.out.println("----BANCO----");
            System.out.println("1. Pago Efectivo");
            System.out.println("2. Pago Transferenci");
            System.out.println("3. Pago Targeta");
            System.out.println("4. Pago PayPal");
            System.out.println("5. Pago Bitcoin");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opcion:");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el monto a pagar");
            monto=sc.nextInt();
            Pagos pago  = PagosFactory.crearPagos(opcion);
            
            if(pago !=null){
               pago.procesarPago(monto);
            }else{
                System.out.println("No se ha podido Pagar");
            }
        }while(opcion !=5);
        sc.close();
    }
    }
    
