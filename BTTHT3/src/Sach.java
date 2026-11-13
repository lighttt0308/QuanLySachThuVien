public class Sach {
    public String maSach;
    public String tieuDe;
    public String tacGia;
    public int namXuatBan;
    public int soLuong;

    public void hienThiThongTin(){
        System.out.println("Mã sách là: "+maSach);
        System.out.println("Tiêu đề là: "+tieuDe);
        System.out.println("Tác giả là: "+tacGia);
        System.out.println("Năm xuất bản là: "+namXuatBan);
        System.out.println("Số lượng là: "+soLuong);

    }
    public Sach(String maSach,String tieuDe,String tacGia,int namXuatBan,int soLuong)
    {
        this.maSach=maSach;
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
        this.namXuatBan=namXuatBan;
        this.soLuong=soLuong;

    }
}
