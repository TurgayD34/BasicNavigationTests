package com.cbt.utilities;


import com.google.common.base.Verify;

public class StringUtility {

    public static Verify getVerifyEquals(String expected, String actual){

        if (expected.equals(actual)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        return null;
    }
}
