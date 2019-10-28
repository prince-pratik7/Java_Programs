import java.io.*;
import java.util.*;

/* PROBLEM LINK: https://www.hackerrank.com/challenges/sherlock-and-moving-tiles */

public class Sherlock-and-Moving-Tiles
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long l,s1,s2,q,n;
        double a,b,c,d;
        l=sc.nextLong();
        s1=sc.nextLong();
        s2=sc.nextLong();
        n=sc.nextLong();
        for(int i=0;i<n;i++)
        {
            q=sc.nextLong();
            d=(((double)l-Math.sqrt(q))*Math.sqrt(2))/(double)Math.abs(s1-s2);
            System.out.println(d);
        }
    }
}
