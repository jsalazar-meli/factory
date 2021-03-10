package com.example.factory.recomenmdation.producer;

import com.example.factory.recomenmdation.domains.ParameterDto;

public class ThreeRecommendation implements IRecommendation {

    @Override
    public Boolean isValid(ParameterDto parameter) {
        return parameter.getThree();
    }

    @Override
    public String build() {
        return "The value is three";
    }

}
