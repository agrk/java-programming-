package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in); //kullanıcıdan input almak için
        out.println("lütfen sayi giriniz:"); //printf olarak kullanılır

        Double yas= scanner.nextDouble(); //integer için input almış oldum
        // double olarak almak isterse mesela next ten sonrasını değiştirip
        // double yapmam lazım


        out.println("yaşınız:"+yas);

    }
}
