import java.util.Scanner;
public class BTT3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //bai 1
        System.out.println("Nhap ma sach: ");
        String masach=sc.nextLine();
        System.out.println("Nhap ten sach: ");
        String tensach=sc.nextLine();
        System.out.println("Nhap tac gia: ");
        String tacgia=sc.nextLine();
        System.out.println("Nhap nam xuat ban: ");
        int namxuatban=sc.nextInt();
        System.out.println("Nhap don gia: ");
        float dongia=sc.nextFloat();
        System.out.println("Nhap so luong: ");
        int soluong=sc.nextInt();

        System.out.println("Ma sach: " +masach);
        System.out.println("Ten sach: " +tensach);
        System.out.println("Tac gia: " +tacgia);
        System.out.println("Nam xuat ban: " +namxuatban);
        System.out.println("Don gia: " +dongia);
        System.out.println("So luong: " +soluong);

        //Bai 2
        double thanhtien = dongia * soluong;
        System.out.println("Thanh tien: " +thanhtien);
        //Bai 3
        double phivanchuyen = dongia * 5 / 100;
        System.out.println("Phi van chuyen: " +phivanchuyen);
        //Bai 4
        double tongtien=thanhtien + phivanchuyen;
        System.out.println("Tong tien: " +tongtien);


    }

}
