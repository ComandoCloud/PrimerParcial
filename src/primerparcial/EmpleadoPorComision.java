
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
public class EmpleadoPorComision extends Empleado {
    private double salarioBase;
    private int cantidadReparaciones;
    private double tarifaComision;

     public EmpleadoPorComision(String Nombre,String Apellido,int numero, double salarioBase, int cantidadReparaciones,double tarifaComision){
          super(Nombre,Apellido,numero);
          this.salarioBase = salarioBase;
          this.cantidadReparaciones = cantidadReparaciones;
          this.tarifaComision = tarifaComision;
     }
    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * @return the cantidadReparaciones
     */
    public int getCantidadReparaciones() {
        return cantidadReparaciones;
    }

    /**
     * @param cantidadReparaciones the cantidadReparaciones to set
     */
    public void setCantidadReparaciones(int cantidadReparaciones) {
        this.cantidadReparaciones = cantidadReparaciones;
    }

    /**
     * @return the tarifaComision
     */
    public double getTarifaComision() {
        return tarifaComision;
    }

    /**
     * @param tarifaComision the tarifaComision to set
     */
    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }
    
        
    @Override public double Ingresos(){
        return 600 * this.cantidadReparaciones ;
    }
}