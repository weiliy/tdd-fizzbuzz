package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public String report(int n) {
        if (n % 3 == 0) {
            return "Fizz";
        }

        if(n % 5 == 0) {
            return "Buzz";
        }

        if(n % 7 == 0) {
            return "Whizz";
        }
        return String.valueOf(n);
    }
}
