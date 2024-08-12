package proyecto1;

import java.util.Scanner;

public class Proyecto1 {

    public static void main(String[] args) {
        try{
            
            Scanner a = new Scanner(System.in);
    int op = 0;
        int tamano [];
        System.out.println("Ingrese el numero de nombres que desee");
        int tama= a.nextInt();
        tamano = new int [tama];
        String nom[];
        nom=new String[tama];
        
        Scanner entrada = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        
         
        while (op != 3) {
            System.out.println("1. Nuevo nombre ");
            System.out.println("2. Ver nombres guardados ");
            System.out.println("3. Salir ");
            System.out.println("Ingrese el numero de opcion");
            op = teclado.nextInt();
            
            //opcion1
            if (op == 1) {
                System.out.println("Ingrese el un nombre: ");
                String nuevonom = entrada.nextLine();
                System.out.println("GUADADO CON EXITO");
                for (int i = 0; i < tamano.length ; i++) {
                    if (nom[i]== null) {
                        nom[i] = nuevonom;
                     break;
                    }else if (nom[i]!=null) {
                        
                    }

                }
                System.out.println("NO HAY ESPACIO!! ");
                
               //opcion2 
            }  else if (op == 2) {
                System.out.println("Los nombres guardados son: ");
                for (int i = 0; i < nom.length ; i++) {
                    System.out.println(nom[i]);
                }

            }else if (op==3){
                break;
            }

        }
            
        }catch(Exception e){
            System.out.println("¡Valor incorrecto!");
        }
     
    }
}
