package org.clinicMind.feed;

import org.clinicMind.factoryInterface.ImplementMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TargetSum implements ImplementMethods {

    @Override
    public Integer[] makeDistinct(Integer[] ar) {
        Stream<Integer> sm = Stream.of(ar);
        ar= sm.distinct().toArray(Integer[]::new);
        return ar;
    }

    @Override
    public List<Integer> integerThatAddUpToTargetSum(Integer in, Integer[] arry) {
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<arry.length;i++){
            for(int j=i;j<arry.length;j++){
                if(in-(arry[i] + arry[j])==0){
                    list.add(arry[i]);
                    list.add(arry[j]);
                }
            }
        }
        return list;
    }

}
