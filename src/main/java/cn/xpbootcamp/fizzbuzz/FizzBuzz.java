package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public String report(int n) {
        if (n % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(n);
    }
}
