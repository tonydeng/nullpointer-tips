package com.github.tonydeng.tips.nullpointer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tonydeng on 15/3/17.
 */
public class AutoboxingTest extends BaseTest {
    @Test
    public void test() {

        // Example 1: == comparison pure primitive – no autoboxing
        int i1 = 1;
        int i2 = 1;
        log.info("i1==i2 : {}", (i1 == i2));
        assertTrue((i1 == i2));

        // Example 2: equality operator mixing object and primitive
        Integer num1 = 1;
        int num2 = 1;
        log.info("num1==num2 : {}", (num1 == num2));
        log.info("num1 equals num2 : {}", (num1.equals(num2)));
        assertTrue((num1 == num2));
        assertTrue((num1.equals(num2)));

        // Example 3: special case - arises due to autoboxing in Java
        Integer obj1 = 1; //autoboxing will call Integer.valueOf()
        Integer obj2 = 1; //same call to Integer.valueOf() will return same cached Object
        log.info("obj1==obj2 : {}", (obj1 == obj2));
        log.info("obj1 equals obj2 : {}", (obj1.equals(obj2)));
        assertTrue((obj1 == obj2));
        assertTrue((obj1.equals(obj2)));

        // Example 4: equality operator - pure object comparison
        Integer one = new Integer(1); // no autoboxing
        Integer anotherOne = new Integer(1);
        log.info("one == anotherOne : {}", (one == anotherOne)); // false
        log.info("one equals anotherOne : {}", (one.equals(anotherOne)));
        assertFalse((one == anotherOne));
        assertTrue((one.equals(anotherOne)));
    }

    @Test
    public void testPerson() {
        Person tony = new Person("tony");
        log.info("tony name : {}, phone : {}, age : {}", tony.getName(), tony.getPhone(), tony.getAge());
//        int phone  = tony.getPhone();
//        int age = tony.getAge();
//        assertEquals("1",(tony.getPhone().toString()));
        assertNull(tony.getPhone());

//        String phone = tony.getPhone().toString();
        assertTrue("null".equals(String.valueOf(tony.getPhone())));
    }

    class Person {
        private Integer phone;
        private int age;
        private String name;

        public Person() {
        }

        public Person(String name) {
            this.name = name;
        }

        public Integer getPhone() {
            return phone;
        }

        public void setPhone(Integer phone) {
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
