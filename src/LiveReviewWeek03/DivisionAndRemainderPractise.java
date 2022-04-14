package LiveReviewWeek03;

public class DivisionAndRemainderPractise {
    public static void main(String[] args) {

        int inputSeconds = 4000;
        int hours, minutes, seconds;
        seconds = inputSeconds%60;//calculate remaining seconds
        minutes = (inputSeconds/60) % 60;//remaining minutes
        hours = inputSeconds/3600;// how many hours we have
        String clock = "Hours : " +hours+ "Minutes : "+minutes+"Socends: "+seconds;
        System.out.println("clock = " + clock);


    }
}
