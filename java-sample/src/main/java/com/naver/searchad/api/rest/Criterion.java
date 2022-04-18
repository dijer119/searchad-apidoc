package com.naver.searchad.api.rest;

import com.mashape.unirest.http.HttpResponse;
import com.naver.searchad.api.util.RestClient;

import java.security.SignatureException;

public class Criterion {
    static String criterionPath = "/ncc/criterion";

    public static void list(RestClient rest, String adgroupId, long customerId) throws Exception {
        System.out.println("Criterion list start =>" + adgroupId + "/" + customerId);
        HttpResponse<String> response = rest.get(criterionPath+"/"+adgroupId+"?type=SD", customerId).asString();
        System.out.println(response);
    }
}
