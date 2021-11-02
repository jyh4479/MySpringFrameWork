package com.hello.controller;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ControllerTest {

    @Test
    public void helloTest() {
        HomeControllerTest homeControllerTest = new HomeControllerTest();
        String hello = homeControllerTest.getHello();

        assertThat(hello, is("Hello"));
    }
}
