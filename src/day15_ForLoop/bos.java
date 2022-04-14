package day15_ForLoop;

public class bos {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        String result = str.substring(str.indexOf("P"), str.indexOf("g ")+1);
        System.out.println("result = " + result);
    }
}
