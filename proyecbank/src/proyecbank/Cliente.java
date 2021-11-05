/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecbank;

/**
 *
 * @author PC
 */
public class Cliente {
    private String nombre;
     private String cedula;
      private String direccion;
       private String email;
        private String telefono;
         private String estadoCivil;
         public void Ingresar (String nombre,String cedula,String direccion,String email,String telefono, String estadoCivil){
    this.nombre=nombre;
    this.cedula=cedula;
    this.direccion=direccion;
    this.email=email;
    this.telefono=telefono;
    this.estadoCivil=estadoCivil;      
    }
         public void Mostrar(){
             System.out.println("Nombre: "+nombre);
             System.out.println("cedula: "+cedula);
             System.out.println("direccion: "+direccion);
             System.out.println("email: "+email);
             System.out.println("telefono: "+telefono);
             System.out.println("estadoCivil: "+estadoCivil);
         }
}
