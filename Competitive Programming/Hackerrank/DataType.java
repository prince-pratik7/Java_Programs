import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* PROBLEM LINK: https://www.hackerrank.com/challenges/30-data-types */

public class DataType {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int a;
        double b;
        String c;
        a=Integer.parseInt(scan.nextLine());
        b=Double.parseDouble(scan.nextLine());
        c=scan.nextLine();
        System.out.println((i+a)+"\n"+(d+b)+"\n"+(s+c));
        scan.close();
    }
}
