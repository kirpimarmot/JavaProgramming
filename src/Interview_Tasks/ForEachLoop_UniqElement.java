package Interview_Tasks;

public class ForEachLoop_UniqElement {

    public static void main(String[] args) {




            String[] words ={"Layan", "Layan", "Oleksandr",
                    "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};

            for (String each : words) { // each:"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"

                              //  dış lopp tan bir elemanı iç loop ta karşılştırıyoruz var sa eğer sayaç yani frequency bir atar
                int frequency=0;

                for (String word : words) { // word:"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"
                    if (word.equals(each)){
                        frequency++;
                    }
                }
                if (frequency==1){
                    System.out.println(each);
                }

            }


    }
}

