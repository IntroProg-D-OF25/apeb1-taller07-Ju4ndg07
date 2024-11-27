import java.util.Scanner;
/**Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente: Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20% En caso que sea otro tipo de cliente, no hay descuento. Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
 *
 * @author Juan Guerrero 
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        String nombre;
        double  cont = 1, subtotal, costo;
        int tipocliente;
        
        while (cont <= 7)
        {
            System.out.print("Dame el Nombre del cliente: ");
            nombre = tcl.next();
            System.out.print("Costo de la computadora: ");
            costo = tcl.nextDouble();
            System.out.print("Tipo de cliente (1 / 2): ");
            tipocliente = tcl.nextInt();
            subtotal = costo;
            if (tipocliente == 1){
            costo *= 0.90;
            }
            else 
            {
            costo *= 0.80;
            }
            System.out.println("NOMBRE\tPRECIO\tTIPOCLIENTE\tTOTALAPAGAR");
            System.out.println(nombre+ "\t"+ subtotal + "\t"+ tipocliente + "\t" + "\t" + costo);
            
            cont ++;
        }
         System.out.println("");

    }
    
}

/***
 * Dame el Nombre del cliente: juan
Costo de la computadora: 100
Tipo de cliente (1 / 2): 1
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
juan	100.0	1		90.0
Dame el Nombre del cliente: diego
Costo de la computadora: 200
Tipo de cliente (1 / 2): 2
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
diego	200.0	2		160.0
Dame el Nombre del cliente: josselyn
Costo de la computadora: 300
Tipo de cliente (1 / 2): 1
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
josselyn	300.0	1		270.0
Dame el Nombre del cliente: tamara
Costo de la computadora: 400
Tipo de cliente (1 / 2): 2
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
tamara	400.0	2		320.0
Dame el Nombre del cliente: paola
Costo de la computadora: 500
Tipo de cliente (1 / 2): 1
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
paola	500.0	1		450.0
Dame el Nombre del cliente: guadalupe
Costo de la computadora: 600
Tipo de cliente (1 / 2): 2
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
guadalupe	600.0	2		480.0
Dame el Nombre del cliente: diana
Costo de la computadora: 700
Tipo de cliente (1 / 2): 1
NOMBRE	PRECIO	TIPOCLIENTE	TOTALAPAGAR
diana	700.0	1		630.0
 */