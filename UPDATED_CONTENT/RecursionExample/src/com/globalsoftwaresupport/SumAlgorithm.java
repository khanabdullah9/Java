package com.globalsoftwaresupport;

public class SumAlgorithm {

	// we sum up the first n integers
	public int iteration(int n) {
		
		int result = 0;
		
		for(int num=1;num<=n;num++)
			result += num;
		
		return result;
	}
	
	// we sum up the first n integers
	public int recursion(int n) {
		
		// we have to define the base-case
		// WHEN TO TERMINATE THE ALGORITHM (no need to call the method recursively)
		if(n == 1) return 1;
		
		return n + recursion(n-1);	
	}
 }
