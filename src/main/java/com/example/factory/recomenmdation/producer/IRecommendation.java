package com.example.factory.recomenmdation.producer;

import com.example.factory.recomenmdation.domains.ParameterDto;

public interface IRecommendation {

    Boolean isValid(ParameterDto parameter);

    String build();

}
