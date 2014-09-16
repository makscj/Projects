package com.example.rideuta;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myfirstapp.R;

public class MainActivity extends ActionBarActivity {
	
//	private Button pres, web, home220, home213, libr;
	private final String phoneNumber = "882-882";
	
	private HashMap<String, String> map;
	private HashMap<Integer,String> buttonIDs;
	private ArrayList<Button> buttons;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		map = new HashMap<String,String>();
		buttonIDs = new HashMap<Integer,String>();
		buttons = new ArrayList<Button>();
		
		String[] nums = {"126556","101936","126581","137240","127117"};
		String[] names = {"pres","web","home220","home213","libr"};
		int[] ids = {R.id.pres, R.id.web,R.id.home220,R.id.home213,R.id.libr};
		
		for(int i = 0; i<nums.length; i++){
			map.put(nums[i], names[i]);
			buttonIDs.put(ids[i], nums[i]);
			Button b = (Button) findViewById(ids[i]);
			buttons.add(b);
		}
		
//		pres = (Button) findViewById(R.id.pres);
//		web = (Button) findViewById(R.id.web);
//		home220 = (Button) findViewById(R.id.home220);
//		home213 = (Button) findViewById(R.id.home213);
//		libr = (Button) findViewById(R.id.libr);
	}
	public void sendMessage(View v){
		String message;
		for(Button b : buttons){
			if(b.getId()==v.getId()){
				message = buttonIDs.get(v.getId());
				sendSMS(phoneNumber,message);
				break;
			}
		}
//		switch(v.getId()){
//		case R.id.pres:
//			message = "126556";
//			sendSMS(phoneNumber, message);
//			break;
//		case R.id.web:
//			message = "101936";
//			sendSMS(phoneNumber, message);
//			break;
//		case R.id.home220:
//			message = "126581";
//			sendSMS(phoneNumber, message);
//			break;
//		case R.id.home213:
//			message = "137240";
//			sendSMS(phoneNumber, message);
//			break;
//		case R.id.libr:
//			message = "127117";
//			sendSMS(phoneNumber, message);
//			break;
//		}
	}
	private void sendSMS(String phoneNumber, String message){
		Log.v("phoneNumber",phoneNumber);
		Log.v("Message",message);
		SmsManager sms = SmsManager.getDefault();
		sms.sendTextMessage(phoneNumber, null, message, null, null);
	}
	
	public void addNumber(View v){
		EditText edit = (EditText)findViewById(R.id.edit_text);
		String num = edit.getText().toString();
		
		
		//second edit text
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}