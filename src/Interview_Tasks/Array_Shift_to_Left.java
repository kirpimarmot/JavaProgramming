package Interview_Tasks;

import java.util.Arrays;

public class Array_Shift_to_Left {

    public static void main(String[] args) {int[] numbers={1,2,3,4,5,6,7};

        int[] number=new int[numbers.length];//[3, 4, 5, 6, 7, 1, 2]
//                      5                          6
        for (int i = numbers.length -2,j=0; i <=number.length-1; i++,j++) {
            number[i]=numbers[j];
        }
        System.out.println(Arrays.toString(number));//[0, 0, 0, 0, 0, 1, 2]
        for (int i = 0,k=2; i <=4 ; i++,k++) {
            number[i]=numbers[k];
        }

        System.out.println(Arrays.toString(number));
    }
}