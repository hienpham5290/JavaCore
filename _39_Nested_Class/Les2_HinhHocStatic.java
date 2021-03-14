package _39_Nested_Class;

public class Les2_HinhHocStatic {
    private static final float PI = 3.14F;
    private static String tenHinh;
    public ToaDo toaDo;

    // Constructor
    public Les2_HinhHocStatic(int x, int y) {
        this.tenHinh = "Hình Học";
        this.toaDo = new ToaDo();
        this.toaDo.x = x;
        this.toaDo.y = y;
    }

    public static class ToaDo {
        int x;
        int y;

        void XuatThongTin() {
            System.out.println("Tên hình: " + tenHinh);
            System.out.println("Tọa độ: " + x + " - " + y);
        }
    }
}
