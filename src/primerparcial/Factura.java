package primerparcial;
/**
 *
 * @author Irene
 */
public class Factura {
    private int NumeroFactura;
    private Repuesto repuestos[];
    private double montoTotal;

      public Factura(int NumeroFactura,Repuesto repuestos[] ,double montoTotal){
         this.NumeroFactura=NumeroFactura;
         this.repuestos=repuestos;
         this.montoTotal=montoTotal;
      
    }
    
    public double montoTotal(){
       return 0; 
    }
    public int getNumeroFactura() {
        return NumeroFactura;
    }

    public void setNumeroFactura(int NumeroFactura) {
        this.NumeroFactura = NumeroFactura;
    }

    public Repuesto[] getRepuesto() {
        return repuestos;
    }

    public void setRepuesto(Repuesto[] repuestos) {
        this.repuestos = repuestos;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    

   
    
}
