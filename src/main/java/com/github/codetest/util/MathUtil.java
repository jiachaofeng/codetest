package com.github.codetest.util;

public class MathUtil {

    public static boolean isDivisibleByNumber(Integer inVal, Integer number){

        if(inVal == null || number == null || number == 0){
            return false;
        }

        if(inVal % number == 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isContainsNumber(Integer inVal, Integer number){

        if(inVal == null || number == null){
            return false;
        }

        String sVal = inVal.toString();
        String sNumber = number.toString();
        if(sVal.contains(sNumber)){
            return true;
        }else {
            return false;
        }
    }
}
