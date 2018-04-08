package com.dvsdimas.app.list;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dmylnev on 08.04.18.
 */

public class SinglyLinkedListTest {

    @Test
    public void test1() {

        final SinglyLinkedList<String> list = new SinglyLinkedList<>();

        Assert.assertNotNull(list);

        Assert.assertEquals(0, list.getSize());
        Assert.assertTrue(list.isEmpty());


        final String element1 = "asdasd";

        list.add(element1);

        Assert.assertEquals(1, list.getSize());
        Assert.assertTrue(!list.isEmpty());

        Assert.assertEquals(element1, list.get(0));


        final String element2 = "asfafdadfaDWA";

        list.add(element2);

        Assert.assertEquals(2, list.getSize());
        Assert.assertTrue(!list.isEmpty());

        Assert.assertEquals(element2, list.get(0));
        Assert.assertEquals(element1, list.get(1));



        final String ret2 = list.remove();

        Assert.assertEquals(1, list.getSize());
        Assert.assertTrue(!list.isEmpty());
        Assert.assertEquals(element2, ret2);

        Assert.assertEquals(element1, list.get(0));


        final String ret1 = list.remove();

        Assert.assertEquals(0, list.getSize());
        Assert.assertTrue(list.isEmpty());
        Assert.assertEquals(element1, ret1);


        final String retNull = list.remove();

        Assert.assertNull(retNull);
        Assert.assertEquals(0, list.getSize());
        Assert.assertTrue(list.isEmpty());
    }

}
