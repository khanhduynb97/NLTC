package Lab_session3;

import java.util.Scanner;

public class Tamgiac {
    int a,b,c;

    double S;

    float C,p;

    Scanner sc;



    public void inputInfo(){

        System.out.println("Nhap canh thu nhat:");
        Scanner scanner = new Scanner(System.in);
        a=sc.nextInt();

        System.out.println("Nhap canh thu hai:");
        Scanner scanner = new Scanner(System.in);
        b=sc.nextInt();

        System.out.println("Nhap canh thu ba:");
        Scanner scanner = new Scanner(System.in);
        c=sc.nextInt();

        System.out.println("Do dai ba canh: a= "+a+" b= "+b+" c= "+c);

    }

    public boolean kiemtraTamGiac(){

        if((a+b>c)&&(b+c>a)&&(c+a>b)&&a>0&&b>0&&c>0) return true;

        return false;

    }

    public void tinhChuVi(){

        if(kiemtraTamGiac()==true){

            C=(a+b+c);

            System.out.println("Chu vi tam giac: "+C);

        }else System.out.println("Ba so vua nhap khong tao thanh mot tam giac.");

    }

    public void tinhDienTich(){

        p=C/2;

        if(kiemtraTamGiac()==true){

            S=Math.sqrt(p*(p-a)*(p-b)*(p-c));

            System.out.println("Dien tich tam giac: "+S);



        }else{
            System.out.println("");
        }

    }
}

