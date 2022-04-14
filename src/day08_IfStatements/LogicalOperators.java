package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizenship = "UK";

        boolean isEligible = age >= 18 && citizenship == "USA";
        System.out.println( name + " is eligible to vote: " + isEligible  );

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;

        boolean isEligibleForCredit = creditScore >= 700 && age2 >= 21 && income >= 60000;
        System.out.println(name2+ "is eligible for credit: "+ isEligibleForCredit);

        System.out.println("----------------------------" );

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age >=18 && (gender == 'M' || gender == 'F');
        //                     21>=18    &&      ( F == M  || F==F)
        //                       true    &&      ( False   || True)
        //                       True    &&            True
        //                             True
        System.out.println(name3 + " is eligible to register: "+ isEligible3);

        System.out.println("----------------------------------------" );

        String name4 = "Elaine";
        String countryOfBirth = "USA";
        boolean mariedToUsCitizen = false;
        boolean isElligible4 = countryOfBirth == "USA" || mariedToUsCitizen == true;
        System.out.println(name4+ "is elligible to US citizenShip: " +isElligible4);
        //                            True           ||  false
        //                                   true
        System.out.println("-----------------------------------" );

        String name5 = "Kursat";
        double gpa = 2.5;
        double familyIncome = 50000;
        boolean isEligible5 = gpa>=3.5 || familyIncome<60000;
        //                      false  || true
        //                           true
        System.out.println(name5+ "is eligible for scholarship: " + isEligible5);
        System.out.println("-----------------------------" );
        
        boolean result2 = true;
        System.out.println("result2 = " + result2);
        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("-----------------------------------" );
        int score = 55;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("failed = " + failed);
        System.out.println("passed = " + passed);







    }

}
