public class Fizzbuzz {

    public static void main (String[] args){
        int n;
        for (n=0;n<=100;n++){

            if(n%3==0 && n%5==0){
                System.out.println("Fizzbuzz");
            } else if (n%3==0) {
                System.out.println("Fizz");
            } else if (n%5==0) {
                System.out.println("Buzz");
            }
            else
            System.out.println(n);
        }

    }
}
