/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcial;

/**
 *
 * @author Maximiliano Kiss
 */
public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String Nombre,String Apellido,int numero,double salarioSemanal){
        super(Nombre,Apellido,numero);
        this.salarioSemanal = salarioSemanal;
        
    }
    /**
     * @return the salarioSemanal
     */
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    /**
     * @param salarioSemanal the salarioSemanal to set
     */
    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    
    @Override public double Ingresos(){
        double semanales = 15000;
        return semanales * 4;
    }

    
}
