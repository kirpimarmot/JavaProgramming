package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year =2000;
        int number = 2;
        String result = "";
        if (number>=1&&number<=12){
            switch (number){
                 case 2:
                    result = (year%4==0)? "29 Days" : "28 Days";
                    break;
                case 4: case 6: case 9: case 11:// this is way to apply the ||(or Logic)
                    result = "30 Days";
                    break;
                default:
                    result = "31 Days";
            }
        }else{
            System.out.println("Invalid Numbers");
        }
        System.out.println(result);











    }
}

/*
4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12
			If(1~12){
			}else{
				Invalid
			}
 */