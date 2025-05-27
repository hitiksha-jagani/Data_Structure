//Take n from user and print name n times.
//Time complexity : O(n)
//Space complexity : O(n)

import java.util.*;

public class Print_Name_N_Time{

    public static void func(int i, int n){
        if(i > n)   return;
        System.out.println("Hello");
        func(i + 1, n);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = input.nextInt();

        func(1, n);
        input.close();
    }
}

