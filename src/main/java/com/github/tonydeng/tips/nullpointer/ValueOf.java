package com.github.tonydeng.tips.nullpointer;

/**
 * Created by tonydeng on 15/3/10.
 * <p>
 * 当valueOf和toString返回相同的结果时，宁愿使用前者
 * 因为调用null对象的toString()会抛出空指针异常，如果我们能够使用valueOf()获得相同的值，那宁愿使用valueOf()，传递一个null给valueOf()将会返回“null”.
 * 尤其是在那些包装类，像Integer、Float、Double和BigDecimal。
 * </p>
 */
public class ValueOf {

    public String useValueOf(Object o) {
        return String.valueOf(o);
    }

    public String useToString(Object o) {
        try{
            return o.toString();
        }catch (NullPointerException e){

        }
        return null;
    }
}
