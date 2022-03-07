package com.lbs.jflib;

import android.content.Context;

public class JioForms {

    public static String showForm(Context context, String appID, String appSecretKey, String formID){
        String transactionID  = ""+System.currentTimeMillis();


        return transactionID;
    }

    public static String fetchFormSubmissionData(Context context,String appID,String appSecretKey,String transactionID){
        String formData="";


        return formData;
    }
}
