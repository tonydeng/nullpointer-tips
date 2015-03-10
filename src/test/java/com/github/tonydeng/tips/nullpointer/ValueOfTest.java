package com.github.tonydeng.tips.nullpointer;

import org.junit.Test;

/**
 * Created by tonydeng on 15/3/10.
 */
public class ValueOfTest {
    private ValueOf valueOf = new ValueOf();

    @Test
    public void testUseValueOf() {
        Integer i = null;
        valueOf.useValueOf(i);
    }

    @Test
    public void testUseToString() {
        Integer i = null;
        valueOf.useToString(i);
    }
}
