package com.store.snacks;

import com.store.snacks.entity.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SnacksApplicationTests {

    @Test
    public void contextLoads() {
        Category c = new Category();
        c.setId(1);
        c.insert();
    }


}
