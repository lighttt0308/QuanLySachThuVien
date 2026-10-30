import java.util.Scanner;
public class BTT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //bai 1
        System.out.println("Nhap ma sach: ");
        String masach = sc.nextLine();
        System.out.println("Nhap ten sach: ");
        String tensach = sc.nextLine();
        System.out.println("Nhap tac gia: ");
        String tacgia = sc.nextLine();
        System.out.println("Nhap nam xuat ban: ");
        int namxuatban = sc.nextInt();
        System.out.println("Nhap don gia: ");
        float dongia = sc.nextFloat();
        System.out.println("Nhap so luong: ");
        int soluong = sc.nextInt();

        System.out.println("Ma sach: " + masach);
        System.out.println("Ten sach: " + tensach);
        System.out.println("Tac gia: " + tacgia);
        System.out.println("Nam xuat ban: " + namxuatban);
        System.out.println("Don gia: " + dongia);
        System.out.println("So luong: " + soluong);

        //Bai 2
        double thanhtien = dongia * soluong;
        System.out.println("Thanh tien: " + thanhtien);
        //Bai 3
        double phivanchuyen = dongia * 5 / 100;
        System.out.println("Phi van chuyen: " + phivanchuyen);
        //Bai 4
        double tongtien = thanhtien + phivanchuyen;
        System.out.println("Tong tien: " + tongtien);

        //BAI THUC HANH TUAN 4
        //Bai 1:
        if (dongia > 0)
            System.out.println("Don gia hop le");
        else
            System.out.println("Don gia khong hop le");

        if (soluong >= 0)
            System.out.println("So luong hop le");
        else
            System.out.println("So luong khong hop le");

        if (namxuatban > 0 && namxuatban <= 2026)
            System.out.println("Nam xuat ban hop le");
        else
            System.out.println("Nam xuat ban khong hop le");

        //Bai 2
        if (dongia < 50000)
            System.out.println("Sach gia thap");
        if (dongia >= 50000 && dongia < 100000)
            System.out.println("Sach gia trung binh");
        if (dongia >= 100000 && dongia < 200000)
            System.out.println("Sach gia cao");
        if (dongia > 200000)
            System.out.println("Sach gia dac biet");

        //Bai 3
        if (soluong == 0)
            System.out.println("Het sach");
        if (soluong >= 1 && soluong <= 5)
            System.out.println("Sap it");
        if (soluong >= 6 && soluong <= 20)
            System.out.println("Con it");
        if (soluong > 20)
            System.out.println("Con nhieu");

        //Bai 4
        int loaisach = sc.nextInt();
        switch (loaisach) {
            case 1:
                System.out.println("Sach giao khoa");
            case 2:
                System.out.println("Sach tham khao");
            case 3:
                System.out.println("Sach chuyen thanh");
            case 4:
                System.out.println("Sach khac");
        }
    }
}
