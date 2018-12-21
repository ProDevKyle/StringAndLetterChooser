package com.company;

public class Runner
{
    public static void main(String[] args)
    {
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        System.out.println("Result of part a");
        for(int i = 0; i < 6; i++)
        {
            System.out.println(sChooser.getNext() + "");
        }
        System.out.println("\nResult of part b");
        RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
        System.out.println("Result of part a");
        for(int j = 0; j < 4; j++)
        {
            System.out.println(letterChooser.getNext());
        }
    }
}
