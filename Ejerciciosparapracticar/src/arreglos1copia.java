
import java.util.Scanner;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class arreglos1copia {
    public static void main(String[] args) {
        
        Scanner lector=new Scanner (System.in);
        
        int n1;
        int n2;
        
        System.out.println("Ingrese el tamaño del primer arreglo");
        n1 = lector.nextInt();
        int[] arreglo1 = new int [n1];
        
        System.out.println("Ingrese los elementos del arreglo");
        for (int i=0; i < n1; i++){
            System.out.println("Elemento "+(i+1)+": ");
            arreglo1[i] = lector.nextInt();
        }
        
        System.out.println("Ingrese el tamaño del segundo arreglo");
        n2 = lector.nextInt();
        int[] arreglo2 = new int [n2];
        
        System.out.println("Ingrese los elementos del arreglo");
        for (int i=0; i < n2; i++){
            System.out.println("Elemento "+(i+1)+": ");
            arreglo2[i] = lector.nextInt();
        }
        
        if (Arrays.equals(arreglo1,arreglo2)){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        
    }
}
