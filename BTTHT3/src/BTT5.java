import java.util.Scanner;
import java.util.ArrayList;
public class BTT5 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = 0;
//        int chon;
//        String maSach="", tenSach="";
//        int soLuong;
//        double donGia;
//        int tongSoLuong = 0;
//        double tongGiaTri = 0;
//
//        do {
//            System.out.println("\n MENU ");
//            System.out.println("1. Nhap sach");
//            System.out.println("2. Tinh tong so luong sach");
//            System.out.println("3. Tinh tong gia tri sach");
//            System.out.println("4. Thoat menu");
//            System.out.println("5. Tim sach theo ma");
//
//            System.out.print("Nhap lua chon: ");
//            chon = sc.nextInt();
//            sc.nextLine();
//
//            //bai 1
//            switch (chon) {
//                case 1:
//                    System.out.print("Nhap so luong sach: ");
//                    n = sc.nextInt();
//
//                    for (int i = 1; i <= n; i++) {
//                        System.out.println("\nNhap sach thu " + i);
//
//                        sc.nextLine();
//
//                        System.out.print("Nhap ma sach: ");
//                        maSach = sc.nextLine();
//
//                        System.out.print("Nhap ten sach: ");
//                        tenSach = sc.nextLine();
//
//                        System.out.print("Nhap so luong: ");
//                        soLuong = sc.nextInt();
//
//                        System.out.print("Nhap don gia: ");
//                        donGia = sc.nextDouble();
//
//                        tongSoLuong =tongSoLuong+ soLuong;
//                        tongGiaTri =tongGiaTri+ soLuong * donGia;
//                    }
//
//                    System.out.println("Nhap sach thanh cong!");
//                    break;
//
//                 //bài 2
//                case 2:
//                    if (n == 0) {
//                        System.out.println("Vui long nhap sach truoc!");
//                    } else {
//                        System.out.println("Tong so luong sach: " + tongSoLuong);
//                    }
//                    break;
//
//                case 3:
//                    if (n == 0) {
//                        System.out.println("Vui long nhap sach truoc!");
//                    } else {
//                        System.out.println("Tong gia tri sach: " + tongGiaTri);
//                    }
//                    break;
//
//                case 4:
//                    System.out.println("Thoat menu thanh cong!");
//                    break;
//
//                case 5:
//                        System.out.print("Nhap ma sach can tim: ");
//                        String maCanTim = sc.nextLine();
//
//
//                            if (maSach.equalsIgnoreCase(maCanTim)) {
//                                System.out.println("Tim thay sach!");
//                                System.out.println("Ma sach: " + maSach);
//                                System.out.println("Ten sach: " + tenSach);
//                            }
//                            else
//                                System.out.println("Không tìm thay sach!");
//                    break;
//            }
//
//        } while (chon != 4);
//
//        sc.close();
//    }


        //Bài tập tuần 6

        Scanner sc = new Scanner(System.in);
        // Bai 1: Mang so luong 5 cuon sach
        int[] soLuong = new int[5];
        int tong = 0;
        int max;

        // Bai 2: Danh sach ma sach
        ArrayList<String> danhSachMa = new ArrayList<>();

        // Bai 3 va bai 4: Danh sach thong tin sach
        ArrayList<String> danhSachSach = new ArrayList<>();

        int n = 0;
        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY THU VIEN =====");
            System.out.println("1. Nhap so luong 5 cuon sach");
            System.out.println("2. Hien thi, tinh tong va tim so luong lon nhat");
            System.out.println("3. Them ma sach");
            System.out.println("4. Hien thi ma sach");
            System.out.println("5. Tim ma sach");
            System.out.println("6. Xoa ma sach");
            System.out.println("7. Them sach");
            System.out.println("8. Hien thi sach");
            System.out.println("9. Tim sach");
            System.out.println("10. Xoa sach");
            System.out.println("11. Sua sach");
            System.out.println("12. Tinh tong so luong sach");
            System.out.println("13. Tinh tong gia tri sach");
            System.out.println("14. Thoat");

            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {

                // BAI 1: NHAP MANG SO LUONG
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
                        soLuong[i] = Integer.parseInt(sc.nextLine());
                    }

                    System.out.println("Nhap thanh cong!");
                    n = 5;
                    break;

                // BAI 1: HIEN THI, TINH TONG, TIM MAX
                case 2:
                    if (n == 0) {
                        System.out.println("Vui long nhap so luong sach truoc!");
                    } else {
                        tong = 0;
                        max = soLuong[0];

                        System.out.println("Danh sach so luong sach:");

                        for (int i = 0; i < 5; i++) {
                            System.out.println("Sach thu " + (i + 1) + ": " + soLuong[i]);

                            tong += soLuong[i];

                            if (soLuong[i] > max) {
                                max = soLuong[i];
                            }
                        }

                        System.out.println("Tong so luong: " + tong);
                        System.out.println("So luong lon nhat: " + max);
                    }
                    break;

                // BAI 2: THEM MA SACH
                case 3:
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();

                    danhSachMa.add(ma);

                    System.out.println("Them ma sach thanh cong!");
                    break;

                // BAI 2: HIEN THI MA SACH
                case 4:
                    if (danhSachMa.size() == 0) {
                        System.out.println("Danh sach ma sach rong!");
                    } else {
                        for (int i = 0; i < danhSachMa.size(); i++) {
                            System.out.println(danhSachMa.get(i));
                        }
                    }
                    break;

                // BAI 2: TIM MA SACH
                case 5:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();

                    if (danhSachMa.contains(maTim)) {
                        System.out.println("Tim thay ma sach!");
                    } else {
                        System.out.println("Khong tim thay ma sach!");
                    }
                    break;

                // BAI 2: XOA MA SACH
                case 6:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();

                    int viTriMa = danhSachMa.indexOf(maXoa);

                    if (viTriMa != -1) {
                        danhSachMa.remove(viTriMa);
                        System.out.println("Xoa ma sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay ma sach!");
                    }
                    break;

                // BAI 3 + BAI 4: THEM SACH
                case 7:
                    System.out.print("Nhap ma sach: ");
                    String maSach = sc.nextLine();

                    System.out.print("Nhap ten sach: ");
                    String tenSach = sc.nextLine();

                    System.out.print("Nhap so luong: ");
                    int sl = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhap don gia: ");
                    double gia = Double.parseDouble(sc.nextLine());

                    String sach = maSach + "|" + tenSach + "|" + sl + "|" + gia;

                    danhSachSach.add(sach);

                    System.out.println("Them sach thanh cong!");
                    break;

                // BAI 3 + BAI 4: HIEN THI SACH
                case 8:
                    if (danhSachSach.size() == 0) {
                        System.out.println("Danh sach sach rong!");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            String[] tt = danhSachSach.get(i).split("\\|");

                            System.out.println("\nMa sach: " + tt[0]);
                            System.out.println("Ten sach: " + tt[1]);
                            System.out.println("So luong: " + tt[2]);
                            System.out.println("Don gia: " + tt[3]);
                        }
                    }
                    break;

                // BAI 3 + BAI 4: TIM SACH
                case 9:
                    System.out.print("Nhap ma sach can tim: ");
                    String maCanTim = sc.nextLine();

                    int viTriTim = -1;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] tt = danhSachSach.get(i).split("\\|");

                        if (tt[0].equalsIgnoreCase(maCanTim)) {
                            viTriTim = i;
                            break;
                        }
                    }

                    if (viTriTim != -1) {
                        String[] tt = danhSachSach.get(viTriTim).split("\\|");

                        System.out.println("Tim thay sach!");
                        System.out.println("Ma sach: " + tt[0]);
                        System.out.println("Ten sach: " + tt[1]);
                        System.out.println("So luong: " + tt[2]);
                        System.out.println("Don gia: " + tt[3]);
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                // BAI 3 + BAI 4: XOA SACH
                case 10:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maCanXoa = sc.nextLine();

                    int viTriXoa = -1;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] tt = danhSachSach.get(i).split("\\|");

                        if (tt[0].equalsIgnoreCase(maCanXoa)) {
                            viTriXoa = i;
                            break;
                        }
                    }

                    if (viTriXoa != -1) {
                        danhSachSach.remove(viTriXoa);
                        System.out.println("Xoa sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                // BAI 3 + BAI 4: SUA SACH
                case 11:
                    System.out.print("Nhap ma sach can sua: ");
                    String maCanSua = sc.nextLine();

                    int viTriSua = -1;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] tt = danhSachSach.get(i).split("\\|");

                        if (tt[0].equalsIgnoreCase(maCanSua)) {
                            viTriSua = i;
                            break;
                        }
                    }

                    if (viTriSua != -1) {
                        System.out.print("Nhap ten sach moi: ");
                        String tenMoi = sc.nextLine();

                        System.out.print("Nhap so luong moi: ");
                        int slMoi = Integer.parseInt(sc.nextLine());

                        System.out.print("Nhap don gia moi: ");
                        double giaMoi = Double.parseDouble(sc.nextLine());

                        String sachMoi = maCanSua + "|" + tenMoi + "|" + slMoi + "|" + giaMoi;

                        danhSachSach.set(viTriSua, sachMoi);

                        System.out.println("Sua sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                // BAI 4: TINH TONG SO LUONG
                case 12:
                    int tongSoLuong = 0;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] tt = danhSachSach.get(i).split("\\|");

                        tongSoLuong += Integer.parseInt(tt[2]);
                    }

                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    break;

                // BAI 4: TINH TONG GIA TRI
                case 13:
                    double tongGiaTri = 0;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] tt = danhSachSach.get(i).split("\\|");

                        int soLuongSach = Integer.parseInt(tt[2]);
                        double donGia = Double.parseDouble(tt[3]);

                        tongGiaTri += soLuongSach * donGia;
                    }

                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;

                case 14:
                    System.out.println("Thoat chuong trinh thanh cong!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 14);

        sc.close();
    }
}