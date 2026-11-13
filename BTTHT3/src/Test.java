import java.util.ArrayList;
public class Test {
    public static void main(String args[]){

        Sach Sach1=new Sach("S001","Lập trình C","Phan Lợi",2026,100);
        Sach Sach2=new Sach("S002","CTDL&GT","Hoàng Thị Mỹ Lệ",2021,50);
        Sach Sach3=new Sach("S003","Mạng máy tính","Trần Văn Duy Long",2024,200);
        ArrayList<Sach> ds=new ArrayList<Sach>();
        ds.add(Sach1);
        ds.add(Sach2);
        ds.add(Sach3);

        System.out.println("===== DANH SACH SACH =====");

        for (int i = 0; i < ds.size(); i++) {
            System.out.println("Thong tin sach thu " + (i + 1));
            ds.get(i).hienThiThongTin();
            System.out.println("----------------------");
        }
        System.out.println("Tong so dau sach: " + ds.size());

    }
}
