package com.giant.cloud.service;


import com.giant.cloud.service.service.UnitTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={TestsApplication.class, UnitTestService.class})
public class UnitTest {

    @Autowired
    UnitTestService unitTestService;

    @Test
    public void testAdd() {
        int result = unitTestService.add(4, 5);
        assert result == 9;
    }
}