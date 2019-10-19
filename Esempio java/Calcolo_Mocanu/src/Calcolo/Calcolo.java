/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calcolo;

import java.util.Scanner;

/**
 *
 * @author mocanu.ronald
 */
public class Calcolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int b, h, area, perimetro;
        Scanner tastiera = new Scanner(System.in);

        System.out.print("Inserisci la base: ");
        b = tastiera.nextInt();
        System.out.print("Inserisci l'altezza: ");
        h = tastiera.nextInt();

        System.out.print("Area: " + calcolo(b, h, 'a'));
        System.out.print("Perimetro: " + calcolo(b, h, 'p'));

    }

    public static int calcolo(int b, int h, char c) {

        switch (c) {
            case 'p':
                return 2 * (b + h); //break
            case 'a':
                return b * h; //break
            default:
                return 0; //break
        }
    }
}
