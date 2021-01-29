/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.security.SecureRandom;

/**
 *
 * @author Claudio Hernandez
 */
public class Cadenas {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodosclaudio c = new metodosclaudio();
        int ejercicio = 0;
        while (ejercicio != 11) {
            
            String menu = "**********menu*****\n"
                    + "1)trabajo jueves \n "
                    + "2)Contar vocales\n"
                    + "3)cambiar letras\n"
                    + "4)Acumulador de letrasn\n"
                    + "5) Concatenar cadenas \n"
                    + "6) Subcadena\n"
                    + "7) ascii\n"
                    + "8) Alphanumerico\n"
                    + "9) Ordenar cadenas\n"
                    + "10) numero random\n"
                    + "11) salirse\n";
            ejercicio = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (ejercicio) {
                case 1: {

                    JOptionPane.showMessageDialog(null, c.vocaposicion());
                    break;

                }
                case 2: {

                    JOptionPane.showMessageDialog(null, c.contarvocales());

                    break;
                }//fin caso 2
                case 3: {

                    JOptionPane.showMessageDialog(null, c.cambiarletras());
                    break;
                }//fin caso 3
                case 4: {
                    String palabra = JOptionPane.showInputDialog("ingrese su nombre");
                    JOptionPane.showMessageDialog(null, c.acumulador(palabra));

                    break;
                }
                case 5: {
                    JOptionPane.showMessageDialog(null, c.concatenarcadenas());

                    break;
                }//fin caso 5
                case 6: {

                    JOptionPane.showMessageDialog(null, c.substring());
                    break;
                }//fin caso 6
                case 7: {
                    JOptionPane.showMessageDialog(null, c.ascii());
                    break;
                }//fin caso 7
                case 8: {
                    JOptionPane.showMessageDialog(null, c.alphanumerico());
                    break;

                }//fin  caso 8
                case 9: {
                    JOptionPane.showMessageDialog(null, c.ordenarcadena());
                    break;

                }
                case 10: {
                    JOptionPane.showMessageDialog(null,c.numeroaleatorio());
                    break;
                }
                case 11: {
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "La opcion ingresada no es valida");
                    int n = 5;
                    JOptionPane.showMessageDialog(null, n);

                    
            }//fin de switch

        }
    }//fin del main

    

}//fin de clase
