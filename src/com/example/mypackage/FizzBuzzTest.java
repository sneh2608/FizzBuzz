package com.example.mypackage;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        fizzBuzz=new FizzBuzz();
    }

    @org.junit.jupiter.api.Test
    void getNumber() {
        int number=1;
        String num=fizzBuzz.getNumber(number);
        Assert.assertEquals("1",num);
    }
    @org.junit.jupiter.api.Test
    public void outOfRange()
    {
//        Assert.assertEquals("Out of Range",101);
        Assert.assertEquals("Out of Range",142);
    }
    @org.junit.jupiter.api.Test
    public void fizzbuzz_for_multiples_of_3_and_5()
    {
        Assert.assertEquals("FizzBuzz", fizzBuzz.StringFor(15));
        Assert.assertEquals("FizzBuzz",fizzBuzz.StringFor(60));
    }
    @org.junit.jupiter.api.Test
    public void fizz_for_multiples_of_3()
    {
        Assert.assertEquals("Fizz",fizzBuzz.StringFor(3));
        Assert.assertEquals("Fizz",fizzBuzz.StringFor(6));
    }
    @org.junit.jupiter.api.Test
    public void fizz_for_multiples_of_5()
    {
        Assert.assertEquals("Buzz",fizzBuzz.StringFor(5));
        Assert.assertEquals("FizzBuzz",fizzBuzz.StringFor(30));
        Assert.assertEquals("Buzz",fizzBuzz.StringFor(70));
    }
    @org.junit.jupiter.api.Test
    public void Number_is_returned_if_not_multiple_of_3_or_5()
    {
        Assert.assertEquals("11",fizzBuzz.StringFor(11));
        Assert.assertEquals("16",fizzBuzz.StringFor(16));
    }
}