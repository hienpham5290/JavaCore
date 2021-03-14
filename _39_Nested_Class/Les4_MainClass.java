package _39_Nested_Class;

public class Les4_MainClass {
    public static void main(String[] args) {
        Les4_Date date = new Les4_Date();
        date.ngay = 15;
        date.thang = 12;
        date.nam = 2020;

        Les4_Date.Time time = date.new Time();
        time.gio = 12;
        time.phut = 30;
        time.giay = 55;

        time.show();
    }
}
