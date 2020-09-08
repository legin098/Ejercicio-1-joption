package Retorno_de_dinero;

import javax.swing.JOptionPane;
/**
 *
 * @author Jesus Cruz
 */
public class Main {
    public static void main(String[] args) {
        
        int opcion = 0;
        float costo_producto = 0, dinero_recibido = 0;
        
        do {
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog("___________Menu__________\n"
                        + "\n1. Costo del producto."
                        + "\n2. Pagar producto."
                        + "\n3. Salir."));
               
                switch(opcion){
                    case 1: costo_producto = Float.parseFloat(JOptionPane.showInputDialog("Costo del producto.\n\nDigite el costo del producto: ")); break;

                    case 2: dinero_recibido = Float.parseFloat(JOptionPane.showInputDialog("Pagar producto.\n\nDigite el monto de dinero con el que desea pagar: "));
                            if(dinero_recibido > costo_producto){
                                JOptionPane.showMessageDialog(null,"Su pago se ha efectuado con exito\n\nRetorno de dinero: " + (dinero_recibido - costo_producto));
                            }else if(dinero_recibido == costo_producto){
                                    JOptionPane.showMessageDialog(null,"Su pago se ha efectuado con exito\n\nRetorno de dinero: " + (dinero_recibido - costo_producto));
                                  }else{
                                       JOptionPane.showMessageDialog(null,"Su pago no se ha efectuado con exito\n\nDinero faltante para efectuar el pago: " + (costo_producto - dinero_recibido));             
                                    }
                            break;
                    case 3:  JOptionPane.showMessageDialog(null,"Muchas gracias.");   break;
                    
                    default: 
                          JOptionPane.showMessageDialog(null," Opcion no valida"); break;   
                } 
            }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Error, intente nuevamente.");
            }           
        } while (opcion != 3);          
    }
}
