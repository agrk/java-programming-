/*kullanıcıdan aldığımız boy ve kilo değerlerine göre kullanıcının
benden kütle indexini bulma

Beden kütle indexi: kilo/boy(m) *boy(m)
 */



package com.company;

import java.util.Scanner;

public class mini_proje {
    public static void main(String[]args){

        Scanner scanner =new Scanner(System.in);

        System.out.println("kilonuzu giriniz: "); //println şeklinde alıdğımızda
                                                  // alt satıra geçiyor eğer yazmazsak
                                                  //yanına yazmış olacağım
        int kilo= scanner.nextInt();
        System.out.println("boyunuzu giriniz: (örnek: 1,72) ");
        double boy = scanner.nextDouble();

        double bki=kilo/(boy * boy);

        System.out.println("beden kitle indexiniz: " + bki);




    }
}
