package com.kairos.Doubts.Lombok;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public class BuilderAnnotation {
    private int id;
    private String name;
    private int rollNo;
    @NotNull
    private final String area;
}
