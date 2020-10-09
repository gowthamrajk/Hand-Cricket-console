package handCricket;

import java.util.Scanner;
import java.util.Random;

public class HandCricket 
{
	public static int generateRandomNumber()
	{
	    Random random = new Random();
	    int num = random.nextInt(6)+1;
	    return num;
	}
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        String playerName;
        int runsToChase;
        char status = 'Y', option='\0';
        System.out.println("\n\n******** Welcome to the Java Hand Cricket ********");
        while(status == 'Y' || status == 'y') 
        {
            System.out.println("Enter  your name : ");
            playerName = sc.nextLine();
            System.out.println("Hello "+ playerName + ", Welcome to HAND-CRIC Challenge. Nice to have you on board... ARE YOU READY? (Y/N)");
            option = sc.next().charAt(0);
            if(option == 'Y' || option == 'y')
            {
                System.out.println("How many RUNS you wish to chase? : ");
                runsToChase = sc.nextInt();
                System.out.println("Good Score to Chase "+ playerName +", You have fixed a Target of "+runsToChase+" Runs. All the best !!!");
                int randomRuns = 0, wickets = 0, scoredRuns = 0 , totalRuns = 0;
                while(totalRuns < runsToChase)
                {
                    System.out.println("\n\nEnter the RUNS you need to score : ");
                    scoredRuns = sc.nextInt();
                    if (scoredRuns >= 0 && scoredRuns <= 6) 
                    {
                        randomRuns = generateRandomNumber();
                        System.out.println("Opponent enters : " + randomRuns + "\n");
                        if (scoredRuns == randomRuns)
                        {
                            System.out.println("You're OUT!");
                            wickets++;
                            if(wickets==10)
                            {
                                break;
                            }
                            System.out.println(" Your Team total SCORE is : " + totalRuns + "/" + wickets);
                        }
                        else
                        {
                            totalRuns = totalRuns + scoredRuns;
                            System.out.println(" Your Team total SCORE is : " + totalRuns + "/" + wickets);
                        }
                    }
                    else
                    {
                        System.out.println("**** Enter a Valid Input within 6 Runs! *****");
                        System.out.println();
                        continue;
                    }

                }
                if(scoredRuns!=randomRuns)
                {
                    System.out.println("********* \n\n Congrats "+ playerName +"YOU WON!! *********\n\n");
                }
                else
                {
                    System.out.println("\n\nBetter Luck Next Time! \n\n");
                }

            }
            else if(option == 'N' || option == 'n')
            {
                System.out.println("Take Your time and come back.. BYE!");
                System.exit(0);
                break;
            }
            else
            {
                System.out.println("Wrong Input!! Try Again!!!");
            }
            System.out.println("Do You Need to Play Again? (Y/N) : ");
            status = sc.next().charAt(0);
            sc.nextLine();
            }


    }
}
