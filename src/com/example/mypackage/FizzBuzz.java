package com.example.mypackage;

public class FizzBuzz {
    public String getNumber(int number) {
        String num= Integer.toString(number);
        return num;
    }
    public String StringFor(int number)
    {
        if(number==15)
            return "fizzbuzz";

        return "fizz";
    }

    private boolean IsDivisibleByThree(int number) {
        if(number%3==0)
            return true;
        return false;
    }

    private boolean IsDivisibleByFive(int number) {
        if(number%5==0)
            return true;
        return false;
    }


}
