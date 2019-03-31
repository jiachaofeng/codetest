package com.github.codetest.service;

import com.github.codetest.util.MathUtil;

import java.util.HashMap;
import java.util.Map;

public class PrintService {

    public static void printNumberAsList(Integer startVal, Integer endVal, HashMap<Integer,String> numberMap){
        if(startVal == null || endVal == null){
            System.out.println("startVal or endVal is null, please check the input");
        }

        for(int i = startVal.intValue(); i <= endVal.intValue(); i++){
            StringBuffer stringBuffer = new StringBuffer();
            for(Map.Entry<Integer,String> entry : numberMap.entrySet()){
                Integer key = entry.getKey();
                String replaceVal =  entry.getValue();
                if(MathUtil.isDivisibleByNumber(i,key) || MathUtil.isContainsNumber(i,key)){
                    stringBuffer.append(replaceVal);
                }
            }

            String output = stringBuffer.toString();
            if (output == null || output.isEmpty()) {
                output = String.valueOf(i);
            }
            System.out.println(output);
        }
    }
}
