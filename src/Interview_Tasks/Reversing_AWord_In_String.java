package Interview_Tasks;

public class Reversing_AWord_In_String {

    public static void main(String[] args) {


        String name = "I love Java";
        System.out.println(name);

        String ad = name.substring(name.lastIndexOf("l"), name.lastIndexOf(" "));
        System.out.println(ad);

        String result="";
        for (int i = ad.length()-1; i >=0 ; i--) {
            result+=ad.charAt(i);
        }
        System.out.println(result);
        String isim = name.replaceFirst("love", result);

        System.out.println(isim);

        System.out.println("----------------------------------------------------------");


        String name1="Adam Altun Savcı Altun";

        String k = name1.substring(name.lastIndexOf(" S"),name.lastIndexOf(" "));
        System.out.println(k);

        String result1="";
        for (int i = k.length()-1; i >=0 ; i--) {
            result+=k.charAt(i);
        }
        System.out.println("result = " + result);

        String a= name.replaceFirst("Savcı",result);
        System.out.println("a = " + a);
    }
}
