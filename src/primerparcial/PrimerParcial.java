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
        Empleado oEmpleado = new Empleado();
        EmpleadoAsalariado oAsalariado = new EmpleadoAsalariado();
        EmpleadoPorComision oComision = new EmpleadoPorComision();
        System.out.println("Ingrese una opcion: \n1.CARGAR EMPLEADOS \n2.CARGAR DEUDAS/FACTURAS \n3.MOSTRAR EMPLEADOS CON SALARIOS \n4.MOSTRAR FACTURAS CON DEUDAS");
        Opcion = sc.nextInt();

        switch(Opcion){
            case 1: 
                int tipoEmpleado =0;
                System.out.println("De tipo: \n1.ASALARIADO \n2.POR HORAS \n3.POR COMISION");
                tipoEmpleado = sc.nextInt();
                //ESTO VA DENTRO DE UN IF
                if(tipoEmpleado == 1)
                    System.out.println("Eleccion 1");
                else if(tipoEmpleado == 2)
                {
                    List<EmpleadoPorHoras> ListaEmpleadoHoras = new ArrayList<EmpleadoPorHoras>();               
                    EmpleadoPorHoras oHoras = new EmpleadoPorHoras("Alejo", "Moya", 1, 50 ,25000);
                    ListaEmpleadoHoras.add(oHoras);
                    EmpleadoPorHoras oHoras2 = new EmpleadoPorHoras("Maxi", "Kiss", 2, 25 ,30000);
                    ListaEmpleadoHoras.add(oHoras);
                    EmpleadoPorHoras oHoras3 = new EmpleadoPorHoras("Irene", "Zamora", 3, 20 ,75000);
                    ListaEmpleadoHoras.add(oHoras);
                    for(EmpleadoPorHoras objeto : ListaEmpleadoHoras) 
                    {
                        System.out.println("Empleado: " + objeto.toString() + "\nSueldo: " + objeto.Ingresos());				
                    }
                }
                else{
                    System.out.println("Opcion 3");
                }

            case 2:
                System.out.println("Elegiste opcion 2");
        }
    }
    //hola
}
