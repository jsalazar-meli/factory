package com.example.factory.recomenmdation.producer;

import com.example.factory.recomenmdation.domains.ParameterDto;

public class OneRecommendation implements IRecommendation {

    @Override
    public Boolean isValid(ParameterDto parameter) {
        return parameter.getOne();
    }

    @Override
    public String build() {
        return "The value is one";
    }
}
