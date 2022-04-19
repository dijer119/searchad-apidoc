package com.naver.searchad.api.rest;

import com.mashape.unirest.http.HttpResponse;
import com.naver.searchad.api.model.estimate.DictionaryType;
import com.naver.searchad.api.util.RestClient;

import java.security.SignatureException;

public class Criterion {
    static String criterionPath = "/ncc/criterion";
    static String criterionDictionaryPath = "/ncc/criterion-dictionary";

    public static void list(RestClient rest, String adgroupId, long customerId) throws Exception {
        System.out.println("Criterion list start =>" + adgroupId + "/" + customerId);
        HttpResponse<String> response = rest.get(criterionPath+"/"+adgroupId+"?type=SD", customerId).asString();
        System.out.println(response);
        System.out.println("raw body => "+response.getRawBody());
        System.out.println("body => "+response.getBody());
    }

    public static void dictionaryList(RestClient rest, long customerId, DictionaryType dictionaryType) throws Exception {
        HttpResponse<String> response = rest.get(criterionDictionaryPath+"/"+ dictionaryType.getType(), customerId).asString();
        System.out.println("raw body => "+response.getRawBody());
        System.out.println("body => "+response.getBody());
    }
}
