/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecbank;

/**
 *
 * @author PC
 */
public class Proyecbank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente Cl=new Cliente() ;
        Cliente C2=new Cliente() ;
//Cl.Ingresar("Carlos", "4562312548", "Calle Unidad Nacional", "juan@gmail.com", "099545656","Soltero");
//    Cl.Mostrar();
   //     C2.Ingresar("Juan", "4562312548", "Calle Unidad Nacional", "juan@gmail.com", "099545656","Soltero");
   // C2.Mostrar();
    //////////////////////////////
    Cuenta Cta1=new Cuenta();
    Cta1.Ingresar("00564859", "Ahorros", 500.000);
    Cta1.Mostrar();
    Cta1.Depositar(50.00);
    Cta1.Mostrar(); 
    Cta1.Retirar(20.00);
    Cta1.Mostrar();
                }
    
}
