package com.spring;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
class SpringbootApplicationTests {

    @Autowired
    private springController sc;

    @Test
    public void whengetReq_thenRetrievedMsgIsCorrect() {
        Mockito.when(sc.displayMessage()).thenReturn("Hello from Mano, This is a My Spring boot application.....");
        String testName =sc.displayMessage();
        Assert.assertEquals("Hello from Mano, This is a My Spring boot application.....", testName);
    }

    @Test
    public void whengetReq_thenRetrievedMsgIsnotCorrect() {
        Mockito.when(sc.displayMessage()).thenReturn("Hello from Mano, This is a My Spring boot application.....");
        String testName =sc.displayMessage();
        Assert.assertNotEquals("Hello from Mahi, This is a My Spring boot application....", testName);
    }
}
