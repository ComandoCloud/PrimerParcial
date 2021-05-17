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
         this.montoTotal = montoTotal;
    }
    
    public double calculaMonto(){
        for (int i = 0; i < this.repuestos.length; i++){
        if(this.repuestos[i] instanceof Llantas ){
            this.montoTotal=this.montoTotal + (this.montoTotal * 1.21);
        }else
            this.montoTotal = this.montoTotal + this.montoTotal;
       }
       return this.montoTotal;
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
