package com.example.factory.recomenmdation.producer;

import com.example.factory.recomenmdation.domains.ParameterDto;

public class TwoRecommendation implements IRecommendation {

    @Override
    public Boolean isValid(ParameterDto parameter) {
        return parameter.getTwo();
    }

    @Override
    public String build() {
        return "The value is two";
    }

}
