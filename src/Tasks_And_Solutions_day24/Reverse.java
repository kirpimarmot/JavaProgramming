package Tasks_And_Solutions_day24;

public class Reverse {


    public static String reverse(String str){
        String result="";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result+=str.concat(i+"");
        }
        return result;
    }



}
/*
3. create a method named reverse that passes one string parameter, the method can return the reversed string
				Ex:
					str = "Java";
					reverse(str) ==> avaJ
 */