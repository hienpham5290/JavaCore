package _39_Nested_Class;

public class Les2_MainClass {
    public static void main(String[] args) {
        Les2_HinhHocStatic hinhHocStatic = new Les2_HinhHocStatic(10, 20);
        hinhHocStatic.toaDo.XuatThongTin();

        Les2_HinhHocStatic.ToaDo toaDo= new Les2_HinhHocStatic.ToaDo();
        toaDo.XuatThongTin();
    }
}
