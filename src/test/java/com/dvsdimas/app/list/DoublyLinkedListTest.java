package com.dvsdimas.app.list;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dmylnev on 08.04.18.
 */

public class DoublyLinkedListTest {

    @Test
    public void testHead() {

        final DoublyLinkedList<String> list = new DoublyLinkedList<>();

        Assert.assertNotNull(list);

        Assert.assertEquals(0, list.getSize());
        Assert.assertTrue(list.isEmpty());


        final String element1 = "asdasd";

        list.addHead(element1);

        Assert.assertEquals(1, list.getSize());
        Assert.assertTrue(!list.isEmpty());


        final String element2 = "asdasdsdasd";

        list.addHead(element2);

        Assert.assertEquals(2, list.getSize());
        Assert.assertTrue(!list.isEmpty());


        final String ret2 = list.removeHead();

        Assert.assertNotNull(ret2);
        Assert.assertEquals(1, list.getSize());
        Assert.assertTrue(!list.isEmpty());
        Assert.assertEquals(element2, ret2);


        final String ret1 = list.removeHead();

        Assert.assertNotNull(ret1);
        Assert.assertEquals(0, list.getSize());
        Assert.assertTrue(list.isEmpty());
        Assert.assertEquals(element1, ret1);
    }

    @Test
    public void testTail() {

        final DoublyLinkedList<String> list = new DoublyLinkedList<>();

        Assert.assertNotNull(list);

        Assert.assertEquals(0, list.getSize());
        Assert.assertTrue(list.isEmpty());


        final String element1 = "asdasd";

        list.addTail(element1);

        Assert.assertEquals(1, list.getSize());
        Assert.assertTrue(!list.isEmpty());


        final String element2 = "asdasdsdasd";

        list.addTail(element2);

        Assert.assertEquals(2, list.getSize());
        Assert.assertTrue(!list.isEmpty());


        final String ret2 = list.removeTail();

        Assert.assertNotNull(ret2);
        Assert.assertEquals(1, list.getSize());
        Assert.assertTrue(!list.isEmpty());
        Assert.assertEquals(element2, ret2);


        final String ret1 = list.removeTail();

        Assert.assertNotNull(ret1);
        Assert.assertEquals(0, list.getSize());
        Assert.assertTrue(list.isEmpty());
        Assert.assertEquals(element1, ret1);
    }

    @Test
    public void testGet() {

        final DoublyLinkedList<String> list = new DoublyLinkedList<>();

        Assert.assertNotNull(list);

        Assert.assertEquals(0, list.getSize());
        Assert.assertTrue(list.isEmpty());

        final String element0 = "asdasd0";
        final String element1 = "asdasd1";
        final String element2 = "asdasd2";

        list.addHead(element1);
        list.addHead(element0);
        list.addTail(element2);

        Assert.assertEquals(3, list.getSize());
        Assert.assertTrue(!list.isEmpty());

        Assert.assertEquals(element0, list.getFromHead(0));
        Assert.assertEquals(element1, list.getFromHead(1));
        Assert.assertEquals(element2, list.getFromHead(2));

        Assert.assertEquals(element2, list.getFromTail(0));
        Assert.assertEquals(element1, list.getFromTail(1));
        Assert.assertEquals(element0, list.getFromTail(2));


        final String rmHead = list.removeHead();

        Assert.assertNotNull(rmHead);
        Assert.assertEquals(2, list.getSize());
        Assert.assertTrue(!list.isEmpty());
        Assert.assertEquals(element0, rmHead);


        final String rmTail = list.removeTail();

        Assert.assertNotNull(rmTail);
        Assert.assertEquals(1, list.getSize());
        Assert.assertTrue(!list.isEmpty());
        Assert.assertEquals(element2, rmTail);

        Assert.assertEquals(element1, list.getFromHead(0));
        Assert.assertEquals(element1, list.getFromTail(0));


        final String rmLast = list.removeHead();

        Assert.assertNotNull(rmLast);
        Assert.assertEquals(0, list.getSize());
        Assert.assertTrue(list.isEmpty());
        Assert.assertEquals(element1, rmLast);

    }

}
