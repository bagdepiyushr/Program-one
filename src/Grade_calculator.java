import java.util.Scanner;

public class Grade_calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained");
        int m = sc.nextInt();
       // char grade = ' ';

        if (m>=90 && m<=100){
            System.out.println("Grade is :"+ 'A');
        } else if (m >=80 && m<90) {
            System.out.println("Grade is :"+'B');
        } else if (m>=70 && m<80) {
            System.out.println("Grade is :"+'C');
        } else if (m>=60 && m<70) {
            System.out.println("Grade is :" +'D');
        }
        else if (m<60) {
            System.out.println("Grade is :"+'E');
        }
       else {
            System.out.println("Please enter Valid Marks");
       }
    }
}
