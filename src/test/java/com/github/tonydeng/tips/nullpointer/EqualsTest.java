package com.github.tonydeng.tips.nullpointer;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by tonydeng on 15/3/16.
 */
@Ignore
public class EqualsTest extends BaseTest{
    private Equals equals = new Equals();

    @Test
    public void unknownTest(){
        equals.unknown();
    }
    @Test
    public void knownTest(){
        equals.known();
    }
}
