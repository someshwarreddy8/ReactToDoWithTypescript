package com.kairos.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
@Entity
public class Video extends MetaDataEntity {
    private String title;
    private String url;
    private String description;
    private Long likes;
    private Long disLikes;
    private String categori;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "fk_video_and_category"))
    @JsonIgnore
    private Category category;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "videoId", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Comment> comment;

}
