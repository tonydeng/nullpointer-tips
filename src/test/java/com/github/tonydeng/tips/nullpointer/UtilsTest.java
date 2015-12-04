package com.github.tonydeng.tips.nullpointer;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created by tonydeng on 15/3/11.
 */
public class UtilsTest extends BaseTest{
    @Test
    public void testString(){
        String test = null;
        log.info("isEmpty:{}", StringUtils.isEmpty(test));
        log.info("isBlank:{}", StringUtils.isBlank(test));
        log.info("isNumeric:{}", StringUtils.isNumeric(test));
        log.info("isAllUpperCase:{}", StringUtils.isAllUpperCase(test));
    }
}
