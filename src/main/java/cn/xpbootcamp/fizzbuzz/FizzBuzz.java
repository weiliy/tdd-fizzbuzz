package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public String report(int n) {
        if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0) {
            return "FizzBuzzWhizz";
        }

        if (n % 5 == 0 && n % 7 == 0) {
            return "BuzzWhizz";
        }

        if (n % 3 == 0 && n % 7 == 0) {
            return "FizzWhizz";
        }

        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }

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
