import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {
        // ASCII JAVA ART/Title Screen
        System.out.println("  #####     #######   #        #####       ######");
        System.out.println(" #     #   #       #  #        #    #    #      #");
        System.out.println(" #         #       #  #        #     #   #       ");
        System.out.println(" #   ####  #       #  #        #      #   #####  ");
        System.out.println(" #     #   #       #  #        #     #          #");
        System.out.println(" #     #   #       #  #        #    #    #      #");
        System.out.println("  #####     #######   #######  ####       ###### ");
        System.out.println();
        System.out.println("           #####    #     #  #       #");
        System.out.println("          #      #   #   #   ##     ##");
        System.out.println("          #           # #    # #   # #");
        System.out.println("          #   ####     #     #   #   #");
        System.out.println("          #     #      #     #       #");
        System.out.println("          #     #      #     #       #");
        System.out.println("           #####       #     #       #");
        System.out.println();
        System.out.println("----------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        // Welcome Message
        System.out.println("Welcome To the Gym!");
        // Prompt to begin gym journey
        System.out.println("Are You Ready To Get Shredded? (yes/no)");
        System.out.println("----------------------------------------------------------");

        // Makes sure the input is in lower case for code to run
        String answer = sc.next().toLowerCase();
        // Switch Case for answer
        switch (answer) {
            case "yes":
                System.out.println("Let the Journey Begin!");
                System.out.println("----------------------------------------------------------");
                // 5 "basic"/base scenes
                System.out.println("What would you like to train first? (1-6)");
                System.out.println("1. Legs");
                System.out.println("2. Back");
                System.out.println("3. Chest");
                System.out.println("4. Arms");
                System.out.println("5. Core");
                System.out.println("6. Other");
                String answer2 = sc.next();
                System.out.println("----------------------------------------------------------");
                switch (answer2) {
                    case "1":

                        System.out.println("Legs! Great choice! Lets get started");
                        System.out.println("Lets start with squat. What is your body weight?");

                        int bodyWeight = sc.nextInt();
                        int halfWeight = bodyWeight / 2;

                        System.out.println("Nice! Lets start with 50% of your body weight (" + halfWeight  + ") and work our way up.");
                        System.out.println("For the first set, lets try to get 10 reps");
                        System.out.println();
                        System.out.println("Wow! you handled that very well!!");
                        System.out.println();
                        System.out.println("Now lets see if you can do your body weight for 5 reps!");

                        int reps = 0;
                        for (int i = 1; i <= 5; i++) {

                            boolean success = Math.random() > 0.3;
                            if (success) {
                                reps++;
                            }
                        }
                        System.out.println();
                        System.out.println("You were able to complete " + reps + " rep(s)! Not bad!");

                        boolean continueLifting = true;

                        while (continueLifting) {
                            System.out.println("Would you like to continue lifting today? (yes/no)");
                            String continueInput = sc.next().toLowerCase();

                            // Update the boolean
                            continueLifting = continueInput.equals("yes");

                            if (continueLifting) {
                                System.out.println("Alright then, lets move on to dumbell flys");
                                System.out.println();
                                System.out.println("You seemed to handle the bench pretty well so lets start with 15 pounds");

                                for (int j = 5; j<15; j++) {
                                    boolean success2 = Math.random() > 0.1;
                                    if (success2) {
                                        reps++;
                                    }
                                }
                                System.out.println();
                                System.out.println("Nice job! " + reps + " reps is impressive!");
                                System.out.println();
                            } else {
                                System.out.println("Good lift today! Go home and rest up for tomorrow!");
                                break;
                            }
                        }

                        break;

                    case "2":
                        System.out.println("Back! Great choice! Lets get started");
                        System.out.println("Lets start with bent over rows. What is your body weight?");

                        int bodyWeight2 = sc.nextInt();
                        int halfWeight2 = bodyWeight2 / 3;

                        System.out.println("Nice! Lets start with a third of your body weight (" + halfWeight2  + ") and work our way up.");
                        System.out.println("For the first set, lets try to get 10 reps");

                        System.out.println("Was that easy? (yes/no)");
                        String easyInput2 = sc.next();
                        boolean easy2 = easyInput2.equals("yes");

                        if (easy2) {
                            System.out.println("Wow! Thats great! Lets move up 10lbs to " + ((bodyWeight2 / 3 ) + 10));
                        } else {
                            int lessWeight = (bodyWeight2 / 3) - 10;
                            System.out.println("I totally understand! Lets move down 10lbs to " + lessWeight + "lbs");
                        }
                        break;

                    case "3":
                        System.out.println("Chest! Great choice! Lets get started");
                        System.out.println("Lets start with bench press. What is your body weight?");

                        int bodyWeight3 = sc.nextInt();
                        int halfWeight3 = bodyWeight3 / 2;

                        System.out.println("Nice! Lets start with half of your body weight (" + halfWeight3  + ") and work our way up.");
                        System.out.println("For the first set, lets try to get 10 reps");

                        System.out.println("Was that easy? (yes/no)");
                        String easyInput3 = sc.next();
                        boolean easy3 = easyInput3.equals("yes");

                        if (easy3) {
                            System.out.println("Wow! Thats great! Lets move up 15lbs to " + ((bodyWeight3 / 2 ) + 15));
                        } else {
                            int lessWeight = (bodyWeight3 / 2) - 10;
                            System.out.println("I totally understand! Lets move down 10lbs to " + lessWeight + "lbs");
                        }
                        break;

                    case "4":
                        System.out.println("Arms! Great choice! Lets get started");
                        break;

                    case "5":
                        System.out.println("Core! Great choice! Lets get started");
                        break;

                    case "6":
                        System.out.println("You're on your own");
                        break;

                    default:
                        System.out.println("Invalid Response, please select one of the listed choices");
                }

                break;

            case "no":
                System.out.println("Then Leave.");

            default:
                System.out.println("Invalid Response, enter either: yes or no");
        }
    }
}