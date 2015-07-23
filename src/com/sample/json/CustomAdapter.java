package com.sample.json;


import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter{
	Context c;
	ArrayList<String> a;

	public CustomAdapter(Context c, ArrayList<String> a) {
		// TODO Auto-generated constructor stub
		this.c=c;
		this.a=a;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return a.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		View v = null;
		
		// TODO Auto-generated method stub
		if(arg1==null)
		{
		LayoutInflater i=LayoutInflater.from(c);
		 v=i.inflate(R.layout.list_item, null);
		}
		TextView textView1=(TextView)v.findViewById(R.id.textView1);
		textView1.setText(""+a.get(arg0));
		return v;
	}

}
