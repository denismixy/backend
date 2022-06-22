package com.example.backend;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.IOException;

public class CipherModuleClient {

    private CipherModuleClient(){}

    public static String changePin() {
        String response = "";
        String url = "http://localhost:8082/changePin";
        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);
        method.setRequestHeader("Content-type",
                "text/xml; charset=ISO-8859-1");
        try {
            client.executeMethod(method);
            response = method.getResponseBodyAsString();
            method.releaseConnection();
        } catch(IOException e) {
            e.printStackTrace();
        }
        if (!response.isEmpty()) {
            return response;
        } else {
            return Templates.FAILED;
        }
    }

    public static String processingPinChange(String encryptedPin, String encryptedPan) {
        String response = "";
        String url = "http://localhost:8082/processingPinChange";
        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);
        method.setRequestHeader("Content-type","text/xml; charset=ISO-8859-1");
        NameValuePair nameValuePair1 = new NameValuePair("encryptedPin", encryptedPin);
        NameValuePair nameValuePair2 = new NameValuePair("encryptedPan", encryptedPan);
        method.setQueryString(new NameValuePair[]{nameValuePair1, nameValuePair2});
        try {
            client.executeMethod(method);
            response = method.getResponseBodyAsString();
            method.releaseConnection();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        if (!response.isEmpty()) {
            return response;
        } else {
            return Templates.FAILED;
        }
    }
}
