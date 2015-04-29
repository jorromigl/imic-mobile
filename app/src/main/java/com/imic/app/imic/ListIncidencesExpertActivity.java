package com.imic.app.imic;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import org.springframework.http.HttpAuthentication;
import org.springframework.http.HttpBasicAuthentication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class ListIncidencesExpertActivity extends ActionBarActivity {

    protected static final String TAG = ListIncidencesExpertActivity.class.getSimpleName();



    String user;
    String pass;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_incidences_expert);

        user = getIntent().getExtras().getString("user");
        pass = getIntent().getExtras().getString("password");
        FetchSecuredResourceTask f = new FetchSecuredResourceTask(this, user, pass);
        f.execute();

   }

    // ***************************************
    // Private classes
    // ***************************************
    private class FetchSecuredResourceTask extends AsyncTask<Integer, Void, Collection<String>> {

        Context mContext = null;
        final String url;
        String incidenceId;
        String user;
        String pass;

        Collection<Incidence> mealsOfDay = new ArrayList<Incidence>();

        Exception exception = null;

        FetchSecuredResourceTask(Context context, String user, String pass) {
            mContext = context;
            this.user = user;
            this.pass = pass;
            url = getString(R.string.base_uri)
                    + "/rest/expertIncidences.do";
        }

        ProgressDialog progressDialog = new ProgressDialog(ListIncidencesExpertActivity.this);


        @Override
        protected void onPreExecute() {

            super.onPreExecute();
            progressDialog.setMessage(getString(R.string.loadings));
            progressDialog.show();
        }

        @Override
        protected Collection<String> doInBackground(Integer... arg0) {
            Collection<Incidence> c = new ArrayList<Incidence>();
            try {

                _FakeX509TrustManager.allowAllSSL();

                HttpAuthentication authHeader = new HttpBasicAuthentication(
                        user, pass);

                HttpHeaders requestHeaders = new HttpHeaders();
                requestHeaders.setAuthorization(authHeader);
                requestHeaders.setAccept(Collections
                        .singletonList(MediaType.APPLICATION_JSON));
                requestHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

                MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
                map.add("incidenceId", incidenceId);

                org.springframework.http.HttpEntity<MultiValueMap<String, String>> request =
                        new org.springframework.http.HttpEntity<MultiValueMap<String, String>>(map, requestHeaders);

                // Create a new RestTemplate instance
                RestTemplate restTemplate = new RestTemplate();
                List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
                messageConverters.add(new MappingJacksonHttpMessageConverter());
                messageConverters.add(new FormHttpMessageConverter());
                restTemplate.setMessageConverters(messageConverters);

                try {
                    // Make the network request
                    Log.d(TAG, url);

                    ResponseEntity<Collection<String>> response = restTemplate.exchange(url,
                            HttpMethod.POST, request,
                            (Class<Collection<String>>) (Class<?>) Collection.class);

                    return response.getBody();

                } catch (HttpMessageNotReadableException e) {
                    Log.e(TAG, e.getLocalizedMessage(), e);
                    return new ArrayList<String>();
                } catch (HttpClientErrorException e) {
                    Log.e(TAG, e.getLocalizedMessage(), e);
                    return new ArrayList<String>();

                } catch (ResourceAccessException e) {
                    Log.e(TAG, e.getLocalizedMessage(), e);
                    return new ArrayList<String>();

                }

            } catch (Exception e) {
                Log.e("ClientServerDemo", "Error:", e);
                exception = e;
                return new ArrayList<String>();
            }


        }

    }
}




