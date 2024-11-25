
package Clases;

 public record Person(String name, int edad){
     
     public Person{
         if (edad <0){
             System.out.println("la edad no puede ser negativa");
     }
     
     }
     public String displayInfo(){
         return "Nombre: "+ name + " ; " + " edad: " + edad;
     
     }
 }
