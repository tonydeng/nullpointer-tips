package com.github.tonydeng.tips.nullpointer;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;
/**
 * Created by tonydeng on 15/3/11.
 */
public class CollectionTest extends BaseTest{
    private Collection collection = new Collection();

    @Test
    public void testGetNullList(){
        assertNull(collection.getNullList());
        log.info("null list:'{}'",collection.getNullList());
//        for(String value:collection.getNullList()){
//            log.info("value:{}",value);
//        }
    }
    @Test
    public void testGetEmptyList(){
        assertEquals(collection.getEmptyList().size(), 0);
        log.info("empty list:'{}'",collection.getEmptyList());
        for(String value:collection.getEmptyList()){
            log.info("value:{}",value);
        }
    }
    @Test
    public void testGetNullMap(){
        assertNull((collection.getNullMap()));
        log.info("null map:'{}'",collection.getNullMap());
    }

    @Test
    public void testGetEmptyMap(){
        Map<String,String> emptyMap = collection.getEmptyMap();
        assertEquals(emptyMap.size(), 0);
        log.info("empty map:'{}'",emptyMap);
        for(String key:emptyMap.keySet()){
            log.info("key:{},value:{}",key,emptyMap.get(key));
        }
    }
}