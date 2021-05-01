package _44_Collection_Framework._14_Collections_class;

/*
    sử dụng Collections.copy(destList, srcList) để copy (sao chép) srcList vào destList
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _07_copy_method {
    public static void main(String[] args) {
        // khởi tạo list thứ nhất
        List<String> firstList = new ArrayList<>();
        firstList.add("10");
        firstList.add("20");
        firstList.add("30");
        System.out.println("Elements of firstList: " + firstList);

        // khởi tạo list thứ hai
        List<String> secondList = new ArrayList<>();
        secondList.add("one");
        secondList.add("two");
        secondList.add("three");
        System.out.println("Elements of secondList: " + secondList);

        // copy list thứ nhất vào list thứ hai
        Collections.copy(secondList, firstList);

        // show các phần tử của list thứ hai
        System.out.println("secondList's elements after copy firstList: " + secondList);

        // khởi tạo list thứ ba
        List<String> thirdList = new ArrayList<>();
        thirdList.add("one");
        thirdList.add("two");
        thirdList.add("three");
        thirdList.add("four");
        thirdList.add("five");

        // show các phần tử của list thứ ba
        System.out.println("Elements of thirdList: " + thirdList);

        // copy list thứ nhất vào list thứ ba
        Collections.copy(thirdList, firstList);

        // show các phần tử của list thứ ba
        System.out.println("thirdList's elements after copy firstList: " + thirdList);

        // khởi tạo list thứ tư
        List<String> fourthList = new ArrayList<>();
        fourthList.add("1st");
        fourthList.add("2nd");

        // show các phần tử của list thứ tư
        System.out.println("Elements of fourthList: " + fourthList);

//        // copy list thứ nhất vào list thứ tư, do size() của list thứ tư nhỏ hơn list thứ nhất
//        // IndexOutOfBoundsException sẽ bị ném ra nếu copy list có size() lớn và
//        // paste vào list có size() nhỏ
//        Collections.copy(fourthList, firstList);
    }
}