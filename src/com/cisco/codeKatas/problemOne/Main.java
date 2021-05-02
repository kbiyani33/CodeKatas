package com.cisco.codeKatas.problemOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
// [1, 2, 3, 4, -10]
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ll2 = scan.nextLine().replaceAll("[^a-zA-Z0-9,-]", "");;
        List<String> list = Arrays.asList(ll2.split(","));
        List<Integer> newList = list.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        MaximumSubarray maxVal = new MaximumSubarray();
        System.out.println(maxVal.computeMaxSum1DSubarray(newList));
        System.out.println(maxVal.computeMax1DSubarray(newList));
    }
}
