package com.example.rideuta;

import com.example.myfirstapp.R;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
	
	private Button pres, web, home220, home213, libr;
	private final String phoneNumber = "882-882";

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		pres = (Button) findViewById(R.id.pres);
		web = (Button) findViewById(R.id.web);
		home220 = (Button) findViewById(R.id.home220);
		home213 = (Button) findViewById(R.id.home213);
		libr = (Button) findViewById(R.id.libr);
	}
	public void sendMessage(View v){
		String message;
		switch(v.getId()){
		case R.id.pres:
			message = "126556";
			sendSMS(phoneNumber, message);
			break;
		case R.id.web:
			message = "101936";
			sendSMS(phoneNumber, message);
			break;
		case R.id.home220:
			message = "126581";
			sendSMS(phoneNumber, message);
			break;
		case R.id.home213:
			message = "137240";
			sendSMS(phoneNumber, message);
			break;
		case R.id.libr:
			message = "127117";
			sendSMS(phoneNumber, message);
			break;
		}
	}
	private void sendSMS(String phoneNumber, String message){
		Log.v("phoneNumber",phoneNumber);
		Log.v("Message",message);
		SmsManager sms = SmsManager.getDefault();
		sms.sendTextMessage(phoneNumber, null, message, null, null);
	}
	
	public void addNumber(View v){
		
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