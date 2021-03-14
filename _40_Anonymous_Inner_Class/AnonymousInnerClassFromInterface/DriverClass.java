package _40_Anonymous_Inner_Class.AnonymousInnerClassFromInterface;

public class DriverClass {
    public static void main(String[] args) {
        // Khởi tạo 1 đối tượng từ 1 class cụ thể
        // class cụ thể đó implements từ 1 interface
        HinhTron hinhTron = new HinhTron();
        hinhTron.NhapBanKinh(5);
        hinhTron.TinhChuVi();
        hinhTron.TinhDienTich();
        hinhTron.XuatThongTin();

        System.out.println();

        // Khởi tạo 1 đối tượng dựa trên những đặc điểm của interface
        // mà không cần khai báo 1 class cụ thể implements interface đó
        // vì không có class cụ thể, nên phải dựa vào interface như dưới đây
        HinhHoc hinhKhongTen = new HinhHoc() {
            // vẫn có thể khai báo thuộc tính
            float banKinh;

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
                System.out.println("Hình học : " + "Chưa biết tên");
                System.out.println("Ban kính : " + this.banKinh);
                System.out.println("Chu vi   : " + this.TinhChuVi());
                System.out.println("Dien tich: " + this.TinhDienTich());
            }
        };

        hinhKhongTen.NhapBanKinh(6);
        hinhKhongTen.XuatThongTin();
    }
}
