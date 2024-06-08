package com.kairos.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Setter
@Getter
@ToString
public class Category extends MetaEntity {

    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoryId", fetch = FetchType.EAGER)
    private List<Video> video;
}
