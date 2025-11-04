/*
Lucas Hutchinson
November 3rd
APCS A
This is a Gold's gym simulation based off of the famous commercial gym, Golds Gym.
You are to get shredded by going through the various different exercises that it makes you perform.
To play simply follow along with the prompts and respond accordingly.
 */

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
        boolean keepTraining = true;
        while (keepTraining) {

            // Switch case determining wether or not user wants to get shredded
            switch (answer) {
                case "yes":
                    // menu of different muscle group options
                    System.out.println("Let the Journey Begin!");
                    System.out.println("----------------------------------------------------------");
                    // 5 "basic"/base scenes
                    System.out.println("What would you like to train first? (1-4)");
                    System.out.println("1. Legs");
                    System.out.println("2. Back");
                    System.out.println("3. Chest");
                    System.out.println("4. Arms");
                    String answer2 = sc.next();
                    System.out.println("----------------------------------------------------------");

                    switch (answer2) {
                        case "1":
                        case "Legs":
                        case "legs":

                            System.out.println("Legs! Great choice! Lets get started");
                            // squat is SCENE ONE
                            System.out.println("Lets start with squat. What is your body weight?");

                            int bodyWeight = sc.nextInt();
                            int halfWeight = bodyWeight / 2;

                            System.out.println("Nice! Lets start with 50% of your body weight (" + halfWeight + ") and work our way up.");
                            System.out.println("For the first set, lets try to get 10 reps");
                            System.out.println();
                            System.out.println("Wow! you handled that very well!!");
                            System.out.println();
                            System.out.println("Now lets see if you can do your body weight for 5 reps!");

                            // for loop using rand to determine the amount of reps performed.
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

                            // for loop to limit the amount of lifts while still allowing for 1 switch
                            for (int i = 0; i < 2; i++) {
                                // first "ending" opportunity
                                System.out.println("Would you like to continue lifting today? (yes/no)");
                                String continueInput = sc.next().toLowerCase();

                                if (continueInput.equals("yes")) {
                                    if (i == 0) {
                                        // B split squats = SCENE TWO
                                        System.out.println("Alright then, let's move on to db bulgarian split squats");
                                        System.out.println();
                                        System.out.println("You seemed to handle the squat pretty well so let's start with 25 pounds");

                                        // for loop using rand to determine the amount of reps performed.
                                        for (int j = 5; j < 10; j++) {
                                            boolean success2 = Math.random() > 0.1;
                                            if (success2) {
                                                reps++;
                                            }
                                        }

                                        System.out.println();
                                        System.out.println("Nice job! " + reps + " reps is impressive!");
                                        System.out.println();
                                    }
                                    // If this was the second continuation, automatically stop
                                    if (i == 1) {
                                        System.out.println("You've reached the max amount of leg exercises today");
                                        // second "ending possibility
                                        System.out.println("Would you like to switch to a different muscle group (yes/no)");
                                        String switchInput = sc.next().toLowerCase();
                                        if (switchInput.equals("No")) {
                                            // third "ending" possibility
                                            System.out.println("Good lift today! Go home and rest up for tomorrow!");
                                            keepTraining = false;
                                        }
                                        break;
                                    }

                                } else {
                                    System.out.println("Good lift today! Go home and rest up for tomorrow!");
                                    break;
                                }
                            }

                            break;

                        case "2":
                        case "Back":
                        case "back":
                            System.out.println("Back! Great choice! Lets get started");
                            System.out.println("Lets start with bent over rows. What is your body weight?");

                            int bodyWeight2 = sc.nextInt();
                            int thirdWeight = bodyWeight2 / 3;
                            // barbell rows = SCENE THREE
                            System.out.println("Nice! Lets start with barbell bent over rows with a third of your body weight (" + thirdWeight + ") and work our way up.");
                            System.out.println("For the first set, lets try to get 10 reps");

                            System.out.println("Was that easy? (yes/no)");
                            String easyInput2 = sc.next();
                            boolean easy2 = easyInput2.equals("yes");

                            if (easy2) {
                                System.out.println("Wow! That's great! Lets move up 10lbs to " + (thirdWeight + 10));
                            } else {
                                int lessWeight = thirdWeight - 10;
                                System.out.println("I totally understand! Lets move down 10lbs to " + lessWeight + "lbs");
                            }

                            for (int i = 0; i < 2; i++) {
                                System.out.println("Would you like to continue lifting today? (yes/no)");
                                String continueInput = sc.next().toLowerCase();

                                if (continueInput.equals("yes")) {
                                    if (i == 0) {
                                        // pull ups = SCENE FOUR
                                        System.out.println("Alright then, let's move on to pull ups");
                                        System.out.println();
                                        System.out.println("You seemed to handle the rows pretty well so lets aim for 5 pull ups");

                                        // for loop using rand to determine the amount of reps performed.
                                        int reps2 = 0;
                                        for (int j = 5; j < 5; j++) {
                                            boolean success2 = Math.random() > 0.5;
                                            if (success2) {
                                                reps2++;
                                            }
                                        }

                                        System.out.println();
                                        System.out.println("Nice job! " + reps2 + " pull ups is impressive!");
                                        System.out.println();
                                    }
                                    // If this was the second continuation, automatically stop
                                    if (i == 1) {
                                        System.out.println("You've reached the max amount of back exercises today");
                                        System.out.println("Would you like to switch to a different muscle group (yes/no)");
                                        String switchInput = sc.next().toLowerCase();
                                        if (switchInput.equals("No")) {
                                            System.out.println("Good lift today! Go home and rest up for tomorrow!");
                                            keepTraining = false;
                                        }
                                        break;
                                    }

                                } else {
                                    System.out.println("Good lift today! Go home and rest up for tomorrow!");
                                    break;
                                }
                            }
                            break;


                        case "3":
                        case "chest":
                        case "Chest":
                            System.out.println("Chest! Great choice! Lets get started");
                            // bench = SCENE FIVE
                            System.out.println("Lets start with bench press. What is your body weight?");

                            int bodyWeight3 = sc.nextInt();
                            int halfWeight3 = bodyWeight3 / 2;

                            System.out.println("Nice! Lets start with half of your body weight (" + halfWeight3 + ") and work our way up.");
                            System.out.println("For the first set, lets try to get 10 reps");

                            System.out.println("Was that easy? (yes/no)");
                            String easyInput3 = sc.next();
                            boolean easy3 = easyInput3.equals("yes");

                            if (easy3) {
                                System.out.println("Wow! That's great! Lets move up 15lbs to " + ((bodyWeight3 / 2) + 15));

                                String easyInput4 = sc.next();
                                boolean easy4 = easyInput4.equals("yes");
                                System.out.println("Now was that easy? (yes/no)");

                                if(easy4) {
                                    System.out.println("Okay lets move up in weight on more time to" + (bodyWeight3 / 2) + 30);

                                    // for loop using rand to determine the amount of reps performed
                                    int reps3 = 0;
                                    for (int a = 0; a < 10; a ++ ) {
                                        boolean success3 = Math.random() > 0.5;
                                        if (success3) {
                                            reps3++;
                                        }
                                    }
                                    System.out.println("Wow you were able to complete " + reps3 + " reps!");
                                }
                            } else {
                                int lessWeight = (bodyWeight3 / 2) - 10;
                                System.out.println("I totally understand! Lets move down 10lbs to " + lessWeight + "lbs");
                                System.out.println("Great job! You were able to complete all 10 reps!");
                                System.out.println("I say lets put bench to rest for today");
                            }

                            for (int i = 0; i < 2; i++) {
                                System.out.println("Would you like to continue lifting today? (yes/no)");
                                String continueInput = sc.next().toLowerCase();

                                if (continueInput.equals("yes")) {
                                    if (i == 0) {
                                        // DB flys = SCENE SIX
                                        System.out.println("Alright then, let's move on to dumbell flys");
                                        System.out.println();
                                        System.out.println("You seemed to handle the bench pretty well so lets try to get 15 reps with the 15s");

                                        // for loop using rand to determine the amount of reps performed.
                                        int reps2 = 0;
                                        for (int j = 5; j < 15; j++) {
                                            boolean success2 = Math.random() > 0.5;
                                            if (success2) {
                                                reps2++;
                                            }
                                        }

                                        System.out.println();
                                        System.out.println("Nice job! " + reps2 + " dumbell flys is great!");
                                        System.out.println();
                                    }
                                    // If this was the second continuation, automatically stop
                                    if (i == 1) {
                                        System.out.println("You've reached the max amount of chest exercises today");
                                        System.out.println("Would you like to switch to a different muscle group (yes/no)");
                                        String switchInput = sc.next().toLowerCase();
                                        if (switchInput.equals("No")) {
                                            System.out.println("Good lift today! Go home and rest up for tomorrow!");
                                            keepTraining = false;
                                        }
                                        break;
                                    }

                                } else {
                                    System.out.println("Good lift today! Go home and rest up for tomorrow!");
                                }
                                break;

                            }

                        case "4":
                        case "armss":
                        case "Arms":
                            System.out.println("Arms! Great choice! Lets get started");
                            System.out.println("When it comes to arms I love to start with shoulders");
                            // military press = SCENE SEVEN
                            System.out.println("So I think we should start with military press");

                            System.out.println("You seem to be a pretty strong guy so lets begin with 85lbs");
                            // for loop using rand to determine the amount of reps performed.
                            int reps3 = 0;
                            for (int j = 0; j < 10; j++) {
                                boolean success = Math.random() > 0.5;
                                if (success) {
                                    reps3++;
                                }
                            }

                            System.out.println("Wow! You were able to complete " + reps3 + " reps! Splendid job");

                            for (int i = 0; i < 2; i++) {
                                System.out.println("Would you like to continue lifting today? (yes/no)");
                                String continueInput = sc.next().toLowerCase();

                                if (continueInput.equals("yes")) {
                                    if (i == 0) {
                                        System.out.println("Alright then, let's move on to triceps");
                                        System.out.println();
                                        // Tricep pushdowns = SCENE EIGHT
                                        System.out.println("Shoulders seem to have gone well for you so lets try 100lb on the tricep pushdown machine.");

                                        // for loop using rand to determine the amount of reps performed.
                                        int reps2 = 0;
                                        for (int j = 5; j < 15; j++) {
                                            boolean success2 = Math.random() > 0.5;
                                            if (success2) {
                                                reps2++;
                                            }
                                        }

                                        System.out.println();
                                        System.out.println("Nice job! " + reps2 + " reps is great!");
                                        System.out.println();
                                    }
                                    // If this was the second continuation, automatically stop
                                    if (i == 1) {
                                        System.out.println("You've reached the max amount of arm exercises today");
                                        System.out.println("Would you like to switch to a different muscle group (yes/no)");
                                        String switchInput = sc.next().toLowerCase();
                                        if (switchInput.equals("No")) {
                                            System.out.println("Good lift today! Go home and rest up for tomorrow!");
                                            keepTraining = false;
                                        }
                                        break;
                                    }

                                } else {
                                    System.out.println("Good lift today! Go home and rest up for tomorrow!");
                                }
                            }

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
}