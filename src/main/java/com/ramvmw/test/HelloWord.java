package com.ramvmw.test;

import java.time.LocalDateTime;

public class HelloWord
{
    public static void main(String args [])
    {
        HelloWord helloWord;

        helloWord = new HelloWord();

        System.out.println("Hello word!");

        helloWord.Greeting();
    }

    private void Greeting()
    {
        LocalDateTime time;
        int hour;

        time = LocalDateTime.now();
        hour = time.getHour();

        if(hour >= 0 && hour <= 11)
        {
            System.out.println("Good afternoon");
        }
        else if(hour >= 12 && hour <= 17)
        {
            System.out.println("Good afternoon");
        }
        else if(hour >= 18 && hour <= 23)
        {
            System.out.println("Good evening");
        }
    }
}