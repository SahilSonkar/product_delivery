package com.example.product_delivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.product_delivery.Model.Retailer_info;
import com.example.product_delivery.Model.items;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    EditText retaierName, Location;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retaierName = findViewById(R.id.retailer_name);
        Location = findViewById(R.id.location);
        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InsertAsyc(getApplicationContext()).execute();
            }
        });

    }
    class InsertAsyc extends AsyncTask<Void , Void ,Void>{
        Context context;
        public InsertAsyc(Context context){
            this.context = context;
        }
        @Override
        protected Void doInBackground(Void... voids) {
            ArrayList<items> arrayList=new ArrayList<>();
            arrayList.add(new items(1,2,3));
            AppData.getInstance(context)
                    .dataQuery()
                    .insert(
                            new Retailer_info(
                                    retaierName.getText().toString(),
                                    Location.getText().toString() ,
                                    arrayList
                                            )
                            );
            return null;
        }
    }
    class readRetailer extends AsyncTask<Void , Void, List<Retailer_info>>{

        @Override
        protected List<Retailer_info> doInBackground(Void... voids) {
           ArrayList<Retailer_info> retailer_infos= (ArrayList<Retailer_info>) AppData.getInstance(getApplicationContext())
                    .dataQuery()
                    .getAllRetailer();
            return retailer_infos;
        }

        @Override
        protected void onPostExecute(List<Retailer_info> retailer_infos) {
            Log.d(TAG, "onPostExecute: "+retailer_infos.size());
        }
    }
}