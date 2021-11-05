/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecbank;

/**
 *
 * @author PC
 */
public class Cuenta {
    private String Numero;
    private String Tipo;
    private Double Saldo;
    
    public void Ingresar(String Numero, String Tipo, Double Saldo){
        this.Numero=Numero;
        this.Tipo=Tipo;
        this.Saldo=Saldo;
}
   public void Mostrar(){
        System.out.println("Numero de cuenta: "+Numero);
        System.out.println("Tipo de cuenta: "+Tipo);
        System.out.println("Saldo de cuenta: "+Saldo);
    }
    
    public void Retirar(Double valRetiro){
        Saldo-=valRetiro;
    }
    public void Depositar(Double valDeposito){
        Saldo+=valDeposito;
    }
}
