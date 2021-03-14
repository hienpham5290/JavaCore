package _27_Object_Class.Pack4_Equals_and_hashCode.Equals.EqualsString;

/**
 *      equals()
 *
 * public boolean equals(Object obj) : là method của Object class, trong Object class, equals() method được cài đặt để
 * so sánh về mặt location - reference ( hay tham chiếu )
 *
 * toán tử == cũng được dùng để chỉ so sánh về mặt location - reference ( tham chiếu )
 *
 * vì là method của Object class, nên tất cả các class trong Java, kể cả class do người dùng xây dựng đều kế thừa nó
 * nếu muốn sử dụng equals() method để so sánh về mặt ngữ nghĩa, trong class phải override lại method này
 */

public class EqualsClassExample {
    public static void main(String[] args) {
        // khởi tạo 2 đối tượng thuộc kiểu String, có nội dung ngữ nghĩa giống nhau
        String string1 = new String("This is a String");
        String string2 = new String("This is a String");

        System.out.println("string1 ==     string2 ??? - " + (string1 == string2)); // false ( 2 String object có 2 location khác nhau )
        System.out.println("string1 equals string2 ??? - " + ((string1.equals(string2)))); // true ( 2 String object có cùng 1 nội dung )
    }
}
