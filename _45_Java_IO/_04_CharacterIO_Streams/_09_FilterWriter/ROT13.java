package _45_Java_IO._04_CharacterIO_Streams._09_FilterWriter;

public class ROT13 {
    public static int rotate(int inChar) {
        int outChar;

        if (inChar >= 'a' && inChar <= 'z') {
            outChar = (((inChar - 'a') + 13) % 26) + 'a';
        } else if (inChar >= 'A' && inChar <= 'Z') {
            outChar = (((inChar - 'A') + 13) % 26) + 'A';
        } else {
            outChar = inChar;
        }

        return outChar;
    }
    
    // TEST
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z' ; i++) {
            char n = (char) rotate(i);
            System.out.println(i + " " + n);
        }
        for (char i = 'A'; i < 'Z'; i++) {
            char n = (char) rotate(i);
            System.out.println(i + " " + n);
        }
    }
}
