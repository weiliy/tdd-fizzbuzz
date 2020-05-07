package cn.xpbootcamp.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests {

    // 不是3，5，7的倍数，要说该数字
    @Test
    public void notMultiplicationOfThreeFiveSevenShouldReturnNumber() {
        FizzBuzz tester = new FizzBuzz();
        int[] testInputs = {1, 4, 22};

        for (int n : testInputs) {
            assertEquals(String.valueOf(n), tester.report(n));
        }
    }

    // 仅3的倍数，要说Fizz
    @Test
    public void onlyMultiplicationOfThreeShouldReturnFizz() {
        FizzBuzz tester = new FizzBuzz();
        String shouldReturn = "Fizz";
        int[] testInputs = {3, 6, 33};

        for (int n : testInputs) {
            assertEquals(shouldReturn, tester.report(n));
        }
    }

    // 仅5的倍数，要说Buzz
    @Test
    public void onlyMultiplicationOfFiveShouldReturnBuzz() {
        FizzBuzz tester = new FizzBuzz();
        String shouldReturn = "Buzz";
        int[] testInputs = {5, 10, 50};

        for (int n : testInputs) {
            assertEquals(shouldReturn, tester.report(n));
        }
    }

    // 仅7的倍数，要说Whizz
    @Test
    public void onlyMultiplicationOfSevenShouldReturnWhizz() {
        FizzBuzz tester = new FizzBuzz();
        String shouldReturn = "Whizz";
        int[] testInputs = {7, 14, 28};

        for (int n : testInputs) {
            assertEquals(shouldReturn, tester.report(n));
        }
    }

    // 仅3和5的倍数，要说FizzBuzz
    @Test
    public void onlyMultiplicationOfThreeFiveShouldReturnFizzBuzz() {
        FizzBuzz tester = new FizzBuzz();
        String shouldReturn = "FizzBuzz";
        int[] testInputs = {15, 45, 75};

        for (int n : testInputs) {
            assertEquals(shouldReturn, tester.report(n));
        }
    }

    // 仅3和7的倍数，要说FizzWhizz
    @Test
    public void onlyMultiplicationOfThreeSevenShouldReturnFizzWhizz() {
        FizzBuzz tester = new FizzBuzz();
        String shouldReturn = "FizzWhizz";
        int[] testInputs = {21, 63, 147};

        for (int n : testInputs) {
            assertEquals(shouldReturn, tester.report(n));
        }
    }

    // 仅5和7的倍数，要说BuzzWhizz
    @Test
    public void onlyMultiplicationOfFiveSevenShouldReturnBuzzWhizz() {
        FizzBuzz tester = new FizzBuzz();
        String shouldReturn = "BuzzWhizz";
        int[] testInputs = {35, 245, 175};

        for (int n : testInputs) {
            assertEquals(shouldReturn, tester.report(n));
        }
    }

    // 3，5，7的倍数，要说FizzBuzzWhizz
    @Test
    public void onlyMultiplicationOfThreeFiveSevenShouldReturnFizzBuzzWhizz() {
        FizzBuzz tester = new FizzBuzz();
        String shouldReturn = "FizzBuzzWhizz";
        int[] testInputs = {105, 525, 3675};

        for (int n : testInputs) {
            assertEquals(shouldReturn, tester.report(n));
        }
    }
}