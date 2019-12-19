package com.bridgelabs.AlgorithmPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{
   public static String[] ReadFile(String path)
   {
	   //To read list of word seperated by comma from a file
	   BufferedReader br = null;
	  
	   
	   //To store the words
	   String[] value = null;
	   
	 try
	 {
		   br = new BufferedReader( new FileReader(path));
		   String line;
		   while((line = br.readLine())!=null)
			   value = line.split(",");
	    }
   
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
   finally
   {
	   try
	   {
		   if(br!=null)
			   br.close();
	   }
	   catch(Exception e)
	   {
	   e.printStackTrace();
	   }
	  
   }
	 return value;
 }
   
   public static boolean isWordPresent(String[] value, String word)
   {
	   Arrays.sort(value);
	   
	    for(String s : value)
	    {
	    	if(s.equals(word))
	    		return true;
	    }
	    return false;
	    
   }
   
   public static void main(String[] args)
   {
	   
	   Scanner sc1 = new Scanner(System.in);
	   System.out.println("Enter the file path");
	   String path = sc1.nextLine();
	   
	   //To read lis of words present in file
	   String[] listOfWords = ReadFile(path);
	   
	   //to check whether a word is present in file or not
	   System.out.println("Enter the word to be searched");
	   String word = sc1.next();
	   if(isWordPresent(listOfWords,word))
		   System.out.println("Word is present in a file");
	   else
		   System.out.println("Word is not present in a file");
	   sc1.close();
   }
}
