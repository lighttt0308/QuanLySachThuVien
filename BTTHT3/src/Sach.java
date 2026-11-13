public class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;


    public void hienThiThongTin(){
        System.out.println("Mã sách là: "+maSach);
        System.out.println("Tiêu đề là: "+tieuDe);
        System.out.println("Tác giả là: "+tacGia);
        System.out.println("Năm xuất bản là: "+namXuatBan);
        System.out.println("Số lượng là: "+soLuong);

    }

    public Sach(){}
    /*Yêu cầu 4: Thêm một constructor có tham số đầy đủ vào lớp Sach, cho phép
    khởi tạo tất cả các thuộc tính (maSach, tieuDe, tacGia, namXuatBan, soLuong) khi
    tạo một đối tượng Sach.*/

    public Sach(String maSach,String tieuDe,String tacGia,int namXuatBan,int soLuong)
    {
        this.maSach=maSach;
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
        this.namXuatBan=namXuatBan;
        this.soLuong=soLuong;

    }
    public String getMaSach(){
        return maSach;
    }
    public void setMaSach(String maSach){
        this.maSach=maSach;
    }

    public String getTieuDe(){
        return tieuDe;
    }
    public void setTieuDe(String tieuDe){
        this.tieuDe=tieuDe;
    }

    public String getTacGia(){
        return tacGia;
    }
    public void setTacGia(String tacGia){
        this.tacGia=tacGia;
    }

    public int getNamXuatBan(){
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan){
        if(namXuatBan>0 && namXuatBan<=2026)
            this.namXuatBan=namXuatBan;
        else
            System.out.println("Năm xuất bản không hợp lệ!");
    }

    public int getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(int soLuong){
        if(soLuong>=0)
            this.soLuong=soLuong;
        else
            System.out.println("Số Lượng không hợp lệ!");
    }





}
