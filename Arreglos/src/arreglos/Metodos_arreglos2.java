/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.security.SecureRandom;

/**
 *
 * @author Claudio Hernandez
 */
public class Metodos_arreglos2 {

    SecureRandom r = new SecureRandom();

    private int size;

    public Metodos_arreglos2(int size) {
        this.size = size;
    }

    public int[] formar_arreglo() {
        int[] temporal = new int[size];
        for (int i = 0; i < size; i++) {
            temporal[i] = 1 + r.nextInt(10);

        }
        return temporal;
    }

    public String imprimirjo(int[] arreglo) {
        String acum = "";
        for (int i = 0; i < size; i++) {
            acum += arreglo[i] + "\n";
        }
        return acum;
    }

    public int[] burbuja(int[] arreglo) {
        int bandera;
        int[] arregloOrdenado;
        for (int i = 0; i < arreglo.length-1; i++) {
            for (int j = i; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    bandera = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = bandera;
                }
            }
        }
        arregloOrdenado = arreglo;
        return arregloOrdenado;
    }

    public void binaria(int[] ar,int num_buscado) {
        int inferior =0;
        int centro;
        int superior = (ar.length)-1;
        while(inferior<=superior){
            centro = (superior+inferior)/2;
            if(ar[centro]==num_buscado){
                System.out.println("El numero buscado esta en la posicion:"+centro);
                
            }else if(num_buscado<ar[centro]){
                superior =centro-1;
            }else{
            
                inferior = centro+1;
            }
            
            
        }
        

    }

}//fin de la clase
