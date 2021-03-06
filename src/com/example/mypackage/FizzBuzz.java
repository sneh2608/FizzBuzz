package com.example.mypackage;

public class FizzBuzz {
    public String getNumber(int number) {
        String num= Integer.toString(number);
        return num;
    }
    public String StringFor(int number)
    {
        if(checkRange(number))
            return "Out of Range";
        else if(IsDivisibleByFive(number)&&IsDivisibleByThree(number))
            return "FizzBuzz";
        else if(IsDivisibleByThree(number))
            return "Fizz";
        else if(IsDivisibleByFive(number))
            return "Buzz";
        return Integer.toString(number);
    }

    private boolean checkRange(int number) {
        if(number<1||number>100)
            return true;
        return false;
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
