package _31_Wrapper;

import java.util.ArrayList;

/**
 * WRAPPER
 *
 * Java có 8 kiểu dữ liệu nguyên thủy, nên cũng sẽ có 8 lớp Wrapper
 * – Lớp Byte là lớp Wrapper cho kiểu dữ liệu byte.
 * – Lớp Short là lớp Wrapper cho kiểu dữ liệu short.
 * – Lớp Integer là lớp Wrapper cho kiểu dữ liệu int.
 * – Lớp Long là lớp Wrapper cho kiểu dữ liệu long.
 * – Lớp Float là lớp Wrapper cho kiểu dữ liệu float.
 * – Lớp Double là lớp Wrapper cho kiểu dữ liệu double.
 * – Lớp Character là lớp Wrapper cho kiểu dữ liệu char.
 * – Lớp Boolean là lớp Wrapper cho kiểu dữ liệu boolean.
 *
 * mỗi lớp Wrapper sẽ chứa một kiểu nguyên thủy bên trong nó.
 * các lớp Wrapper cũng là các lớp có giá trị không thể thay đổi được, tiếng Anh gọi là Immutable.
 * các lớp Wrapper là các lớp final, và vì vậy bạn không thể nào tạo được lớp con của chúng.
 *
 * các lớp Wrapper sẽ giúp chúng ta chuyển đổi qua lại giữa một kiểu dữ liệu nguyên thủy sang kiểu dữ liệu đối tượng và ngược lại.
 * vì là kiểu đối tượng, nên có giá trị mặc định là null, và giá trị null này sẽ được sử dụng trong 1 số trường hợp
 * các kiểu đối tượng còn mang theo nó nhiều phương thức hữu dụng, làm phong phú hơn tính ứng dụng của kiểu dữ liệu.
 * một số cấu trúc khác bên trong ngôn ngữ Java, như các cấu trúc về các danh sách như ArrayList hay Vector đều chứa
 * đựng các tập hợp kiểu dữ liệu đối tượng thay vì kiểu nguyên thủy, nên việc biết và vận dụng các lớp Wrapper là một bắt buộc.
 * ngoài ra thì kiểu dữ liệu đối tượng sẽ thích hợp hơn trong việc thực thi đa luồng (multithreading) và đồng bộ hóa (synchronization)
 */

public class les01_convert {
    public static void main(String[] args) {
        int a = 100;

        // BOXING với toán tử new
//        Integer iii = new Integer(a); // khuyến cáo không nên dùng

        // BOXING ( nguyên thủy -> đối tượng ) theo kiểu Autoboxing
        Integer i = a;
        Byte b = 1;
        Boolean boo = false;
        Short s = 22;
        Float f = 3.555f;
        Long l = 1234L;
        Double d = 1233.12312;
        // Đây cũng là một dạng Autoboxing mà bạn sẽ được biết khi học đến bài về Collection
        ArrayList<Integer> arrInt1 = new ArrayList<Integer>();
        arrInt1.add(25);

        System.out.println(i);

        // UNBOXING ( đối tượng -> nguyên thủy ) dùng xxxValue() method, xxx là tên của kiểu dữ liệu nguyên thủy
        // cách này không nên dùng, Java 5.0 đã hỗ trợ auto
//        int ii = i.intValue();
//        byte bb = b.byteValue();
//        boolean booo = boo.booleanValue();
//        short ss = s.shortValue();
//        float ff = f.floatValue();
//        long ll = l.longValue();
//        double dd = d.doubleValue();
//        ArrayList<Integer> arrInt2 = new ArrayList<Integer>();
//        arrInt2.add(25); // Autoboxing
//        int arr0 = arrInt2.get(0).intValue(); // Unboxing

        // UNBOXING ( đối tượng -> nguyên thủy ) theo kiểu Autoboxing
        int ii = i;
        byte bb = b;
        boolean booo = boo;
        short ss = s;
        float ff = f;
        long ll = l;
        double dd = d;
        ArrayList<Integer> arrInt2 = new ArrayList<Integer>();
        arrInt2.add(25);
        int arr0 = arrInt2.get(0); // Unboxing

    }
}
