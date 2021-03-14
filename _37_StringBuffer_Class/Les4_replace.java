package _37_StringBuffer_Class;

public class Les4_replace {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello World, Hello Java, Hello Android");
        StringBuffer sb2 = new StringBuffer("Hi");

        sb1.replace(0, 5, String.valueOf(sb2));
        System.out.println(sb1); // Hi World, Hello Java, Hello Android
        System.out.println(sb1.length()); // 35

        String s1 = "Noopppppppppppppppppppppppppppppp"; // Hi Noopppppppppppppppppppppppppppppp
        sb1.replace(3,39, s1);
        System.out.println(sb1);
    }
}
