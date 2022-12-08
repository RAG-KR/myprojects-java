import java.util.Scanner;
public class Game{
    public static void main(String [] args){
        int myNum = (int)((Math.random())*100);
        Scanner sc = new Scanner(System.in);
        int userNum = 0;
        int counter = 1;
        do {
            System.out.println("enter your guess : ");
            userNum = sc.nextInt();
            if(userNum<myNum){
                System.out.println("try a higher guess!");
                counter++;
            }
            else if(userNum>myNum){
                System.out.println("try a lower guess");
                counter++;
            }
            else if(userNum==myNum){
                System.out.println("right answer congrats!!");
                counter++;
                break;
            }
        }while(userNum >= 0);
        System.out.println("my number was  :  " + myNum);
        System.out.println("your score : " );
        System.out.print(counter-1);
    }
}
