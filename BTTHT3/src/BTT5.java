import java.util.Scanner;

public class BTT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int chon;
        String maSach="", tenSach="";
        int soLuong;
        double donGia;
        int tongSoLuong = 0;
        double tongGiaTri = 0;

        do {
            System.out.println("\n MENU ");
            System.out.println("1. Nhap sach");
            System.out.println("2. Tinh tong so luong sach");
            System.out.println("3. Tinh tong gia tri sach");
            System.out.println("4. Thoat menu");
            System.out.println("5. Tim sach theo ma");

            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            //bai 1
            switch (chon) {
                case 1:
                    System.out.print("Nhap so luong sach: ");
                    n = sc.nextInt();

                    for (int i = 1; i <= n; i++) {
                        System.out.println("\nNhap sach thu " + i);

                        sc.nextLine();

                        System.out.print("Nhap ma sach: ");
                        maSach = sc.nextLine();

                        System.out.print("Nhap ten sach: ");
                        tenSach = sc.nextLine();

                        System.out.print("Nhap so luong: ");
                        soLuong = sc.nextInt();

                        System.out.print("Nhap don gia: ");
                        donGia = sc.nextDouble();

                        tongSoLuong =tongSoLuong+ soLuong;
                        tongGiaTri =tongGiaTri+ soLuong * donGia;
                    }

                    System.out.println("Nhap sach thanh cong!");
                    break;

                 //bài 2
                case 2:
                    if (n == 0) {
                        System.out.println("Vui long nhap sach truoc!");
                    } else {
                        System.out.println("Tong so luong sach: " + tongSoLuong);
                    }
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("Vui long nhap sach truoc!");
                    } else {
                        System.out.println("Tong gia tri sach: " + tongGiaTri);
                    }
                    break;

                case 4:
                    System.out.println("Thoat menu thanh cong!");
                    break;

                case 5:
                        System.out.print("Nhap ma sach can tim: ");
                        String maCanTim = sc.nextLine();


                            if (maSach.equalsIgnoreCase(maCanTim)) {
                                System.out.println("Tim thay sach!");
                                System.out.println("Ma sach: " + maSach);
                                System.out.println("Ten sach: " + tenSach);
                            }
                            else
                                System.out.println("Không tìm thay sach!");
                    break;
            }

        } while (chon != 4);

        sc.close();
    }
}