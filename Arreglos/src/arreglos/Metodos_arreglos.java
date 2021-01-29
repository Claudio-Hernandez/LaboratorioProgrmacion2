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
public class Metodos_arreglos {

    private int[] n;

    public Metodos_arreglos(int[] f) {
        this.n = f;
    }//constructor

    public int sumadear(int[] n) {
        int acum = 0;
        for (int i = 0; i < n.length; i++) {
            acum += n[i];
        }
        return acum;
    }

    public int[] sumade(int[] a) {
        int[] nuevo = new int[a.length];
        for (int i = 0; i < n.length; i++) {
            nuevo[i] = a[i] + n[i];
        }
        return nuevo;
    }

    public int[] sumadealrevez(int[] a) {
        int[] g = new int[n.length];
        for (int i = 0; i < g.length; i++) {
            g[i] = n[i] + (a[n.length - 1-i]);
        }
        return g;
    }

    public int mayor(int[] arreglov) {
        int mayor = 0;
        for (int i = 0; i < arreglov.length; i++) {
            if (arreglov[i] > mayor) {
                mayor = arreglov[i];
            } else {
                mayor = mayor;
            }
        }
        return mayor;
    }

    public int[] intercalado(int[] ar) {
        int temp[] = new int[ar.length * 2];
        int k = 0, j = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i % 2 == 0) {
                temp[i] = n[k];
                k++;
            } else {
                temp[i] = ar[j];
                j++;
            }
        }//for
        return temp;
    }
}
