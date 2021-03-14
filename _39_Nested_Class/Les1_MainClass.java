package _39_Nested_Class;

public class Les1_MainClass {
    public static void main(String[] args) {
        Les1_HinhHoc hinhHoc = new Les1_HinhHoc(10, 20);
        // toaDo dưới đây chỉ là biến thành viên của lớp Les1_HinhHoc
        hinhHoc.toaDo.XuatThongTin();

        // khởi tạo 1 đối tượng của ToaDo thông qua đối tượng của Les1_HinhHoc
        // Vì ToaDo là inner class của Les1_HinhHoc
        // lúc này toaDoNew là 1 đối tượng riêng biệt
        Les1_HinhHoc hinhHoc1 = new Les1_HinhHoc();
        Les1_HinhHoc.ToaDo toaDoNew = hinhHoc1.new ToaDo();
        toaDoNew.XuatThongTin();
    }
}
