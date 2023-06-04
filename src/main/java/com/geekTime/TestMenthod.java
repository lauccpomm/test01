package com.geekTime;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMenthod {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Student> peopleClass = Student.class;
        Method re = peopleClass.getMethod("re");
        re.invoke(new Student());
        re.invoke(new statido());
        re.invoke(new People());

    }
}
