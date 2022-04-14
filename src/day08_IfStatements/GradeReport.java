package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
     /*
        System.out.println( true == !false ); // true
        System.out.println( !true != false ); // false
        System.out.println( !false == true); // true
        System.out.println(!!false); //false
        System.out.println(!!!true); // false
         */
        int score = 85 ; // 0 ~ 100

        boolean a = score >= 90 && score <= 100   ;
        boolean b = score >= 80 && score < 90;
        //boolean b = score >= 80 && score !a; // if the score is not A, but score is greater than 80

        boolean c = score >= 70 && score < 80;
        //boolean c = !a && !b && score >=70 // another way of putting
        boolean d = score >=60 && score <70;
        boolean f = score >=0 && score <70;
        // boolean f = !a && !b && !c && !d;

        if(a){ // if the student get A
            System.out.println("Excellent");
        }
        if(b){ // if the student get B
            System.out.println("Great");
        }
        if(c){ // if the student get C
            System.out.println("Good");
        }
        if(d){ // if the student get d
            System.out.println("Passed");
        }
        if(f) { // if the student get F
            System.out.println("Failed");
        }




    }
}

/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */