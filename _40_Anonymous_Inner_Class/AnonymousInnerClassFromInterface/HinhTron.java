package _40_Anonymous_Inner_Class.AnonymousInnerClassFromInterface;

public class HinhTron implements HinhHoc {
    private String tenHinh = "Hình Tròn";
    private float banKinh;

    // Constructor
    public HinhTron() {
    }
    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public void NhapBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public float TinhChuVi() {
        return (2*PI*this.banKinh);
    }

    @Override
    public float TinhDienTich() {
        return (PI*this.banKinh*this.banKinh);
    }

    @Override
    public void XuatThongTin() {
        System.out.println("Ten hinh : " + this.tenHinh);
        System.out.println("Ban kinh : " + this.banKinh);
        System.out.println("Chu vi   : " + this.TinhChuVi());
        System.out.println("Dien tich: " + this.TinhDienTich());
    }
}
