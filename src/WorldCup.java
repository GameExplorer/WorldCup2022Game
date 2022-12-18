import java.util.*;

public class WorldCup {
    public static void main(String[] args) {
        System.out.println("Welcome to the World Cup 2022.");
        groupStage();
    }
    public static void groupStage() {
        //Enter the name of team
        System.out.println("Write down your country and begin playing");
        System.out.print("Enter the name of your team: ");
        Scanner team = new Scanner(System.in);

        boolean hasNextString = team.hasNextLine();

        if(hasNextString) {
            String myTeam = team.nextLine();
            System.out.println("You team is " + myTeam);

            int max = 6;
            int min = 1;

            int mypoints = 0;
            int opponentPoints_0 = 0;
            int opponentPoints_1 = 0;
            int opponentPoints_2 = 0;

            //Other teams, if player choose the team that already exists replace the team
            System.out.println("Pick a number between 1 and 6");
            Scanner myNumber = new Scanner(System.in);
            int number = myNumber.nextInt();

            if (number >= 1 && number <= 6) {

                int random_num1 = (int) (Math.random() * (max - min + 1) + min);
                int random_num2 = (int) (Math.random() * (max - min + 1) + min);
                int random_num3 = (int) (Math.random() * (max - min + 1) + min);
                //System.out.println(random_num);
                int opponentNum1 = random_num1;
                int opponentNum2 = random_num2;
                int opponentNum3 = random_num3;

                int opponentPoints1 = 0;
                int opponentPoints2 = 0;
                int opponentPoints3 = 0;

                System.out.println(" ");
                System.out.println(opponentNum1);
                System.out.println(opponentNum2);
                System.out.println(opponentNum3);

                if (number > opponentNum1) {
                    System.out.println("You won!");
                    mypoints += 3;
                } else if (number == opponentNum1) {
                    System.out.println("Draw");
                    mypoints += 1;
                    opponentPoints1 += 1;
                } else {
                    System.out.println("You lost!");
                    opponentPoints1 += 3;

                }

                if (number > opponentNum2) {
                    System.out.println("You won!");
                    mypoints += 3;
                } else if (number == opponentNum2) {
                    System.out.println("Draw");
                    mypoints += 1;
                    opponentPoints2 += 1;

                } else {
                    System.out.println("You lost!");
                    opponentPoints2 += 3;
                }

                if (number > opponentNum3) {
                    System.out.println("You won!");
                    mypoints += 3;
                } else if (number == opponentNum3) {
                    System.out.println("Draw");
                    mypoints += 1;
                    opponentPoints3 += 1;

                } else {
                    System.out.println("You lost!");
                    opponentPoints3 += 3;
                }
                if (opponentNum1 > opponentNum3) {
                    opponentPoints1 += 3;
                } else if (opponentNum1 == opponentNum3) {
                    opponentPoints1 += 1;
                    opponentPoints3 += 1;

                } else {
                    opponentPoints3 += 3;
                }

                if (opponentNum1 > opponentNum2) {
                    opponentPoints1 += 3;
                } else if (opponentNum1 == opponentNum2) {
                    opponentPoints1 += 1;
                    opponentPoints2 += 1;

                } else {
                    opponentPoints2 += 3;
                }

                if (opponentNum2 > opponentNum3) {
                    opponentPoints2 += 3;
                } else if (opponentNum2 == opponentNum3) {
                    opponentPoints3 += 1;
                    opponentPoints2 += 1;

                } else {
                    opponentPoints3 += 3;
                }

                System.out.println(mypoints);
                System.out.println(opponentPoints1);
                System.out.println(opponentPoints2);
                System.out.println(opponentPoints3);

                //if number is 6 or greater advance to playoffs else write his placement in the group
                if (mypoints > opponentPoints1 && mypoints > opponentPoints2 && mypoints > opponentPoints3) {
                    playOffs();
                } else if (mypoints > opponentPoints1 && mypoints > opponentPoints2 && mypoints <= opponentPoints3) {
                    playOffs();
                } else if (mypoints > opponentPoints2 && mypoints > opponentPoints3 && mypoints <= opponentPoints1) {
                    playOffs();
                } else if (mypoints > opponentPoints1 && mypoints > opponentPoints3 && mypoints <= opponentPoints2) {
                    playOffs();
                } else /*if (mypoints < opponentPoints1 && mypoints < opponentPoints2 && mypoints < opponentPoints3) */ {
                    System.out.println("You didn't advance into next stage");
                }
            } else {
                System.out.println("Invalid Value");
            }
        }
        else {
            System.out.println("Invalid team name");
        }
    }

    public static void playOffs() {
        //one match the one with higher number wins the game and advances
        int max = 6;
        int min = 1;

        System.out.println("Pick a number between 1 and 6");
        Scanner myNumber = new Scanner(System.in);
        int number = myNumber.nextInt();

        if (number >= 1 && number <= 6) {

            int last16 = (int) (Math.random() * (max - min) + min);
            int quaterfinal = (int) (Math.random() * (max - min + 1) + min);
            int semifinal = (int) (Math.random() * (max - min + 1) + min);
            int finals = (int) (Math.random() * (max - min + 1) + min);
            
        /*System.out.println(last16);
        System.out.println(quaterfinal);
        System.out.println(semifinal);
        System.out.println(finals);*/

            if (number >= last16) {
                System.out.println("Congrats you advance to the quaterfinals");

                System.out.println("Pick a number between 1 and 6");
                number = myNumber.nextInt();

                if (number >= 1 && number <= 6) {
                    if (number >= quaterfinal) {
                        System.out.println("Congrats you advanced to the semifinals");

                        System.out.println("Pick a number between 1 and 6");
                        number = myNumber.nextInt();

                        if (number >= 1 && number <= 6) {
                            if (number >= semifinal) {
                                System.out.println("Congrats you advance to the finals");

                                System.out.println("Pick a number between 1 and 6");
                                number = myNumber.nextInt();

                                if (number >= 1 && number <= 6) {
                                    if (number > finals) {
                                        System.out.println("You've won the World Cup 2022");
                                    } else {
                                        System.out.println("You've finish 2nd");
                                    }
                                } else {
                                    System.out.println("Invalid number");
                                }
                            } else {
                                System.out.println("You are out of the tournament");
                            }
                        } else {
                            System.out.println("Invalid number");
                        }
                    } else {
                        System.out.println("You are out of the tournament");
                    }

                } else {
                    System.out.println("Invalid number");
                }
            } else {
                System.out.println("You are out of the tournament");
            }
            //the finale
        }
        else {
            System.out.println("Invalid number");
        }
    }
}
