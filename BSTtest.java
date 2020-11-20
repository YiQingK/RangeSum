/*
* Main testing class for BST
* @author: USFCACS 245
*/

import java.util.*;
public class BSTtest
{
    public static void main(String[] args)
    {
        BST<Integer> tree = new BST<Integer>();
        Random rand = new Random();

        //preset L and R
        int L = 5;
        int R = 18;

        //Generates 10 random numbers between 1-20 to insert into tree
        for (int i=1; i<=10; i++)
        {
            tree.insert(rand.nextInt(19)+1);
        }

        //Prints initial tree
        tree.print();
        System.out.println();

        //Deletes a random number
        int delNum = rand.nextInt(19)+1;
        System.out.println("Deleted(if it exists): " + delNum);
        tree.delete(delNum);

        //Searches to see if a random number is in the tree
        int findnum = rand.nextInt(19)+1;
        System.out.println(findnum + " is in the tree: " + tree.find(findnum));
        
        //Prints out tree again to show any changes
        System.out.println();
        tree.print();

        //Prints out the sum of numbers between preset L and R values
        System.out.println();
        System.out.println("Sum of number between 5-18: " + tree.rangeSum(L, R));
    }
}
