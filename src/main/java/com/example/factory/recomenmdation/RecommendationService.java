package com.example.factory.recomenmdation;

import com.example.factory.recomenmdation.domains.ParameterDto;
import com.example.factory.recomenmdation.producer.IRecommendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecommendationService {

    private final List<IRecommendation> IRecommendations;

    private final IRecommendationFactory factory;

    @Autowired
    public RecommendationService(List<IRecommendation> IRecommendations,
                                 RecommendationFactory factory) {
        this.IRecommendations = IRecommendations;
        this.factory = factory;
    }

    public List<String> getRecommendations(ParameterDto parameterDto) {
        return IRecommendations.stream()
                .filter(recommendation -> factory.isValid(recommendation, parameterDto))
                .map(factory::builder)
                .collect(Collectors.toList());
    }

}
