public class Main {

    public static void main(String[] args) {
        isOdd(1);
        sumOdd(100,1000);

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0,3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0,4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0,5.0));

        for (int i  = 2; i < 9 ;i++){
            System.out.println("10,000 at " + i + " Interest = " + calculateInterest(10000.0, i));
        }

        System.out.println("===============================================================");

        for (int i  = 8; i > 1 ;i--){
            System.out.println("10,000 at " + i + " Interest = " + calculateInterest(10000.0, i));
        }

         /*
     Create a for statement using any range of number
     Determine if the number is a prime number using the isPrime method
     If it is a prime number, print it out and increment a count of the
     number of prime numbers found
     if that count is 3 exit the for loop
     hint: Use The break; statement to exit
     */
        int count = 0;
        for (int i = 10; i < 50; i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number" );
                if (count == 3){
                    System.out.println("Exiting for loop ");
                    break;
                }
            }
        }


        /*
        Create a for statement using a range of numbers from 1 to 1000 inclusive
        Sum all the numbers that can be divided with both 3 and also with 5
        For those numbers that met the above conditions, print out the number
        break; out the loop once you find 5 numbers that met the above conditions
        after breakin out the loop print the sum of the numbers that met the above conditions
        Note: Type all code in Main Method

         */
        int divisibleBy3and5 = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("This number is divisible by 3 and 5 = " + i);
                divisibleBy3and5++;
                sum+=i;
                }
            if (divisibleBy3and5 == 5){
                break;
            }
        }
        System.out.println("The total sum of all numbers divisible by 3 and 5 " + sum);


    }






    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        for (int i = 2;i <= (long) Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;


    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount * (interestRate/100));
    }

    /*
    Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
Check that number is > 0, if it is not return false.
If number is odd return true, otherwise  return false.
Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.
It should call the method isOdd to check if each number is odd.
The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
If those conditions are not satisfied return -1 from the method to indicate invalid input.

Example input/output:
* sumOdd(1, 100); → should return 2500
* sumOdd(-1, 100); →  should return -1
* sumOdd(100, 100); → should return 0
* sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
* sumOdd(100, -100); → should return -1
* sumOdd(100, 1000); → should return 24750
TIP: use the remainder operator to check if the number is odd

NOTE: Both methods  needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
     */

    public static boolean isOdd(int n){
        if (n < 0){
            return false;
        }
        if (n % 2 != 0){
           return true;
        }
        return false;


    }

    public static int sumOdd(int start, int end) {

        int allOdd = 0;

        for (int i = start; i < end + 1; i++) {
            if (isOdd(i) == true) {
                //The parameter end needs to be greater than or equal to start and
                // both start and end parameters have to be greater than 0.
                if (end >= start && start > 0 && end > 0) {
                    allOdd += i;
                } else

                    return -1;

            }

        }
        //The parameter end needs to be greater than or equal to start and
        // both start and end parameters have to be greater than 0.
        if (end >= start && start > 0 && end > 0) {

            return allOdd;
        }

        else {
            return -1;
        }

    }

}

