
import java.util.Scanner;
public class another {
public void c2f(){
    Scanner keyboard=new Scanner(System.in);
    int cm;
    System.out.println("enter your height in cm");
    cm=keyboard.nextInt();
    double feet=cm/30.48;
    double inches= ((cm/2.54)-((int)feet)*12);
    System.out.println("there are"+(int)feet+"feet and " +inches+"inches in"+cm+"cm");

}
}

