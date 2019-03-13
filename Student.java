package Assignment_2;

import java.util.Scanner;

public class Student {
    public int studentcode;
    public double mediumscore;
    public int age;
    public int lop;

    public void inputInfo() {
        System.out.println("Nhap ma sinh vien:");
        Scanner scanner = new Scanner(System.in);
        studentcode = scanner.nextInt();

        System.out.println("nhap diem trung binh:");
        mediumscore = scanner.nextDouble();

        System.out.println("nhap tuoi:");
        age = scanner.nextInt();

        System.out.println("nhap lop:");
        lop = scanner.nextInt();
    }

    public void showInfo() {
        System.out.println("Thong tin sinh vien:");
        System.out.println(studentcode + " - tuoi:" + age);
    }

    public double mediumscore(){
        if (mediumscore >= 8.0)
            System.out.println("Duoc hoc bong");
        else
            System.out.println("Khong duoc hoc bong");
    }
}
