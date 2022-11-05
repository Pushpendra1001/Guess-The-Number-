import java.net.SocketTimeoutException;
// import Math;
import java.util.*;
class guess{


    public static int guessing()
    {
        Scanner ob = new Scanner(System.in);
        int secret = (int)(Math.random()*100);
        System.out.println("Prss 1 For Play  ");
        System.out.print("Prss -1 For Stop : ");
       int input = ob.nextInt();
       

        int count = 0;
       if(input == 1)
       {

           for(int i=0; i<=100; i++)
           {
               count++;
               System.out.print("Guess the Number Buddy :) : ");
            int n = ob.nextInt();

            if(n==-1)
            {

                return -1;
            }
            else if(n==secret)
            {
                System.out.println("Yehh You WON");
                if(count < 3)
                {
                    System.out.println("Yo YO You are God of this Game :) ");
                }
                else if(count <= 5)
                {
                    System.out.println("Yo YO Champion" );
                }
                else
                {
                    System.out.println(" : ) Bravo ");
                }
                System.out.println("You Take "+ count + " chance to win");
                break;


            }
            else if(n<secret){
                {
                    System.out.println("Think More");
                } 
            }
            else if(n>secret)
            {
                System.out.println("Think less");
            }
            
        }
    } 
        
        return -1;

    }
    public static void main(String[] args) {
        guessing();
        
    }
}