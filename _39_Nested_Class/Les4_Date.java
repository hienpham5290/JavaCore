package _39_Nested_Class;

public class Les4_Date {
    public int ngay, thang, nam;

    public class Time {
        public int gio, phut, giay;

        public void show() {
            System.out.println("Date: " + ngay+"-"+thang+"-"+nam);
            System.out.println("Time: " + gio+":"+phut+":"+giay);
        }
    }
}
