package com.github.tonydeng.tips.nullpointer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by tonydeng on 15/3/10.
 */
public class Equals {
    private static final Logger log = LoggerFactory.getLogger(Equals.class);
    public void unknown(){
        Object unknownObject = null;

        if(unknownObject.equals("knownObject")){
            log.info("This may reslut in NullPointerException if unknownObject is null");
        }
    }

    public void known(){
        Object unknownObject = null;
        if("knownObject".equals(unknownObject)){
            log.info("better coding avoided NullPointerException");
        }
    }

}
