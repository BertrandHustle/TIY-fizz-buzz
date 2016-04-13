public class Main {

    public static void main(String[] args) {

        for (int x = 1; x <= 100; x++) {

            //fix so 3s and 5s DON'T print

            if (x % 3 != 0 && x % 5 != 0) {

                System.out.println(x);

            //need to put Fizzbuzz conditional first

            } else if (x % 3 == 0 && x % 5 == 0) {

                System.out.println("FizzBuzz!");

            } else if (x % 3 == 0) {

                System.out.println("Fizz!");

            } else if (x % 5 == 0) {

                System.out.println("Buzz!");


            }

        }
    }
}


















