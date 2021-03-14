package _39_Nested_Class;

public class Les1_HinhHoc {
    public static final float PI = 3.14F;
    public String tenHinh;
    public ToaDo toaDo;

    // Constructor
    public Les1_HinhHoc() {
        this.tenHinh = "Hình Hoc";
        this.toaDo = new ToaDo();
    }

    public Les1_HinhHoc(int x, int y) {
        this.tenHinh = "Hình Học";
        this.toaDo = new ToaDo();
        this.toaDo.x = x;
        this.toaDo.y = y;
    }


    public class ToaDo {
        int x;
        int y;

        public void XuatThongTin() {
            System.out.println("Hình: " + tenHinh);
            System.out.println("Toa Do: ( " + x + " ; " + y + ")");
        }
    }
}
