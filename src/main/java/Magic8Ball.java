import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 */
public class Magic8Ball {

    // 1. Make a main method that includes all the steps below
    public static void main(String[] args) {


        // 2. Get the user to enter a question for the magic 8-ball to answer
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("**************          *****************");
        System.out.println("************              ***************");
        System.out.println("***********  MAGIC 8 BALL  **************");
        System.out.println("************              ***************");
        System.out.println("**************          *****************");
        String keepAsking = "y";
        while (!keepAsking.equals("n")) {
            System.out.println("");
            System.out.println("");
            System.out.println("Ask a question below to peer through the Mist: ");
            String userQuestion = scanner.nextLine();
            System.out.println("");
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            System.out.println("");
            System.out.println("");
            String[] responses = new String[]{"It is certain.",
                    "It is decidedly so.",
                    "Without a doubt.",
                    "Yes definitely.",
                    "You may rely on it.",
                    "As I see it, yes.",
                    "Most likely.",
                    "Outlook good.",
                    "Yes.",
                    "Signs point to yes.",
                    "Reply hazy, try again.",
                    "Ask again later.",
                    "Better not tell you now.",
                    "Cannot predict now.",
                    "Concentrate and ask again.",
                    "Don't count on it.",
                    "My reply is no.",
                    "My sources say no.",
                    "Outlook not so good.",
                    "Very doubtful."};
            int randomNumber = new Random().nextInt(20);
            for (int i = 0; i < responses.length; i++) {
                if (randomNumber == i) {
                    System.out.println("*****************************************");
                    System.out.println();
                    System.out.println("           " + responses[i]);
                    System.out.println();
                    System.out.println("*****************************************");
                }
            }
            System.out.println("");
            System.out.println("");


            if (randomNumber < 10) {
                System.out.println("*         !! GOOD FORTUNE !!            *");
            } else if (randomNumber > 14) {
                System.out.println("*           xx BAD LUCK XX              *");
            } else {
                System.out.println("*       ?? FUTURE UNCERTAIN ??          *");
            }


            System.out.println("");
            System.out.println("");

            System.out.print("Would you like to ask again?? (y / n): ");
            keepAsking = scanner.nextLine();
        }
            if (keepAsking.equals("n")){
                System.out.println("");
                System.out.println("");
                System.out.println("*****************************************");
                System.out.println("          ...Until next time...          ");
                System.out.println("*****************************************");
            }






        // 3. Make a variable and initialize it to a random number.
        //
        //    // Get random a number from: [0, 1, 2, 3]
        //    int randNumber = new Random().nextInt(4);


        // 4. If the random number is 0

        // Tell the user "Yes"


        // 5. If the random number is 1

        // Tell the user "No"


        // 6. If the random number is 2

        // Tell the user a custom response


        // 7. If the random number is 3

        // Tell the user a custom response
    }
}


