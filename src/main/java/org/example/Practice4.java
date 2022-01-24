package org.example;

import java.util.*;
import java.util.logging.Logger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Practice4 {
    public static void main(String[] args){
        Map<String, Double> a = new HashMap<>();
        a.put("LA", 1.0);
        a.put("LB", 2.0);
        System.out.println(a.values());
    }
}
