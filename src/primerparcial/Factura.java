package primerparcial;
/**
 *
 * @author Irene
 */
import primerparcial.*;

public class Factura {
    private int NumeroFactura;
    private Repuesto repuestos[];
    private double montoTotal;

      public Factura(int NumeroFactura,Repuesto repuestos[] ,double montoTotal){
         this.NumeroFactura=NumeroFactura;
         this.repuestos=repuestos;
         this.montoTotal=montoTotal;
    }
    
    public double calculaMonto(){
         double montoTotalLlanta=0;
         for (int i = 0; i < this.repuestos.length; i++){
          if(this.repuestos[i] instanceof Llantas ){
             montoTotalLlanta=montoTotalLlanta + (montoTotalLlanta * 1.21);
         }else
              montoTotalLlanta = montoTotalLlanta + montoTotalLlanta;
       }
       return montoTotalLlanta;
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
    
}
