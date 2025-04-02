package com.bridgelabz.junittesting;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ListManagerTest {
    private static ListManager listManager;
    private static List<Integer> list;

    @BeforeAll
    public static void setup(){
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    @DisplayName("List Add Element Testing")
    @Order(1)
    public void addElementTest(){
        Assertions.assertEquals(true,listManager.addElement(list,20));
        Assertions.assertEquals(true,listManager.addElement(list,10));
    }

    @Test
    @DisplayName("List Remove Element Testing")
    @Order(2)
    public void removeElementTest(){
        Assertions.assertEquals(10, listManager.removeElement(list,1));
        Assertions.assertEquals(20, listManager.removeElement(list,0));
    }

    @Test
    @DisplayName("List Size Testing")
    @Order(3)
    public void getSizeTest(){
        Assertions.assertEquals(0,listManager.getSize(list));
    }
}
