/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class MEDIA {
int n=0;
String datos="";
float prom,a,i=0;
Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        MEDIA in = new MEDIA();
        in.datos();
    }
    public void datos(){
        while(n!=2){
        System.out.println(" 1) INGRESAR DATOS \n 2)MEDIA \n");
        n=in.nextInt();
        switch (n){
            case 1: recopilar();
            break;
            case 2: mostrar();
            break;
        }
        }
    }
    public void recopilar(){
        System.out.println("Ingresa el numero");
        a=in.nextFloat();
        datos=a + "," + datos;
        prom +=a;
        i++;
    }
    public void mostrar(){
        System.out.println("La media es: " + prom/i);
        System.out.println("Los datos fueron " + datos);
    }
}
