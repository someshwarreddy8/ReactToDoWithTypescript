package com.kairos.Entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.kairos.util.ZonedDateTimeSerializer;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class MetaDataEntity extends BaseEntity {
    private String createdBy;
    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    private ZonedDateTime createdAt = ZonedDateTime.now();
    private String lastModifiedBy;
    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private ZonedDateTime lastModifiedAt = ZonedDateTime.now();
}
