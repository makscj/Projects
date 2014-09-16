package com.example.rideuta;
import java.util.*;

public class Storage {

	private HashMap<String, String> map;
	
	
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
