/*
Francisco Javier Solis Bamaca - 3°E
taller de desarrollo 1 - 21/08/2021
 */
package Sentencias_condicionales_o_selectivas;
/*
Construir un programa que calcule y muestre por pantalla las raíces de la ecuación de segundo grado de coeficientes reales.
El programa debe diferenciar los diferentes casos que puedan surgir: la existencia de dos raíces reales distintas, 
de dos raíces reales iguales y de dos raíces complejas. Nota: se recomienda el empleo de sentencias if–else anidadas
*/
public class Coeficientes {
   double a = 0 , b = 0 ,c = 0; //coeficientes
   double deter = 0; // determinante
   double x1 = 0,x2 = 0;//raíces
   
  //constructor
    public Coeficientes(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.deter = deter;
        this.x1 = x1;
        this.x2 = x2;
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
    
    public void setDeter(double deter){
        this.deter = deter;
    }
    
    public void setX1(double x1){
        this.x1 = x1;
    }
     public void setX2(double x2){
        this.x2 = x2;
    }
//__________________________
    
    public void Formula(){
        deter = (b*b)-(4*a*c);// calculo del determinante
        
        //condicional para validar si el determinante es positivo
        if (deter>0){
            // si es positivo se calculan x1 y x2
            
        }else{
            //si el determinante es negativo no se podrá realizar la operación
            System.out.println("El determinate es negativo, por lo tanto no es posible"
                    + "realizar la operación :(");
        }
    }
    
   
  
    
}
