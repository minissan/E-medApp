package com.example.e_medapp;

/**
 * Created by LENOVO on 10/15/2016.
 */

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class adminRequest extends StringRequest {
    private static final String LOGIN_REQUEST_URL = "http://minissan.comlu.com/AdminLogin.php";
    private Map<String, String> params;

    public adminRequest(String username, String password, Response.Listener<String> listener) {
        super(Method.POST, LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}