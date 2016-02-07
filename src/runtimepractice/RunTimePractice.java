package runtimepractice;

import java.util.HashMap;

/**
 * Created by maheshkumar on 25 January 2016.
 */
public class RunTimePractice
{

    public static int findNumsOfRepetitions(String s, char c)
    {
        //Linear Time; O(n) time
        int sum=0; // 1
        for ( int i = 0 ; i < s.length() ; i++) // 1, n+1 , n
        {
            if(s.charAt(i) == c) //n
            {
                sum++;//n
            }
        }
        return sum;

    }

    public static int[] findNumsOfRepetitionsv1(String s, char[] c)
    {
        //Quadratic; O(n*m) time
        int[] sums = new int[c.length]; // 1
        for ( int i=0 ; i < s.length(); i++) // 1 , n+1 , n
        {
            for ( int j= 0 ; j < c.length ; j++) // n*m
            {
                if(s.charAt(i) == c[j]) //n*m
                {
                    sums[j] = sums[j] + 1; //n*m
                }
            }
        }
        return sums;
    }

    public static int[] findNumsOfRepetitionsv2(String s, char[] c)
    {
        //Optimal time: O(n)
        int[] sums = new int[c.length]; // 1
        HashMap<java.lang.Character, Integer> map = new HashMap<>();
        for ( int i=0 ; i<s.length(); i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),1);
            }
            else
            {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i),sum+1);
            }
        }

        for (int j=0; j<c.length; j++)
        {
            int sum;
            if (map.containsKey(c[j]))
            {
                sums[j] = 0;
            }
            else
            {
                sums[j] = map.get(c[j]);
            }
        }

        return sums;

    }
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        findNumsOfRepetitions("abcagkfskhjkdjhkhlkdfhlkjnflkadngklanglkadnglfanglfkankldsasl",'a');
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");

        char[] a = {'a', 'b'};
        startTime = System.currentTimeMillis();
        findNumsOfRepetitionsv1("abcagkfskhjkdjhkhlkdfhlkjnflkadngklanglkadnglfanglfkankldsasldasjndjlasnflkasnlngdanglnglfnaljnbfajgbdjgbnjznbnfbklfzmlbmzlffmhzfmb,mfb;,zfb;mzf;,bmlfznlhkgbnjkDNGkdMklbnlfzkgnlknblknflkzblg",a);
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");

        startTime = System.currentTimeMillis();
        //System.out.println(startTime);
        findNumsOfRepetitionsv2("abcagkfskhjkdjhkhlkdfhlkjnflkadngklanglkadngghsfdjngjNJhejngkmzgrnotgeokNeuNGnesgkjkgnjrnhjonkkcmkeToKGMvsbizdnhkmbkfmpozmnpzmpkm bPROIKMSDKmvknbjnzio˜krmzbzmklgmkdmkbnjnhfNhjrnhmlvnklndklgnkldsbnklNBlfanglfkankldsaslfads;kfmda;kfmkdamkjdfjdasnfljnl",a);
        endTime = System.currentTimeMillis();
        //System.out.println(endTime);
        duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");
    }
}
