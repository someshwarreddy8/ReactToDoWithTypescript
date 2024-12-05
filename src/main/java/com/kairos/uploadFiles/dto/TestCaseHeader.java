package com.kairos.uploadFiles.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TestCaseHeader {
    private Integer version;
    private String name;
    private String description;
    private Integer errorThreshold;
    private String requirementReference;

    private String fullyQualifiedName; //only for agent
    private Long publishedAt; //only for agent

    private String createdBy;
    private Long createdAt;
    private String lastModifiedBy;
    private Long lastModifiedAt;
    private Boolean isDeleted = false;
    private Boolean isHead;
}
