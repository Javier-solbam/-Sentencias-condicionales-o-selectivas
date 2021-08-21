/*
Francisco Javier Solis Bamaca - 3°E
taller de desarrollo 1 - 21/08/2021
 */
package Sentencias_condicionales_o_selectivas;

import java.util.ArrayList;
import java.util.Scanner;

public class prueba_ecuacion2do {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        ArrayList<Coeficientes> OBC = new ArrayList<>();//araylista parapoder hacer posible varias operaciones
        int op;
        String respuesta;

        do {//Menú
            System.out.println("∣________________________________________________________________∣");
            System.out.println("∣        Sistema que calcula las raíces de ecuaciones de         ∣");
            System.out.println("∣                 2do grado de coeficientes reales               ∣");
            System.out.println("∣--------------------------------------------------------------- ∣");
            System.out.println("∣ 1. Calcular raíces                                             ∣");
            System.out.println("∣ 2. Salir                                                       ∣");
            System.out.println("∣________________________________________________________________∣");
            op = ent.nextInt();
            switch (op) {
                case 1:
                    do {
                        Coeficientes ecuacion = new Coeficientes();
                        //petición de datos : a, b y c
                        System.out.println("Ingrese el valor del coeficente a:");
                        ecuacion.setA(ent.nextDouble());
                        
                        System.out.println("Ingrese el valor del coeficente b:");
                        ecuacion.setB(ent.nextDouble());
                        
                        System.out.println("Ingrese el valor del coeficente c:");
                        ecuacion.setC(ent.nextDouble());
                        
                        ecuacion.Formula();//llamo al método Formula() para realizar la operación
                        

                        System.out.println("¿Desea calcular otras raíces?(Si/No)");
                        respuesta = ent.next();
                    } while ((respuesta.equals("si") || respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("sI")));//fin del while case 1
                    break;
            }
        } while (op != 2);//fin del primer do while

    }
}
