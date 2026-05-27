//bmi = weight / (height * height);
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your weight in kilograms");
    double weight= sc.nextDouble();
    System.out.println("Enter your height in meters");
    double height= sc.nextDouble();
    double bmi=weight/(height*height);
    System.out.printf("Your BMI is: %.2f%n", bmi);
    if(bmi<18.5){
        System.out.println("Your are under weight");
    }else if(bmi<20.0){
        System.out.println("Your are normal weight");
    }else if(bmi<30.0){
        System.out.println("Your are normal weight");
        }else{
        System.out.println("category: oboes");

    }
    }
}