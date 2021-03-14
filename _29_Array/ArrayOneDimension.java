package _29_Array;

import java.util.Arrays;
import java.util.List;

/**
 * ARRAY
 * <p>
 * thông thường, Array ( mảng ) là 1 tập hợp các phần tử có cùng kiểu, được lưu trữ gần nhau trong bộ nhớ
 * Array trong Java là 1 object chứa các phần tử có kiểu dữ liệu giống nhau
 * Array là 1 cấu trúc dữ liệu nơi lưu trữ các phần tử giống nhau
 * Array trong Java chỉ có thể lưu trữ 1 tập các phần tử có số lượng phần tử cố định
 * Array trong Java lưu các phần tử theo chỉ số, chỉ số của phần tử đầu tiên là 0
 */

public class ArrayOneDimension {
    public static void main(String[] args) {
        // khai báo 1 mảng và khởi tạo giá trị cho mảng với new
        int[] Arr1 = new int[]{43, 12, 43, 54, 66, 23, 72, 234, 77, 88};

        // khai báo 1 mảng và khởi tạo giá trị cho mảng không có new
        int[] Arr2 = {98, 23, 54, 12, 52, 62, 23, 64, 62, 33};

        // khai báo 1 mảng và chỉ định số phần tử của mảng với new, khởi tạo giá trị cho phần tử của mảng sau
        int[] Arr3 = new int[10];

        // khai báo 1 mảng, nhưng khởi tạo giá trị cho mảng sau, nhưng khi khởi tạo phải có new
        int[] Arr4;
        // khởi tạo giá trị cho mảng đã khai báo với toán tử new
        Arr4 = new int[]{31, 43, 33, 55, 76, 12, 64, 98, 89, 45};

        int[] Arr5;

        // dùng copyOf của Arrays class sao chép Arr1 sang Arr3
        Arr3 = Arrays.copyOf(Arr1, 10);

        // dùng copyOfRange của Arrays class sao chép Arr2 sang Arr5
        Arr5 = Arrays.copyOfRange(Arr2, 5, 16);

        // dùng toString của Arrays class in ra 4 mảng
        System.out.println("Arr1: " + Arrays.toString(Arr1));
        System.out.println("Arr2: " + Arrays.toString(Arr2));
        System.out.println("Arr3: " + Arrays.toString(Arr3));
        System.out.println("Arr4: " + Arrays.toString(Arr4));
        System.out.println("Arr5: " + Arrays.toString(Arr5));

        // dùng sort sắp xếp lại mảng 1, 2, 4
        Arrays.sort(Arr1);
        Arrays.sort(Arr2);
        Arrays.sort(Arr4);
        Arrays.sort(Arr5);
        System.out.println();

        // in 4 mảng lại lần nữa
        System.out.println("Arr1: " + Arrays.toString(Arr1));
        System.out.println("Arr2: " + Arrays.toString(Arr2));
        System.out.println("Arr3: " + Arrays.toString(Arr3));
        System.out.println("Arr4: " + Arrays.toString(Arr4));
        System.out.println("Arr5: " + Arrays.toString(Arr5));
        System.out.println("Mảng 3 sao chép từ mảng 1, nhưng vẫn chưa được sort, tiến hành sort mảng 3");
        Arrays.sort(Arr3);
        System.out.println("Arr3: " + Arrays.toString(Arr3));

        // dùng equals để so sánh 2 mảng
        System.out.println(Arrays.equals(Arr1, Arr2));
        System.out.println(Arrays.equals(Arr3, Arr4));
        System.out.println(Arrays.equals(Arr1, Arr5));

        // dùng binarySearch để tìm kiếm trong mảng
        System.out.println(Arrays.binarySearch(Arr1, 25));
        System.out.println(Arrays.binarySearch(Arr2, 25));
        System.out.println(Arrays.binarySearch(Arr3, 25));
        System.out.println(Arrays.binarySearch(Arr4, 25));
        System.out.println(Arrays.binarySearch(Arr5, 25));

        // An array of Integer
        Integer arr[] = { 4, 6, 1, 8, 3, 9, 7, 4, 2 };

        // Creates a wrapper list over arr[]
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list); // [4, 6, 1, 8, 3, 9, 7, 4, 2]

        // list.add(10); // UnsupportedOperationException
        // list.remove(0); // UnsupportedOperationException

        list.set(0, 5); // overwrite the elements
        System.out.println(list); // [5, 6, 1, 8, 3, 9, 7, 4, 2]
        System.out.println();

        List<int[]> list1 = Arrays.asList(Arr1);
        System.out.println("list1: " + list1 + " what đờ heo, hok hiểu");
        System.out.println();

        Arrays.fill(Arr1, 0);
        Arrays.fill(Arr2, 0);
        Arrays.fill(Arr3, 0);
        Arrays.fill(Arr4, 0);
        Arrays.fill(Arr5, 0);

        // dùng fill cho tất cả các mảng đều có phần tử là 0
        System.out.println("Arr1: " + Arrays.toString(Arr1));
        System.out.println("Arr2: " + Arrays.toString(Arr2));
        System.out.println("Arr3: " + Arrays.toString(Arr3));
        System.out.println("Arr4: " + Arrays.toString(Arr4));
        System.out.println("Arr5: " + Arrays.toString(Arr5));
    }
}
