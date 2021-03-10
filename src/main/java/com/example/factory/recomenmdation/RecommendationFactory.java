package com.example.factory.recomenmdation;

import com.example.factory.recomenmdation.domains.ParameterDto;
import com.example.factory.recomenmdation.producer.IRecommendation;
import org.springframework.stereotype.Component;

import static org.springframework.util.Assert.notNull;

@Component
public class RecommendationFactory implements IRecommendationFactory {

    @Override
    public boolean isValid(IRecommendation IRecommendation, ParameterDto parameterDto) {
        notNull(parameterDto, "Parameters cannot be null");
        return IRecommendation.isValid(parameterDto);
    }

    @Override
    public String builder(IRecommendation IRecommendation) {
        return IRecommendation.build();
    }

}
