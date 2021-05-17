    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcial;
import primerparcial.*;
import java.util.*;  
import java.io.*;  
/**
 *
 * @author Maximiliano Kiss
 */
public class PrimerParcial {

    public static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Opcion =0;
        List<EmpleadoAsalariado> ListaAsalariado = new ArrayList<EmpleadoAsalariado>();  
        List<EmpleadoPorHoras> ListaEmpleadoHoras = new ArrayList<EmpleadoPorHoras>(); 
        List<EmpleadoPorComision> ListaComision = new ArrayList<EmpleadoPorComision>(); 
        List<Factura> ListaFactura = new ArrayList<Factura>(); 
        do{
            Opcion =0;
            System.out.println("Ingrese una opcion: \n1.CARGAR EMPLEADOS \n2.CARGAR DEUDAS/FACTURAS \n3.MOSTRAR EMPLEADOS CON SALARIOS \n4.MOSTRAR FACTURAS CON DEUDAS");
            Opcion = sc.nextInt();
            switch(Opcion){
                case 1: 
                    int tipoEmpleado =0;
                    System.out.println("De tipo: \n1.ASALARIADO \n2.POR HORAS \n3.POR COMISION");
                    tipoEmpleado = sc.nextInt();
                    //ESTO VA DENTRO DE UN IF
                    if(tipoEmpleado == 1){

                        EmpleadoAsalariado oAsalariado = new EmpleadoAsalariado("Alejo", "Moya", 1 , 25200);
                        ListaAsalariado.add(oAsalariado);
                        EmpleadoAsalariado oAsalariado2 = new EmpleadoAsalariado("Maxi", "Kiss", 2 , 5000);
                        ListaAsalariado.add(oAsalariado2);
                        EmpleadoAsalariado oAsalariado3 = new EmpleadoAsalariado("Irene", "Zamora", 2 , 30200);
                        ListaAsalariado.add(oAsalariado3);
                    }
                    else if(tipoEmpleado == 2)
                    {          
                        EmpleadoPorHoras oHoras = new EmpleadoPorHoras("Alejo", "Moya", 1, 50 ,25000);
                        ListaEmpleadoHoras.add(oHoras);
                        EmpleadoPorHoras oHoras2 = new EmpleadoPorHoras("Maxi", "Kiss", 2, 25 ,30000);
                        ListaEmpleadoHoras.add(oHoras2);
                        EmpleadoPorHoras oHoras3 = new EmpleadoPorHoras("Irene", "Zamora", 3, 20 ,75000);
                        ListaEmpleadoHoras.add(oHoras3);

                    }
                    else{
                        EmpleadoPorComision oComision = new EmpleadoPorComision("Alejo", "Moya" ,1 , 2000, 2 , 3000);
                        ListaComision.add(oComision);
                        EmpleadoPorComision oComision2 = new EmpleadoPorComision("Maxi", "Kiss" ,2 , 4000, 3 , 8000);
                        ListaComision.add(oComision2);
                        EmpleadoPorComision oComision3 = new EmpleadoPorComision("Irene", "Zamora" ,3 , 6000, 5 , 5000);
                        ListaComision.add(oComision3);
                    }
                    break;
                case 2:
                    Repuesto[] verRep = new Repuesto[3];
                    verRep[0] = new Llantas(1000);
                    verRep[1] = new Llantas(2000);
                    verRep[2] = new Ruedas(3000);
                    Factura oFactura = new Factura(1 , verRep, 2500);
                    ListaFactura.add(oFactura);
                    Repuesto[] verRep2 = new Repuesto[3];
                    verRep2[0] = new Llantas(1000);
                    verRep2[1] = new Llantas(2000);
                    verRep2[2] = new Ruedas(3000);
                    Factura oFactura2 = new Factura(2 , verRep2, 3500);
                    ListaFactura.add(oFactura2);
                    break;
                case 3:
                        for(EmpleadoPorHoras objeto : ListaEmpleadoHoras) 
                        {
                            System.out.println("Empleado: " + objeto.toString() + "\nSueldo: " + objeto.Ingresos());				
                        }
                        for(EmpleadoAsalariado objeto : ListaAsalariado) 
                        {
                            System.out.println("Empleado: " + objeto.toString() + "\nSueldo: " + objeto.Ingresos());				
                        }
                        for(EmpleadoPorComision objeto : ListaComision) 
                        {
                            System.out.println("Empleado: " + objeto.toString() + "\nSueldo: " + objeto.Ingresos());				
                        }

                        break;
                case 4:
                    for(Factura objeto : ListaFactura) 
                    {
                      System.out.println("Factura: " + objeto.toString());				
                    }
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }
        }while(Opcion != 0);
    }
}
