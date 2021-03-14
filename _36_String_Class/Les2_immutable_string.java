package _36_String_Class;

public class Les2_immutable_string {
    public static void main(String args[]){
        // tạo đối tượng "vietjack"
        String s="vietjack";

        // đối tượng "vietjack vietjackteam" được tạo ra, nhưng s chưa được gán tham chiếu mới
        s.concat(" vietjackteam");//phuong thuc concat() phu them vao cuoi chuoi
        System.out.println(s);//se in vietjack vi string la immutable

        // lúc này s tham chiếu đến instance mới "vietjack vietjackteam", nhưng đối tượng "vietjack" vẫn còn trong pool
        s=s.concat(" vietjackteam");
        System.out.println(s);

        String s1 = s;
        s = "Hello";

        System.out.println(s);
        System.out.println(s1);
    }
}
