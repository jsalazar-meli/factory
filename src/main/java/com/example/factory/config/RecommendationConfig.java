package com.example.factory.config;

import com.example.factory.recomenmdation.producer.OneRecommendation;
import com.example.factory.recomenmdation.producer.IRecommendation;
import com.example.factory.recomenmdation.producer.ThreeRecommendation;
import com.example.factory.recomenmdation.producer.TwoRecommendation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RecommendationConfig {

    @Bean
    public List<IRecommendation> getRecommendation() {
        List<IRecommendation> beans = new ArrayList<>();
        beans.add(new OneRecommendation());
        beans.add(new TwoRecommendation());
        beans.add(new ThreeRecommendation());
        return beans;
    }

}
