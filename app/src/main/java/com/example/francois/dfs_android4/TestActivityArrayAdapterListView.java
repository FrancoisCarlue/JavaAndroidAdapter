package com.example.francois.dfs_android4;


import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class TestActivityArrayAdapterListView extends ListActivity {
    static final String TAG="ArrayActivity";
    String[] COUNTRIES = {"France", "England", "Germany", "Italy", "Spain", "Austria", "Poland"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView myListView = getListView();
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this, R.layout.listview_layout,COUNTRIES);
        myListView.setAdapter(aa);

        myListView.setTextFilterEnabled(true);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });
        Log.i(TAG,"Lancement activité");
    }

}
