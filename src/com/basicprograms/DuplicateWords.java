package com.basicprograms;

public class DuplicateWords
{
    public static void main(String[] args)
    {
        String str = "My name is robin robin robin robin Smith Smith";
        str = str.toLowerCase();
        System.out.println("Sentence: "+str);
        String[] words = str.split(" ");
        int wordCount = words.length;
        int count  =1;
        System.out.println("Total words in sentences are "+wordCount);
        for(int i = 0; i<wordCount;i++)
        {
             //count = 1;
            for (int j = i+1; j<wordCount;j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++;
                    words[j]="0";
                }
            }
            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);

        }
        System.out.println("Total occurrences are "+ count);



    }
}
