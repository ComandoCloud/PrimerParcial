/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcial;
import java.util.*;  
import java.io.*;  
/**
 *
 * @author Maximiliano Kiss
 */
public class EmpleadoPorHoras extends Empleado {
    
    private double sueldoPorHora;
    private int horasTrabajadas;

    /**
     * @return the sueldoPorHora
     */
    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    /**
     * @param sueldoPorHora the sueldoPorHora to set
     */
    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    /**
     * @return the horasTrabajadas
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * @param horasTrabajadas the horasTrabajadas to set
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public EmpleadoPorHoras(){
        
    }
    public EmpleadoPorHoras(String nombre, String Apellido, int numSeguroSocial, int Horas, double Sueldo){
        super(nombre,Apellido,numSeguroSocial);
        this.horasTrabajadas =Horas;
        this.sueldoPorHora =  Sueldo;
    }
    
    public static void main(String[] args){
        
    }
    
    @Override
    public double Ingresos(){
        
        double MontoTotal = 0, MontoTotalExtra = 0, MontoFinalExtra = 0;
        if(this.horasTrabajadas <= 40){
            MontoTotal = this.horasTrabajadas * this.sueldoPorHora;
            return MontoTotal;
        }
        else{
            int HorasTotales = 0;
            MontoTotal = this.horasTrabajadas * this.sueldoPorHora;
            HorasTotales = this.horasTrabajadas - 40;
            MontoTotalExtra = HorasTotales * (this.sueldoPorHora*2);
            MontoFinalExtra = MontoTotal + MontoTotalExtra;
            return MontoFinalExtra;
        }           
    }  
    
    @Override
    public String toString(){
        return this.Nombre + " , " + this.Apellido;
    }
}
