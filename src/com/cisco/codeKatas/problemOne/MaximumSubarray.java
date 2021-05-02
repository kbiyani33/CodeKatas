package com.cisco.codeKatas.problemOne;

import java.util.ArrayList;
import java.util.List;
// [-2, 1, -3, 4, -1, 2, 1, -5, 4]
public class MaximumSubarray {
    public int computeMaxSum1DSubarray(List<Integer> oneDArray)
    {
        // return the maximum sum possible
        int currentMaxSum=oneDArray.get(0), maxSumOfArraySoFar = oneDArray.get(0);

        for (int i=1; i<oneDArray.size(); i++) {
            int integer = oneDArray.get(i);
            currentMaxSum = Math.max(integer, currentMaxSum+integer);
            maxSumOfArraySoFar = Math.max(maxSumOfArraySoFar, currentMaxSum);
        }

        return maxSumOfArraySoFar;
    }

    public static int computeMaxSum2DSubarray(List<List<Integer>> twoDArray)
    {
        // return the maximum sum possible
        return 0 ;

    }

    // If there are multiple subarrays possible, return the first one.
    public List<Integer> computeMax1DSubarray(List<Integer> oneDArray)
    {
        List<Integer> output = new ArrayList<>();
        int maximumSumEndingHere=0, maximumSumSoFar=0, start=0, end=0, beginning=0;
        for(int i=0; i<oneDArray.size(); i++){
            maximumSumEndingHere += oneDArray.get(i);

            if(maximumSumEndingHere < 0){
                maximumSumEndingHere = 0;
                beginning = i+1;
            }

            if(maximumSumEndingHere>maximumSumSoFar){
                maximumSumSoFar = maximumSumEndingHere;
                start = beginning;
                end = i;
            }
        }

        for(int i=start; i<=end; i++){
            output.add(oneDArray.get(i));
        }
        return output;
    }
//
//    // If there are multiple 2D subarrays possible, return the first one.
//    public static List<List<Integer>> computeMax2DSubarray(List<List<Integer>> twoDArray)
//    {
//
//    }
}

