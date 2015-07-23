package com.sample.json;


import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class Mainactivity extends Activity {
	ListView listView1;
	ArrayList<String> a;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		a=new ArrayList<String>();
		for(int i=0;i<=10;i++)
		{
			a.add("pp");
		}
		listView1=(ListView)findViewById(R.id.listView1);
		listView1.setAdapter(new CustomAdapter(getApplicationContext(),a));
	}

}
