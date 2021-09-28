package ex28;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 28 Solution
 *  Copyright 2021 Jose Malave
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for( int i = 0; i < 5; i++)
        {
            System.out.println( "Enter a number:" );
            int input = sc.nextInt();
            total = total + input;
        }
        System.out.println( "The total is "+ total );
    }
}
