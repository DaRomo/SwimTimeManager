package com.swimtimes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class LCMtimes extends Activity implements OnClickListener
{
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lcm);
        
        //Set up click listeners for all the buttons
        View startButton23 = findViewById(R.id.BTH);
        startButton23.setOnClickListener(this);
        
        View startButton = findViewById(R.id.LCM50FR);
        startButton.setOnClickListener(this);
        
        View startButton2 = findViewById(R.id.LCM100FR);
        startButton2.setOnClickListener(this);
        
        View startButton3 = findViewById(R.id.LCM200FR);
        startButton3.setOnClickListener(this);
        
        View startButton4 = findViewById(R.id.LCM400FR);
        startButton4.setOnClickListener(this);
        
        View startButton5 = findViewById(R.id.LCM800FR);
        startButton5.setOnClickListener(this);
        
        View startButton6 = findViewById(R.id.LCM1500FR);
        startButton6.setOnClickListener(this);
        
        View startButton7 = findViewById(R.id.LCM50BK);
        startButton7.setOnClickListener(this);
        
        View startButton8 = findViewById(R.id.LCM100BK);
        startButton8.setOnClickListener(this);
        
        View startButton9 = findViewById(R.id.LCM200BK);
        startButton9.setOnClickListener(this);
        
        View startButton10 = findViewById(R.id.LCM50BR);
        startButton10.setOnClickListener(this);
        
        View startButton11 = findViewById(R.id.LCM100BR);
        startButton11.setOnClickListener(this);
        
        View startButton12 = findViewById(R.id.LCM200BR);
        startButton12.setOnClickListener(this);
        
        View startButton13 = findViewById(R.id.LCM50FL);
        startButton13.setOnClickListener(this);
        
        View startButton14 = findViewById(R.id.LCM100FL);
        startButton14.setOnClickListener(this);
        
        View startButton15 = findViewById(R.id.LCM200FL);
        startButton15.setOnClickListener(this);
        
        View startButton16 = findViewById(R.id.LCM200IM);
        startButton16.setOnClickListener(this);
        
        View startButton17 = findViewById(R.id.LCM400IM);
        startButton17.setOnClickListener(this);
        
        View startButton18 = findViewById(R.id.LCM200FRR);
        startButton18.setOnClickListener(this);
        
        View startButton19 = findViewById(R.id.LCM400FRR);
        startButton19.setOnClickListener(this);
        
        View startButton20 = findViewById(R.id.LCM800FRR);
        startButton20.setOnClickListener(this);
        
        View startButton21 = findViewById(R.id.LCM200MDR);
        startButton21.setOnClickListener(this);       
        
        View startButton22 = findViewById(R.id.LCM400MDR);
        startButton22.setOnClickListener(this);
        
    } 
	
    /**
	 * @param View v
	 */
   public void onClick(View v)
   {
   	switch (v.getId())
   	{
   	case R.id.BTH:
   		Intent i23 = new Intent(this, MainActivity.class);
   		startActivity(i23);
   		break;
   	case R.id.LCM50FR:
   		Intent i = new Intent(this, LCM50FR.class);
   		startActivity(i);
   		break;
   	case R.id.LCM100FR:
   		Intent i2 = new Intent(this, LCM100FR.class);
   		startActivity(i2);
   		break;
   	case R.id.LCM200FR:
   		Intent i3 = new Intent(this, LCM200FR.class);
   		startActivity(i3);
   		break;
   	case R.id.LCM400FR:
   		Intent i4 = new Intent(this, LCM400FR.class);
   		startActivity(i4);
   		break;
   	case R.id.LCM800FR:
   		Intent i5 = new Intent(this, LCM800FR.class);
   		startActivity(i5);
   		break;
   	case R.id.LCM1500FR:
   		Intent i6 = new Intent(this, LCM1500FR.class);
   		startActivity(i6);
   		break;
   	case R.id.LCM50BK:
   		Intent i7 = new Intent(this, LCM50BK.class);
   		startActivity(i7);
   		break;
   	case R.id.LCM100BK:
   		Intent i8 = new Intent(this, LCM100BK.class);
   		startActivity(i8);
   		break;
   	case R.id.LCM200BK:
   		Intent i9 = new Intent(this, LCM200BK.class);
   		startActivity(i9);
   		break;
   	case R.id.LCM50BR:
   		Intent i10 = new Intent(this, LCM50BR.class);
   		startActivity(i10);
   		break;
   	case R.id.LCM100BR:
   		Intent i11 = new Intent(this, LCM100BR.class);
   		startActivity(i11);
   		break;
   	case R.id.LCM200BR:
   		Intent i12 = new Intent(this, LCM200BR.class);
   		startActivity(i12);
   		break;
   	case R.id.LCM50FL:
   		Intent i13 = new Intent(this, LCM50FL.class);
   		startActivity(i13);
   		break;
   	case R.id.LCM100FL:
   		Intent i14 = new Intent(this, LCM100FL.class);
   		startActivity(i14);
   		break;
   	case R.id.LCM200FL:
   		Intent i15 = new Intent(this, LCM200FL.class);
   		startActivity(i15);
   		break;
   	case R.id.LCM200IM:
   		Intent i16 = new Intent(this, LCM200IM.class);
   		startActivity(i16);
   		break;
   	case R.id.LCM400IM:
   		Intent i17 = new Intent(this, LCM400IM.class);
   		startActivity(i17);
   		break;
   	case R.id.LCM200FRR:
   		Intent i18 = new Intent(this, LCM200FRR.class);
   		startActivity(i18);
   		break;
   	case R.id.LCM400FRR:
   		Intent i19 = new Intent(this, LCM400FRR.class);
   		startActivity(i19);
   		break;
   	case R.id.LCM800FRR:
   		Intent i20 = new Intent(this, LCM800FRR.class);
   		startActivity(i20);
   		break;
   	case R.id.LCM200MDR:
   		Intent i21 = new Intent(this, LCM200MDR.class);
   		startActivity(i21);
   		break;
   	case R.id.LCM400MDR:
   		Intent i22 = new Intent(this, LCM400MDR.class);
   		startActivity(i22);
   		break;
   	}
   }
}
