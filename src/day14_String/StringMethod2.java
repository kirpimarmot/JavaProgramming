package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java" ,"Python");//new string object ==> "Pythin is fun, I love learning Python"
        System.out.println("str = "+str);
        System.out.println("str2 = "+str2);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo","gmail");//new string object ==> JohnSmith@gmail.com
        System.out.println("email = "+email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", "");// new object "Java Java C# C# C++ C++"
        System.out.println("sentence2 = "+sentence2);
        sentence2 = sentence2.replace("   ", " ");
        System.out.println("sentence2 = "+sentence2);


        String s = "Dog Dog Dog Dog Dog";
        System.out.println("s = " +s);
        s = s.replace("Dog", "Cat");
        System.out.println("s = " +s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C#"," Java" );
        //s2 = s2.replace("C# is c","Java is c" );
        System.out.println("s2 = "+ s2);


        String s3 = "Java";
        s3 = s3.replace("a", "e");//"Jeve
        System.out.println(s3);

        System.out.println("_______________________________" );

        String result = "Java Java Java";
        //result = result.replace("Java", "Python");
        System.out.println("result = "+result);
        result = result.replaceFirst("Java", "Python");
        System.out.println("result = "+result);

        String result2 = "C# is fun, C# is Cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println("result2 = "+result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("a", "o");
        System.out.println("result3 = " +result3);






    }
}
