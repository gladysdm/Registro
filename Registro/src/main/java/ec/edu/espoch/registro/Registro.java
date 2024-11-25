
package ec.edu.espoch.registro;

import Clases.Person;
import Clases.Product;
import java.util.ArrayList;

/**
 *
 * @author PERSONAL
 */
public class Registro {

    public static void main(String[] args) {
        Person person = new Person("pedro", 25);
        Product p1 = new Product(" lapto ",  400.00, " informatica");
        Product p2 = new Product(" nevera ",  500.00, " electrodomesticos");
        Product p3 = new Product(" tomatodo ",  2.00, " electrodomestico");
        
        //imprimir datos:
        ArrayList<Product> productos = new ArrayList<>();
        
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        
       for(Product product : productos){
           System.out.println(product);
       
       }
        //imprimer datos
        System.out.println("es: "+ person.name());
        System.out.println("es: "+ person.edad());
        //imprimer el registro
        System.out.println( person);
        System.out.println(person.displayInfo());
       
    }
}
