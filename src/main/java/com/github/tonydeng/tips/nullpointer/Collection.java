package com.github.tonydeng.tips.nullpointer;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by tonydeng on 15/3/11.
 */
public class Collection {

    public List<String> getNullList(){
        return null;
    }

    public List<String> getEmptyList(){
        return Collections.EMPTY_LIST;
    }

    public Map<String,String> getNullMap(){
        return  null;
    }

    public Map<String,String> getEmptyMap(){
        return Collections.EMPTY_MAP;
    }
}
