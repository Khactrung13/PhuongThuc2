/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhuongThuc {
    static Scanner sc = new Scanner(System.in);
    public static void ThongBao(){
        System.out.println("Lap trinh Java 2021!");
    }
    public static void Bai2(){
        String str ;
        System.out.println("Nhap chuoi: ");
        str = sc.nextLine();
        System.out.println(str);
    
    }
    public static void Bai3(){     
        System.out.println("NHap 1 thong diep: ");
        String s = sc.nextLine();

        System.out.println("Nhap x: ");
        int x = Integer.parseInt(sc.nextLine());
        while (x<=0){
            System.out.println("Nhap lai x :");
            x = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < x; i++) {
            System.out.println(s);
        }
        
    }
    public static double bai4(double a , double b ){
        System.out.println("-----Giai phuong trinh bac 1 -----");
        double x = 0;
        if(a==0){
            System.out.println("Phuong trinh vo nghiem!");
        }
        else{
            x = (double)-b/a;
            System.out.println("Nghiem cua phuong trinh bac 1 la : " + x);
        }
        return x;
    }
    public static void Bai5(double a ,double  b , double c){
        System.out.println("-----Giai phuong trinh bac 2 -----");
         if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
           return;
        } 
        double delta = b*b - 4*a*c;
        double x1;
        double x2;
    
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
    public static void LuaChon(){
        System.out.println("1.Giai phuong trinh bac 1 ");
        System.out.println("2.Giai phuong trinh bac 2 ");
        System.out.println("Vui long nhap lua chon:");
        int n = sc.nextInt();
        double a ,b ,c;
        switch(n){
            case 1 :
                    System.out.println("----Giai phuong trinh bac ----- "); 
                    System.out.println("Nhap a: ");
                    a= sc.nextDouble();
                    System.out.println("Nhap b: ");
                    b = sc.nextDouble();
                    bai4(a, b);
                    break;
            case 2 :
                    System.out.println("-----Giai phuong trinh bac 2----- ");
                    System.out.println("Nhap a: ");
                    a= sc.nextDouble();
                    System.out.println("Nhap b: ");
                    b = sc.nextDouble();
                    System.out.println("Nhap c: ");
                    c = sc.nextDouble();
                    Bai5(a, b, c);
                    break;
            default : 
                    System.out.println("Moi nhap lai ");
                    break;
        }
    }
    public static void Luachon2(){
        System.out.println("1.Giai phuong trinh bac 1 ");
        System.out.println("2.Giai phuong trinh bac 2 ");
        System.out.println("Vui long nhap lua chon:");
        int n = sc.nextInt();
        double a , b ,c ;
        switch(n){
            case 1 : 
                    System.out.println("Nhap a: ");
                     a= sc.nextDouble();
                    System.out.println("Nhap b: ");
                     b = sc.nextDouble();
                    bai4(a, b);
                    System.out.println("1.TIEP TUC ");
                    System.out.println("2.THOAT CHUONG TRINH");
                    System.out.println("Nhap lua chon tiep theo");
                    int m =sc.nextInt();
                    switch(m){
                        case 1 : 
                            LuaChon();
                            break;
                        case 2 :
                            break;
                        default:
                            System.out.println("Nhap lai lua chon");
                    }
                    break;
            case 2 : 
                    System.out.println("Nhap a: ");
                    a= sc.nextDouble();
                    System.out.println("Nhap b: ");
                    b = sc.nextDouble();
                    System.out.println("Nhap c: ");
                     c = sc.nextDouble();
                    Bai5(a, b, c);
                    System.out.println("1.TIEP TUC ");
                    System.out.println("2.THOAT CHUONG TRINH");
                    System.out.println("Nhap lua chon tiep theo");
                    m =sc.nextInt();

                    switch(m){
                        case 1 : 
                            LuaChon();
                            break;
                        case 2 :
                            break;
                        default:
                            System.out.println("Nhap lai lua chon");
                    }
                    break;
            default :
                    System.out.println("Nhap lai lua chon: ");
                    LuaChon();
                    break;
    }
}        
    public static void main(String[] args) {
//        ThongBao();
//        Bai2();
//        Bai3();
//        LuaChon();
        Luachon2();
    }
}
