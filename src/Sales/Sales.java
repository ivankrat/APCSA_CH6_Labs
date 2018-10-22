package Sales;
/**
 * Name: ivan krat
 * Date: 10/18/18
 * Period: 1st
 *
 * Sales.Sales.java
 *
 * Reads in and stores sales for each of 5 salespeople.  Displays
 * sales entered by salesperson id and total sales for all salespeople.
 */
//import sun.jvm.hotspot.oops.Array;

import com.sun.org.apache.xalan.internal.res.XSLTErrorResources_pt_BR;

import java.util.Arrays;
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        //Prompt the user for the number of sales people that they need to enter
        System.out.println("Input how many people are int the sale: ");
        //and modify the program to create an appropriately sized array.
        int salesPeople = scan.nextInt();

        int[] sales = new int[salesPeople];
        int sum;

        for (int i=0; i < sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }
        //print the array for verification
        System.out.println(Arrays.toString(sales));

        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i < sales.length; i++)
        {
            System.out.println("\t " + i + "\t\t\t" + sales[i]);
            sum += sales[i];
        }

        System.out.println("\nTotal sales: " + sum);


        //) Use your average method to print the average sales
        System.out.println(average(sales));


        //Use your indexOfMax method to print the index of the best sales person
        System.out.println(indexOfMax(sales));
        //and the sales amount for that sales person.
        System.out.println(sales[indexOfMax(sales)]);


        //Do the same for the worst sales person
        System.out.println(indexOfMin(sales));
        System.out.println(sales[indexOfMin(sales)]);



    }

    public static double average(int[] arr) throws IllegalStateException
    {
        //compute and return the average of arr
        int x = 0;
        if (arr.length == 0) {
            throw new IllegalStateException("Array arr must have at least one element.");
        }
        for(int i = 0; i < arr.length; i++) {
            x += arr[i];
        }
        x /= arr.length;
        return x;
    }

    public static int indexOfMax(int[] arr)
    {
        //find and return the index of the max value in arr
        int x = 0;
        int y = -1;
        for(int i = 0; i < arr.length; i++) {
            if(x < arr[i]) {
                x = arr[i];
                y = i;
            }
        }
        return y;
    }

    //Do the same for an indexOfMin method
    public static int indexOfMin(int[] arr)
    {
        //find and return the index of the max value in arr
        int x = 0;
        int y = -1;
        for(int i = 0; i < arr.length; i++) {
            if(x > arr[i]) {
                x = arr[i];
                y = i;
            }
        }
        return y;
    }


}
