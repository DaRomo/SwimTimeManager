package com.swimtimes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class About extends Activity implements OnClickListener
{
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        
        //Set up click listeners for all the buttons
        View back = findViewById(R.id.back);
        back.setOnClickListener(this);
    }
    
    public void onClick(View v)
    {
    	switch (v.getId())
    	{
    	case R.id.back:
    		Intent i = new Intent(this, MainActivity.class);
    		startActivity(i);
    		break;
    	}
    }
}
