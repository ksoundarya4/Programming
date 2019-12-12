package com.bridgelabs.AlgorithmPrograms;

public class StringPermutation {
	  
	    public static void main(String[] args) 
	    { 
	    	System.out.println("Enter String");
	        String str = "ABC"; 
	        int n = str.length(); 
	        StringPermutation permutation = new StringPermutation(); 
	        permutation.permute(str, 0, n-1); 
	    } 
	  
	    /** 
	     * permutation function 
	     * @param str string to calculate permutation for 
	     * @param l starting index 
	     * @param r end index 
	     */
	    private void permute(String str, int l, int r) 
	    { 
	    	
	        if (l == r) 
	            System.out.println("\n"+str); 
	        else
	        { 
	            for (int i = l; i <= r; i++) 
	            { 
	                str= swap(str,l,i); 
	                String s1 = str;
	                System.out.println("After first swap "+s1);	                permute(str, l+1, r); 
	                str= swap(str,l,i); 
	                String s2 = str;
	                System.out.println("After second swap "+s2);
	                if(s1.equals(s2))
	                	System.out.println("String "+s1+" is equal to String "+s2);
	            } 
	        } 
	    }

	    /** 
	     * Swap Characters at position 
	     * @param a string value 
	     * @param i position 1 
	     * @param j position 2 
	     * @return swapped string 
	     */
	    public String swap(String a, int i, int j) 
	    { 
	        char temp; 
	        char[] charArray = a.toCharArray(); 
	        temp = charArray[i] ; 
	        charArray[i] = charArray[j]; 
	        charArray[j] = temp; 
	        return String.valueOf(charArray); 
	    } 
	  
	}

