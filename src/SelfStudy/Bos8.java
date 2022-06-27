package SelfStudy;

public class Bos8 {

    public static void main(String[] args) {


        String name = "I love Java";

        String ad = name.substring(name.lastIndexOf(" l"), name.lastIndexOf(" "));
        System.out.println(ad);

        String result="";
        for (int i = ad.length()-1; i >=0 ; i--) {
            result+=ad.charAt(i);
        }
        System.out.println(result);
        String isim = name.replaceFirst("love", result);

        System.out.println(isim);
    }
}
