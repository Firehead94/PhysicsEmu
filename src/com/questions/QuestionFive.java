package com.questions;

import com.units.BaseUnit;
import com.units.Constants;

public class QuestionFive {

    public QuestionFive() {

        BaseUnit sigma = new BaseUnit(8.9,-6,"C/m^2");

        System.out.println("Question #5 --------------------------------------");
        System.out.println("a) " + sigma.trueValue()/(2* Constants.Permittivity.trueValue()));
        System.out.println("--------------------------------------------------");
    }
}
