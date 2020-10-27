/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thayha_01;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ThayHa_01 {

    /**
     * @param args the command line arguments
     */
    public static int solonnhat(int a, int b,int c){
        int s=0;
        if(a>b){
            s=a;
        }else{
            if(c>b){
                s=c;
            }
            else{
                s=b;
            }
        }
        return s;
    }
    public static float pt1(int a,int b){
        float s=(float) (-b*1.0/(a));
        return s;
    }
    public static void pt2(int a,int b,int c){
        if(a==0){
            float x= (float) (-c*1.0/b);
            System.out.println("Phương trình có 1 nghiệm là"+x);
        }else{
            float d=(float) (Math.pow(b, 2))-4*a*c;
            if(d>0){
                float x1=(float) (-b+Math.sqrt(d))/(2*a);
                float x2=(float) (-b-Math.sqrt(d))/(2*a);
                System.out.println("Phương trình có 2 nghiệm là: \n x1="+x1+"\n x2="+x2);
            }else{
                if(d==0){
                    float xx= -b/(2*a);
                    System.out.println("Phương trình có nghiệm kép là: \n x="+xx);
                }else{
                    System.out.println("Phương trình vô nghiệm");
                }
            }
        }
    }
    public static void hpt(int a1,int b1,int c1,int a2,int b2,int c2){
        int a=a1*b2-a2*b1;
        int b=c1*b2-c2*b1;
        int c=a1*c2-a2*c1;
        float x=(float) ((float) b*1.0/a);
        float y = (float) (c*1.0/a);
        System.out.println("X="+x);
        System.out.println("X="+y);
    }
    public static void stg(int a,int b,int c){
        int s=0;
        if(a>b && a<c || a>c && a<b){
            s=a;
        }
        if(b>a && b<c || b>c && b<a){
            s=b;
        }
        if(c>a && c<b || c>b && c<a){
            s=c;
        }
        System.out.println("Số trung gian là: "+ s);
    }
    public static void karaoke(int hs,int he){
        int s=0;
        if(hs<18){
            if(he<18){
                s=(he-hs)*45000;
                System.out.println("Tiền karaoke là: "+s+" vnđ");
            }
            else{
                System.out.println("lớn hơn 18");
                s=(18-hs)*45000+(he-18)*45000;
                System.out.println("Tiền karaoke là: "+s+" vnđ");
            }
        }
        else{
            s=(hs-hs)*60000;
            System.out.println("Tiền karaoke là: "+s+" vnđ");
        }
    }
    public static int ngay(int thang,int nam){
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                System.out.println("số năm  ko hợp lệ");
                }
        return thang;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap= new Scanner(System.in);
        System.out.println("----------Số Lớn nhất-----------");
        System.out.println("Nhap so a: ");
        int a = nhap.nextInt();
        System.out.println("Nhap so b: ");
        int b = nhap.nextInt();
        System.out.println("Nhap so c: ");
        int c= nhap.nextInt();
        System.out.println("so lon nhat la: "+solonnhat(a,b,c));
        System.out.println("----------PTB1-----------");
        System.out.println("Nhập số thứ nhất: ");
        int aa = nhap.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int bb = nhap.nextInt();
        System.out.println("Nghiệm x= "+pt1(aa,bb));
        System.out.println("----------PTB2-----------");
        System.out.println("Nhap so a: ");
        int a22 = nhap.nextInt();
        System.out.println("Nhap so b: ");
        int b22 = nhap.nextInt();
        System.out.println("Nhap so c: ");
        int c22= nhap.nextInt();
        System.out.println("Phương trình có nghiệm là: ");
        pt2(a22,b22,c22);
        System.out.println("----------Giải hệ phương trình bậc nhất-----------");
        System.out.println("Nhập a1: ");
        int a1=nhap.nextInt();
        System.out.println("Nhập b1: ");
        int b1=nhap.nextInt();
        System.out.println("Nhập c1: ");
        int c1=nhap.nextInt();
        System.out.println("Nhập a2: ");
        int a2=nhap.nextInt();
        System.out.println("Nhập b1: ");
        int b2=nhap.nextInt();
        System.out.println("Nhập c1: ");
        int c2=nhap.nextInt();
        hpt(a1,b1,c1,a2,b2,c2);
        System.out.println("----------Tìm số trung gian của 3 số-----------");
        System.out.println("Nhap so thứ nhất: ");
        int a3 = nhap.nextInt();
        System.out.println("Nhap so thứ hai: ");
        int b3 = nhap.nextInt();
        System.out.println("Nhap so thứ ba: ");
        int c3= nhap.nextInt();
        stg(a3,b3,c3);
        System.out.println("----------Tính tiền karaoke-----------");
        System.out.println("Giờ bắt đầu vào hát: ");
        int hs=nhap.nextInt();
        System.out.println("Giờ kết thúc khi hát: ");
        int he=nhap.nextInt();
        karaoke(hs,he);
        System.out.println("----------in số ngày tương ứng-----------");
        System.out.println("Nhập tháng: ");
        int thang=nhap.nextInt();
        System.out.println("Nhập năm: ");
        int nam=nhap.nextInt();
        System.out.println("Ngay : "+ngay(thang,nam));
    }
    
}
