package com.example.factory.recomenmdation.domains;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RecommendationDto {

    private final String id;
    private final String label;
    private final String description;
    private final String actionUrl;
    private final String actionLabel;
    private final String eventId;
    private final int order;
    private final String NOT_SPECIFIED = "not_specified";

}
