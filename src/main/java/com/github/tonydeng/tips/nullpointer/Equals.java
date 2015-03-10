package com.github.tonydeng.tips.nullpointer;


/**
 * Created by tonydeng on 15/3/10.
 */
public class Equals {
    public void unknown(){
        Object unknownObject = null;

        if(unknownObject.equals("knownObject")){
            System.out.println("This may reslut in NullPointerException if unknownObject is null");
        }
    }

    public void known(){
        Object unknownObject = null;
        if("knownObject".equals(unknownObject)){
            System.out.println("better coding avoided NullPointerException");
        }
    }

    public static void main(String[] args){
        Equals e =new Equals();
//        e.unknown();
        e.known();
    }
}
