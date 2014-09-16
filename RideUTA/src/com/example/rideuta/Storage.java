package com.example.rideuta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import android.widget.Button;

public class Storage {

	private HashMap<String, String> map;
	
	private ArrayList<Button> buttons;
	
	public Storage(){
		map = new HashMap<String,String>();
	}
	
	public void addStop(String number, String name){
		map.put(number, name);
		
	}
	
	public Set<String> getNumbers(){
		return map.keySet();
	}
	
}
