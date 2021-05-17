/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcial;

/**
 *
 * @author ALeeh
 */
public class Empleado {
    public String Nombre;
    public String Apellido;
    public int numSeguroSocial;
    
    public Empleado(){
        
    }
    
    public Empleado(String Nombre,String Apellido,int numero){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.numSeguroSocial = numero;
    }
    
    @Override
    public String toString(){
        return this.Nombre.toString() + " , "+ this.Apellido.toString();
    }
    
    public double Ingresos(){
        return 0;    
    }
}
