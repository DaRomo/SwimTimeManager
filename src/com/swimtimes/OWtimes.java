package com.swimtimes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class OWtimes extends Activity implements OnClickListener
{
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ow);
        
        //Set up click listeners for all the buttons
        View startButton8 = findViewById(R.id.BTH);
        startButton8.setOnClickListener(this);
        
        View startButton = findViewById(R.id.OW1M);
        startButton.setOnClickListener(this);
        
        View startButton2 = findViewById(R.id.OW2M);
        startButton2.setOnClickListener(this);
        
        View startButton3 = findViewById(R.id.OW3M);
        startButton3.setOnClickListener(this);
        
        View startButton4 = findViewById(R.id.OW5M);
        startButton4.setOnClickListener(this);
        
        View startButton5 = findViewById(R.id.OW5K);
        startButton5.setOnClickListener(this);
        
        View startButton6 = findViewById(R.id.OW10K);
        startButton6.setOnClickListener(this);
        
        View startButton7 = findViewById(R.id.OW25K);
        startButton7.setOnClickListener(this);
    }
    
    /**
	 * @param View v
	 */
   public void onClick(View v)
   {
   	switch (v.getId())
   	{
   	case R.id.BTH:
   		Intent i8 = new Intent(this, MainActivity.class);
   		startActivity(i8);
   		break;
   	case R.id.OW1M:
   		Intent i = new Intent(this, OW1M.class);
   		startActivity(i);
   		break;
   	case R.id.OW2M:
   		Intent i2 = new Intent(this, OW2M.class);
   		startActivity(i2);
   		break;
   	case R.id.OW3M:
   		Intent i3 = new Intent(this, OW3M.class);
   		startActivity(i3);
   		break;
   	case R.id.OW5M:
   		Intent i4 = new Intent(this, OW5M.class);
   		startActivity(i4);
   		break;
   	case R.id.OW5K:
   		Intent i5 = new Intent(this, OW5K.class);
   		startActivity(i5);
   		break;
   	case R.id.OW10K:
   		Intent i6 = new Intent(this, OW10K.class);
   		startActivity(i6);
   		break;
   	case R.id.OW25K:
   		Intent i7 = new Intent(this, OW25K.class);
   		startActivity(i7);
   		break;
   	}
   }
}
