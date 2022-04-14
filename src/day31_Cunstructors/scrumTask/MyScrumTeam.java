package day31_Cunstructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        //4 testers objects
        Tester tester1 = new Tester("layan", 11, "QA", 110000);
        Tester tester2 = new Tester("Ali", 43, "SDET", 142000);
        Tester tester3 = new Tester("Alex", 44, "SE", 135000);
        Tester tester4 = new Tester("Lala", 23, "SDET", 115000);

        Tester[] testers = {tester2,tester3,tester4};

        //4 developers objects
        Developer developer1 =new Developer("Olga", 22, "Java Developer", 125000);
        Developer developer2 =new Developer("Aygun", 39, "Java MAster", 185000);
        Developer developer3 = new Developer("Tunc", 28, "Software Developer", 135000);
        Developer developer4= new Developer("Sinem", 13, "Senior Developer",200000);

        Developer[] developers = {developer2,developer3,developer4};

        // 1 ScrumTeam Object
        ScrumTeam scrumTeam =new ScrumTeam("Nigara", "Huseyin", "Neira", 14);

        scrumTeam.addTester(tester1);
        scrumTeam.addDeveloper(developer1);

        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(developers);

        System.out.println(scrumTeam);

        System.out.println("-------------------------------------------------------");

        for (Tester eachTester:scrumTeam.testersList) {
            System.out.println(eachTester.name+" : "+eachTester.salary);
        }

        System.out.println("---------------------------------------");

        for (Developer eachDeveloper:scrumTeam.developersList) {
            System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);
        }

        System.out.println("----------------------------------------");

        scrumTeam.removeTester(23);
        scrumTeam.removeDeveloper(22);
        System.out.println(scrumTeam);
        







    }
}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */