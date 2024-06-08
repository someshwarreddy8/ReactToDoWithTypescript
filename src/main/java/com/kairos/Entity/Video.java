package com.kairos.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Setter
@Getter
@ToString
public class Video extends MetaEntity {
    private String title;
    private String url;
    private String description;
    private Long likes;
    private Long disLikes;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "fk_video_and_category"))
    private Category categoryId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "videoId", fetch = FetchType.EAGER)
    private List<Comment> comment;

}
