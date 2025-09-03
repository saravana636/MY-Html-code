import java.util.Scanner;
public class cal{
    public static void main (String[]args){
        Scanner cal= new Scanner(System.in);
        System.out.println("give the number:");
        int fistcal= cal.nextInt();
        int secondcal= 24*60*60;
        int totalsecon= fistcal*secondcal;
        System.out.println("there in total of seconds" +totalsecon+ "of number of days");
        System.out.println("1 day of seconds"+secondcal);
        cal.close();


            }
}