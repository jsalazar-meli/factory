package com.example.factory.recomenmdation;

import com.example.factory.recomenmdation.domains.ParameterDto;
import com.example.factory.recomenmdation.producer.IRecommendation;

public interface IRecommendationFactory {

    boolean isValid(IRecommendation IRecommendation, ParameterDto parameterDto);

    String builder(IRecommendation IRecommendation);

}
