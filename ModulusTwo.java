import java.util.*;
import java.lang.*;
import java.io.*;

public class ModulusTwo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int in_n = in.nextInt();
        int in_z = in.nextInt();
        int count = 0;
        int n_sub = in_n;
        System.out.println(operation(in_n, n_sub,in_z,count));
    }

    public static int operation(int n, int n_sub, int z, int count)
    {
        if(n_sub==-1)
        {
            return count;
        }
        else
        {
            for(int i = 0; i<n+1; i++)
            {
                if(((n_sub*i)%n)==z)
                {
                    count++;
                }
            }
            n_sub--;
            return operation(n, n_sub, z, count);
        }
    }
    
}

