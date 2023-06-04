package com.day20220_10_30;

import java.util.HashMap;
import java.util.Map;

public class map {

    public static void main(String[] args) {
        Map<String,String> map = createMap(99);
        //TODO 通过get方法,得到传递的key对应的value
        //TODO 注意,get方法并没有使用泛型,他的类型是object
        System.out.println("key20");
        //TODO 如果没有key,或者Key可能对应的值为Null 那么就返回Null
        System.out.println(map.get(new Object()));
        System.out.println(map.get("key999"));

        //TODO 通过Entry便利Map
        for(Map.Entry<String,String> entry :map.entrySet()){
            System.out.println("key为"+entry.getKey());
            System.out.println("value为"+entry.getValue());
        }
    }

    private static Map<String,String> createMap(int size){
        Map<String,String> ret = new HashMap<>();
        for(int i = 0;i<size;i++){
            //TODO put的第一个为Key,第二个为value
            ret.put("key"+i,String.valueOf(Math.random()));
        }
        return ret;
    }
}
