/*
Francisco Javier Solis Bamaca - 3°E
taller de desarrollo 1 - 21/08/2021
 */
package Sentencias_condicionales_o_selectivas;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

/*
Construir un programa que calcule y muestre por pantalla las raíces de la ecuación de segundo grado de coeficientes reales.
El programa debe diferenciar los diferentes casos que puedan surgir: la existencia de dos raíces reales distintas, 
de dos raíces reales iguales y de dos raíces complejas. Nota: se recomienda el empleo de sentencias if–else anidadas
 */
public class Coeficientes {

    double a, b, c; //coeficientes
    double deter; // determinante
    double x1, x2;//raíces

    //constructor
    public Coeficientes(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.deter = deter;
        this.x1 = x1;
        this.x2 = x2;
    }

    Coeficientes() {
        a = 0;
        b = 0;
        c = 0; //coeficientes
        deter = 0; // determinante
        x1 = 0;
        x2 = 0;//raíces
    }

    //setter_____________________________
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setDeter(double deter) {
        this.deter = deter;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }
//__________________________

    public void Formula() {
        deter = b * b - 4 * a * c;// calculo del determinante
        /*  El programa debe diferenciar los diferentes casos que puedan surgir: la existencia de dos raíces reales distintas, 
        de dos raíces reales iguales y de dos raíces complejas.*/
        if (deter > 0) {
            // existencia de dos raíces reales distintas
            x1 = (-b + Math.sqrt(deter)) / (2 * a); // b+raíz(b2-4ac)/(2a)
            x2 = (-b - Math.sqrt(deter)) / (2 * a); // b-raíz(b2-4ac)/(2a)
            System.out.println("para la eucación: " + a + " x² + " + b + "x + " + c);
            System.out.println("las RAÍCES son DISTINTAS");
            System.out.println("S = { " + x1 + " ; " + x2 + " }");
        } else if (deter < 0) {
            // existencia de dos raíces complejas
            System.out.println("para la eucación: " + a + " x² + " + b + "x + " + c);
            System.out.println("las RAÍCES son COMPLEJAS");
            double parteReal, parteImaginaria;
            deter = abs(deter);
            parteReal = -b / (2 * a);
            parteImaginaria = sqrt(deter) / (2 * a);
            System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
        } else {
            // existencia de dos raíces reales iguales
            x1 = (-b) / (2 * a);
            x2 = (-b) / (2 * a);
            System.out.println("para la eucación: " + a + " x² + " + b + "x + " + c);
            System.out.println("las RAÍCES son IGUALES");
            System.out.println("S = { " + x1 + " ; " + x2 + " }");
        }
    }

}
