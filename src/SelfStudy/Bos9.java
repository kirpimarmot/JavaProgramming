package SelfStudy;

import java.util.Arrays;

public class Bos9{
    public static void main(String[] args) {

        String[] arr1 = {"savci", "onur", "Ezgi", "Kursat"};
        String[] arr2 = {"ali", "Orhan", "Emel", "Kadir"};

        String[] arrays = new String[arr1.length+arr2.length];

        int i=0;

        for (String hepsi : arr1){
            arrays[i++]=hepsi;
        }

        for (String hepsi : arr2){
            arrays[i++]=hepsi;
        }

        System.out.println(Arrays.toString(arrays));

    }

    public static String[] merge(String[] arr1, String[] arr2) {

    String[] arrays = new String[arr1.length+arr2.length];

        int i=0;

        for (String hepsi : arr1){
            arrays[i++]=hepsi;
        }

        for (String hepsi : arr2){
            arrays[i++]=hepsi;
        }
        return arrays;
    }
// burda da normal for ile yapilisi var
    /* // bu da for ile yapilisi 53 satira dikkat et
        String [] total = new String[arr1.length+ arr2.length];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
              total [j] = arr1[i];
              j++;

        }
        int k= 0;
        for (int i = 0; i < arr2.length; i++) {
            total[arr1.length+k]= arr2[i];
            k++;
        }

        System.out.println(Arrays.toString(total));
   }



    public static String[] mergerler(String[] arr1, String[] arr2) {
        String [] total = new String[arr1.length+ arr2.length];

        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            total [j] = arr1[i];
            j++;

        }
        int k= 0;
        for (int i = 0; i < arr2.length; i++) {
            total[arr1.length+k]= arr2[i];
            k++;
        }

        return total;
    } */


    
// burda da void metod olarak yapilisi var
    private static void merger1(String[] arr1, String[] arr2) {
        String[] result= new String[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[i+arr1.length]=arr2[i];
        }
        System.out.println(Arrays.toString(result));
    }




}




