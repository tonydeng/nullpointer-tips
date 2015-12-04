package com.github.tonydeng.tips.nullpointer;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tonydeng on 15/3/10.
 */
@Ignore
public class ValueOfTest {
    private ValueOf valueOf = new ValueOf();

    @Test
    public void testNullUseValueOf() {
        Integer i = null;
        assertEquals(valueOf.useValueOf(i), "null");

        Boolean b = null;
        assertEquals(valueOf.useValueOf(b),"null");

        Double d = null;
        assertEquals(valueOf.useValueOf(d),"null");

        Long l = null;
        assertEquals(valueOf.useValueOf(l),"null");
    }

    @Test
    public void testNullUseToString() {
        Integer i = null;
        assertNull("use to string is null",valueOf.useToString(i));

        Boolean b = null;
        assertNull("use to string is null", valueOf.useToString(b));

        Double d = null;
        assertNull("use to string is null", valueOf.useToString(d));

        Long l = null;
        assertNull("use to string is null", valueOf.useToString(l));
    }

//    @Test
    public void testNullPointerException(){
        Object o = null;
        String s = (String) o;
    }
}
