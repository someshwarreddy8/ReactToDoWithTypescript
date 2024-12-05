package com.kairos.applicationrunner;

import com.kairos.Entity.Category;
import com.kairos.Entity.Video;
import com.kairos.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class OneToManyTest implements ApplicationRunner {
    @Autowired
    private CategoryRepo repo;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Video v = new Video();
        v.setCategori("Test");
        v.setUrl("Test");
        v.setLikes(3L);
        v.setDisLikes(4L);
        v.setDescription("Test desc");

        Video v1 = new Video();
        v1.setCategori("Test");
        v1.setUrl("Test");
        v1.setLikes(3L);
        v1.setDisLikes(4L);
        v1.setDescription("Test desc");

        Category c = new Category();
        c.setCategoryName("Test cat");
        c.getVideo().add(v);
        c.getVideo().add(v1);

        repo.save(c);


    }
}
