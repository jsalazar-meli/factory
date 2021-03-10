package com.example.factory.restController;

import com.example.factory.recomenmdation.RecommendationService;
import com.example.factory.recomenmdation.domains.ParameterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class test {

    private final RecommendationService service;

    @Autowired
    public test(RecommendationService service) {
        this.service = service;
    }

    @GetMapping("/app")
    public List<String> request() {
        ParameterDto parameterDto = ParameterDto
                .builder()
                .one(Boolean.FALSE)
                .two(Boolean.TRUE)
                .three(Boolean.TRUE)
                .build();
        return service.getRecommendations(parameterDto);
    }

}
