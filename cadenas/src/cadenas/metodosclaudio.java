/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

import static cadenas.Cadenas.entrada;
import java.security.SecureRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Claudio Hernandez
 */
public class metodosclaudio {
    public void menu(){
    
    }

    public  String vocaposicion() {

        char c;
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showMessageDialog(null, "Su nombre por si no sabia es:  " + nombre);
        int a = 0;
        String acum = " ";
        for (int i = 0; i < nombre.length(); i++) {
            c = nombre.charAt(i);

            acum += c + "-En la posicion-" + i + "\n";

        }

        String nombremayusculas;
        nombremayusculas = nombre.toUpperCase();
        acum += "Tu nombre en mayusculas:  " + nombremayusculas;
        return acum;
    }//fin del metodo vocaposicion

    public  String contarvocales() {
        String palabra2 = JOptionPane.showInputDialog("ingrese palabra");
        char c;
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int f = 0; f < palabra2.length(); f++) {
            c = palabra2.charAt(f);
            if (c == 'a') {
                a = a + 1;
            } else if (c == 'e') {
                e = e + 1;
            } else if (c == 'i') {
                i = i + 1;
            } else if (c == 'o') {
                o = o + 1;
            } else if (c == 'u') {
                u = u + 1;
            } else {
                a = a;
                e = e;
                i = i;
                o = o;
                u = u;
            }
        }//evalua la letra
        String a2 = "a:" + a + "\n";
        String e2 = "e:" + e + "\n";
        String i2 = "i:" + i + "\n";
        String o2 = "o:" + o + "\n";
        String u2 = "u:" + u + "\n";
        String vocalesimprimir = a2 + e2 + i2 + o2 + u2;

        return vocalesimprimir;

    }//fin de metodo contar vocales

    public  String cambiarletras() {
        String palabra2 = JOptionPane.showInputDialog("ingrese palabra");

        char x = JOptionPane.showInputDialog("Ingrese caracter a reemplazar").charAt(0);
        char y = JOptionPane.showInputDialog("ingrese carcater por el cual reemplazar").charAt(0);
        String palabra = palabra2.replace(x, y);//reemplaza los char x por los y

        return palabra;//devuelve la palabra con los caracteres ya cambiados
    }//cambiar letras

    public  String acumulador(String palabra) {

        String acum = "";
        String acum2 = "";
        for (int i = 0; i < palabra.length(); i++) {
            acum = acum + palabra.charAt(i);
            acum2 += acum + '\n';
        }
        return acum2;
    }//acumulador

    public static String concatenarcadenas() {
        String cadena1 = JOptionPane.showInputDialog("Que comida desea?");
        String miComida = "Seguro que quiere:" + cadena1 + "?";
        return miComida;

    }

    public  String substring() {
        String cadena = JOptionPane.showInputDialog("Ingrese palabra de 15 letras");
        int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer indice de la subcadena"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el ultimo indice de la subcadena"));

        String subcade = cadena.substring(x, y);
        return subcade;
    }

    public  String ascii() {
        String acum = " ";
        String entrada1 = JOptionPane.showInputDialog("ingrese cadena estimada");

        int numero;
        for (int i = 0; i < entrada1.length(); i++) {
            numero = entrada1.charAt(i);
            acum += " " + numero;
        }//for de numeros ascci
        String salida = "su entrada en codigo ascii es :" + acum;
        return salida;
    }

    public  String ordenarcadena() {

        String entrada1 = JOptionPane.showInputDialog("Ingrese una palabra para ordenarla en orden ascii").toLowerCase();
        String acum = " ";
        for (int j = 97; j <= 122; j++) {
            for (int k = 0; k < entrada1.length(); k++) {
                char f = entrada1.charAt(k);
                if (j == (int) f) {
                    acum = acum + " " + f;
                }//fin del if

            }//for de verificar el valor
        }//for de la tabla ascii
        return acum;

    }

    public  String alphanumerico() {
        String alfanumerica, Digito;
        int numero = 0, cposicion = 1;
        int c2 = 0;
        String z = " ";
        String alphanumerico = JOptionPane.showInputDialog("Ingrese cdena alfa numerica");
        alfanumerica = entrada.next();
        for (int k = 0; k < alfanumerica.length(); k += 2) {    //inicio for
            char y = alfanumerica.charAt(k);
            char x = alfanumerica.charAt(cposicion);
            //pasamos el caracter a String
            Digito = Character.toString(y);
            //pasamos el string a entero
            numero = Integer.parseInt(Digito);
            System.out.print(y);
            for (int j = 0; j < numero; j++) {

                z += x + " ";
            } //fin del for

            cposicion += 2;
        }  //fin for
        return z;
    }

    public  String numeroaleatorio() {
        int veces = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantas veces quiere tirar el dado\n Recuerde si saca un 4 gana!"));
        SecureRandom dado = new SecureRandom();
        String acu = "  ";
        for (int i = 1; i <= veces; i++) {
            int posibles = 1 + dado.nextInt(6);
            acu += "  " + posibles;
            if (posibles == 4) {

                i = veces;
                acu += "  woahhh " + posibles + " Saco el 4, ha ganado";

            }

        }
        return acu;
    }
}
