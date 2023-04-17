package org.clinicMind.factoryClass;

import org.clinicMind.factoryInterface.ImplementMethods;
import org.clinicMind.feed.TargetSum;

public class TargetSumFactory {

    public TargetSumFactory() {
    }

    public ImplementMethods createTargetSum(){
        ImplementMethods im = null;
        im = new TargetSum();
        return im;
    }
}
