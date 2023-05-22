package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TryMap {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("Name","Henry");
        map.put("Dept","HR");

        System.out.println(map);
        System.out.println(map.get("Name"));
        System.out.println(map.get("Dept"));

        Set<String> keys =  map.keySet();
       for (String key : keys){
           System.out.println(key + " " + map.get(key));

       }

        }
        }







