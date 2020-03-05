/* bir aracın kilometrede ne kadar yaıktıpı ve kaç kilometre yol yaptığı
bilgilerini alın ve sürücünün toplam ne kadar ödemesi gerektiğini hesaplayın
 */

package com.company;

import java.util.Scanner;

public class mini_proje2 {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("aracınız kilometrede kaç kuruş yakıyor?(ornek: 0,32) : ");
        double kurus=scanner.nextDouble();

        System.out.print("aracınızla kaç kilometre gittiniz? : ");
        int km=scanner.nextInt();
        System.out.println("toplam ödemeniz gereken tutar : " + (kurus * km) + "tl dir....");



    }
}
