/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import javax.swing.JOptionPane;
import java.security.SecureRandom;

/**
 *
 * @author Claudio Hernandez
 */
public class Arreglos {

    static SecureRandom v = new SecureRandom();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
        int[] numero = new int[size];
        numero = lectura(size);
        int ejercicio = 0;
        Metodos_arreglos c = new Metodos_arreglos(numero);
        Metodos_arreglos2 v = new Metodos_arreglos2(size);
        System.out.println("lolo");
        int[] be = new int[size];
        be = lectura(size);

        while (ejercicio != 9) {
            String menu = "                          Menu\n"
                    + "1)suma de arreglos\n"
                    + "2)suma de dos arreglos\n"
                    + "3)suma de dos arreglos alrevez\n"
                    + "4)Mayor\n"
                    + "5)Arreglo intercalado\n"
                    + "6) Formar arreglo\n"
                    + "7) burbuja\n"
                    + "8) busqueda binaria\n"
                    + "9)Salir";
            ejercicio = Integer.parseInt(JOptionPane.showInputDialog(menu.toUpperCase()));
            switch (ejercicio) {
                case 1: {
                    System.out.println("SUMA DE ARREGLOS");
                    imprimir(numero);
                    System.out.println("La suma del arreglo es:" + c.sumadear(numero));

                    break;
                }
                case 2: {
                    System.out.println("-------SUMA DE DOS ARREGLOS-----------");
                    System.out.println("primer arreglo");
                    imprimir(numero);
                    System.out.println("segundo arreglo");
                    imprimir(be);
                    int[] total = new int[size];
                    total = c.sumade(be);
                    //JOptionPane.showMessageDialog(null,total);
                    System.out.println("arreglo resultante");
                    imprimir(total);

                    break;
                }
                case 3: {
                    System.out.println("-------SUMA DE DOS ARREGLOS ALREVEZ---------");
                    System.out.println("primer arreglo");
                    imprimir(numero);
                    System.out.println("segundo arreglo");
                    imprimir(be);
                    int[] total = new int[size];
                    total = c.sumadealrevez(be);
                    //JOptionPane.showMessageDialog(null,total);
                    System.out.println("arreglo resultante");
                    imprimir(total);
                    break;
                }
                case 4: {
                    System.out.println("---------MAYOR EN EL ARREGLO-------------");
                    int[] nuevo = new int[size];
                    nuevo = lectura(size);
                    System.out.println("Este es el arreglo,verifique que el mayor se señala correctamente");
                    imprimir(nuevo);
                    JOptionPane.showMessageDialog(null, "El  mayor numero en el arreglo es:" + c.mayor(nuevo));
                    break;
                }
                case 5: {
                    System.out.println("----ARREGLO INTERCALADO------");
                    int arreglo5[] = new int[size];
                    arreglo5 = lectura(size);
                    System.out.println("primer arreglo");
                    imprimir(arreglo5);
                    System.out.println("Seguno arreglo:");
                    imprimir(numero);
                    System.out.println("Arrego final");
                    int arreglo6[] = new int[size * 2];
                    arreglo6 = c.intercalado(arreglo5);
                    imprimir(arreglo6);
                    break;
                }
                case 6: {

                    int[] arreglo_6 = new int[size];
                    arreglo_6 = v.formar_arreglo();
                    JOptionPane.showMessageDialog(null, "------FORMAR ARREGLO----\n" + "Arreglo resultante\n" + v.imprimirjo(arreglo_6));

                    break;
                }
                case 7: {
                    //Valores que tiene el arreglo desordenado.
                    int arreglo[] = {8, 6, 7, 2, 1, 8, 6, 8, 7, 1, 9, 7, 7, 10,1,0,2,5,9,12345};

                    int arregloOrdenado[] = v.burbuja(arreglo);
                    imprimir(arregloOrdenado);
                    break;
                }
                case 8: {
                    int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor buscado:"));
                    int[]burbujita=new int[size];
                    burbujita=lectura(size);
                    int[] nuevaburbujita = new int[size];
                    nuevaburbujita=v.burbuja(burbujita);
                    imprimir(nuevaburbujita);
                    v.burbuja(nuevaburbujita);
                    break;
                }
                case 9: {
                    break;
                }

                default: {
                    JOptionPane.showMessageDialog(null, "Numero incorrecto, tendra que ingresarlo de nuevo\nPRESIONE OK ");
                }
            }//fin del switch

        }//fin del while menu
    }//fin del metodo main

    public static int[] lectura(int size) {
        int[] f = new int[size];
        for (int i = 0; i < f.length; i++) {
            f[i] = 1 + v.nextInt(20);
        }
        return f;
    }

    public static String imprimir(int[] numero) {
        String acum = "";
        for (int i = 0; i < numero.length; i++) {
            System.out.println(" " + i + "  =  " + numero[i]);
        }

        return acum;

    }//metodo imprimir

}//fin de la clase
