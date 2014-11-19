package com.example.takaapplication;

import java.io.ObjectOutputStream.PutField;
import com.example.takaapplication.R.id;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.ActionBarActivity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.EventLog.Event;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginScreen extends ActionBarActivity implements OnClickListener {
	EditText etpassword, etusername;
	Button btnlogin;
	//int notification = 001;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_screen);
		//initialization
		etpassword=(EditText) findViewById(R.id.etpassword);
		etusername=(EditText) findViewById(R.id.etusername);
		btnlogin=(Button) findViewById(R.id.btnlogin);
		
		//setting on click listener
		btnlogin.setOnClickListener(this);
		
		//NOTIFICATIONS//
		
		//Build intent for notification content
//		Intent viewIntent = new Intent(this, Transaction.class);
//	    viewIntent.putExtra(EXTRA_EVENT_ID, eventId);
//	    PendingIntent viewPendingIntent = PendingIntent.getActivity(this, 0, viewIntent, 0);
//
//		NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
//
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnlogin:
            //check if login fields are empty
            if (etusername.getText().toString().equals("") &&etpassword.getText().toString().equals("")){

            }
            //check if user name is empty
            else if(etusername.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(), "please login", Toast.LENGTH_LONG).show();

            }
            //check if password is empty
            else if(etpassword.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(), "please enter your password", Toast.LENGTH_LONG).show();
            }
            //validation
            else if(! etpassword.getText().toString().equals("")){
                Toast.makeText(getApplication(),"You have to login",Toast.LENGTH_LONG).show();

            }
            else if(!etpassword.getText().toString().equals("")){
                Toast.makeText(getApplication(),"password required",Toast.LENGTH_LONG).show();
            }
			startActivity(new Intent(getApplicationContext(),Transaction.class));
			break;

		default:
			break;
		}

	}
}
