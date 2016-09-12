package com.example.adi.json_parsing_2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONObject;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   /* void userRegister(){
        Log.d("CALL CHECK",uname);
        new UserRegister(this,this).execute();
        Log.d("CALL CHECK 2",uname);
    }

    private class UserRegister extends AsyncTask<String, Void, String> {

        private Activity activity;
        private Context context;

        public UserRegister(Activity activity, Context context) {
            this.activity = activity;
            this.context = context;
        }

        private ProgressDialog pDialog;

        @Override
        protected void onPreExecute() {
            pDialog = new ProgressDialog(MainActivity.this);
            pDialog.setMessage("Registering...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }

        @Override
        protected String doInBackground(String... args) {

            try {

                HashMap<String, String> params = new HashMap<>();
                params.put("username", uname);
                params.put("password",pword);

                //Log for Debugging
                Log.d("REQUEST_CHECK",uname);

                JSONObject json = jsonParser.makeHttpRequest("http://192.168.56.1/json_test/parse_one.php", "POST", params);

                //Log for Debugging
                Log.d("JSON_SUCCESSFUL", json.toString());

                int success = json.getInt(TAG_SUCCESS);
                name_tag=uname;
                mob_tag=json.getString(TAG_MOBILE);
                mail_tag=json.getString(TAG_EMAIL);

                Log.d("TAG_CHECK",mob_tag+mail_tag);
                if (success == 1) {
                    flag = 1;
                }

                else{

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }

        protected void onPostExecute(String jsonStr){
            if (pDialog != null && pDialog.isShowing()) {
                pDialog.dismiss();
            }
            performCheck();
        }
    }*/
}
