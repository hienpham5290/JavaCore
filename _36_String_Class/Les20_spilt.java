package _36_String_Class;

import java.util.Arrays;

public class Les20_spilt {
	public static void main(String[] args) {
		String s = "Welcomexxxtoxxsplitxxworld";
		System.out.println(s);
		System.out.println();

		System.out.println("__________only regex__________");
		String[] arr1 = s.split("x");
		System.out.println(Arrays.toString(arr1));

		System.out.println();
		System.out.println("__________regex & limit__________");
		System.out.println("\nlimit = -1");
		String[] arr2 = s.split("x", -1);
		System.out.println(Arrays.toString(arr2));

		System.out.println("\nlimit = 0");
		String[] arr3 = s.split("x", 0);
		System.out.println(Arrays.toString(arr3));

		System.out.println("\nlimit = 1");
		String[] arr4 = s.split("x", 1);
		System.out.println(Arrays.toString(arr4));

		System.out.println("\nlimit = 2");
		String[] arr5 = s.split("x", 2);
		System.out.println(Arrays.toString(arr5));

		System.out.println("\nlimit = 3");
		String[] arr6 = s.split("x", 3);
		System.out.println(Arrays.toString(arr6));

		System.out.println("\nlimit = 4");
		String[] arr7 = s.split("x", 4);
		System.out.println(Arrays.toString(arr7));

		System.out.println("\nlimit = 5");
		String[] arr8 = s.split("x", 5);
		System.out.println(Arrays.toString(arr8));


	}
}