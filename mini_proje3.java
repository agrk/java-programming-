/* Kullanıcıdan alıdığınız iki sayının değerleerini değiştirin */

package com.company;

import java.util.Scanner;

public class mini_proje3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birinci_sayi;// = scanner.nextInt();
        int ikinci_sayi; // = scanner.nextInt();
        System.out.print("Birinci Sayı : ");
        birinci_sayi=scanner.nextInt();

        System.out.print("İkinci Sayı: ");
        ikinci_sayi= scanner.nextInt();

        System.out.println("Değiştirilmeden önce....");
        System.out.println("Birinci sayı : " + birinci_sayi + " İkinci sayı : " + ikinci_sayi);
        int gecici=birinci_sayi;
        birinci_sayi=ikinci_sayi;
        ikinci_sayi=gecici;

        System.out.println("Değiştirildikten sonra....");
        System.out.println("Birinci sayı : " + birinci_sayi + " İkinci sayı : " + ikinci_sayi);


    }
}