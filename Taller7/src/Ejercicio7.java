import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite, cont = 1;
        System.out.print("Dame el limite: ");
        limite = tcl.nextInt(); 
        
        while (cont <= limite) {
            // Si el contador es impar, imprimimos el signo negativo
            if (cont % 2 != 0) {
                System.out.print("-(" + "1/" + cont + ")");
            } else {
                // Si el contador es par, imprimimos el signo positivo
                System.out.print(" + (1/" + cont + ")");
            }
            cont++;  
        }
        System.out.println();  

    }
    
}
