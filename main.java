
//import java.util.Scanner;
import java.math.*;

public class main {

    public static void main(String[] args) {

        // Scanner entrada = new Scanner(System.in);

        int [] arreglo = new int[6];
        for (int i = 0; i < arreglo.length; i++) {
            double a = Math.random();
            int b = (int) Math.round(a);
                  
               arreglo[i] = b;    
            
        }


        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]);
        }
        
        





        double peso = 0;
        int calorias = 0;

        int [] arreglo2 = new int[6];
        arreglo2[0] = 1;
        arreglo2[1] = 1;
        arreglo2[2] = 1;
        arreglo2[3] = 1;
        arreglo2[4] = 1;
        arreglo2[5] = 1;
       
       
            if(arreglo[0] == arreglo2[0]){
                peso += 0.300;
                calorias += 150;
            }
            else
            {
                peso += 0;
                calorias += 0;
            }

            if(arreglo[1] == arreglo2[1]){
                peso += 0.400;
                calorias += 200;
            }
            else
            {
                peso += 0;
                calorias += 0;
            }

            if(arreglo[2] == arreglo2[2]){
                peso += 0.500;
                calorias += 250;
            }
            else
            {
                peso += 0;
                calorias += 0;
            }

            if(arreglo[2] == arreglo2[2]){
                peso += 0.700;
                calorias += 900;
            }
            else
            {
                peso += 0;
                calorias += 0;
            }

            if(arreglo[3] == arreglo2[2]){
                peso += 0.400;
                calorias += 800;
            }
            else
            {
                peso += 0;
                calorias += 0;
            }

            if(arreglo[4] == arreglo2[2]){
                peso += 1;
                calorias += 1000;
            }
            else
            {
                peso += 0;
                calorias += 0;
            }
            
            if(arreglo[5] == arreglo2[2]){
                peso += 850;
                calorias += 700;
            }
            else
            {
                peso += 0;
                calorias += 0;
            }

           
        
        System.out.println();
        System.out.println("Peso: "+ peso);
        System.out.println("Calorias: "+ calorias);

    }

}