package Interview_Tasks;

public class Email_Verification {

    public static void main(String[] args) {

        String email = "example@gmail.com";  // true
        String email1 = "example@hotmail.co.uk"; // true
        String email2 = "@gmail.com"; //false


        // String[] arr={email,email1,email2};


        boolean result = solution(email1);


    }


    private static boolean solution(String email) {
        boolean result = true;

        int qIndex = email.indexOf("@");
        int datIndex = email.lastIndexOf(".");
        if (email.contains("@") && email.contains(".") && qIndex < datIndex && qIndex > 0) {

            System.out.println("Valid email");
        } else {
            System.out.println("Invalid  email");
        }

        return result;

    }
}

