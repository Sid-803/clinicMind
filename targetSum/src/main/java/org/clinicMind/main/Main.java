package org.clinicMind.main;

import org.clinicMind.factoryClass.TargetSumFactory;
import org.clinicMind.feed.TargetSum;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] in = {15,10,13,12,13,1,5,15,3,12};
        Integer targetSum = 25;

        TargetSumFactory factory = new TargetSumFactory();
        
        TargetSum sm = (TargetSum) factory.createTargetSum();
        in = sm.makeDistinct(in);

        List<Integer> addup = sm.integerThatAddUpToTargetSum(targetSum, in);
        System.out.println(addup);

    }
}