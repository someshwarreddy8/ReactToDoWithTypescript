package com.kairos.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Comment extends MetaEntity {

    private String description;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "video_id", foreignKey = @ForeignKey(name="fk_comment_and_video"))
    private Video videoId;
}
