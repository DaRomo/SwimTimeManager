package com.swimtimes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class SCMtimes extends Activity implements OnClickListener
{
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scm);
        
        //Set up click listeners for all the buttons
        View startButton28 = findViewById(R.id.BTH);
        startButton28.setOnClickListener(this);
        
        View startButton23 = findViewById(R.id.SCM25FR);
        startButton23.setOnClickListener(this);
        
        View startButton = findViewById(R.id.SCM50FR);
        startButton.setOnClickListener(this);
        
        View startButton2 = findViewById(R.id.SCM100FR);
        startButton2.setOnClickListener(this);
        
        View startButton3 = findViewById(R.id.SCM200FR);
        startButton3.setOnClickListener(this);
        
        View startButton4 = findViewById(R.id.SCM400FR);
        startButton4.setOnClickListener(this);
        
        View startButton5 = findViewById(R.id.SCM800FR);
        startButton5.setOnClickListener(this);
        
        View startButton6 = findViewById(R.id.SCM1500FR);
        startButton6.setOnClickListener(this);
        
        View startButton24 = findViewById(R.id.SCM25BK);
        startButton24.setOnClickListener(this);
        
        View startButton7 = findViewById(R.id.SCM50BK);
        startButton7.setOnClickListener(this);
        
        View startButton8 = findViewById(R.id.SCM100BK);
        startButton8.setOnClickListener(this);
        
        View startButton9 = findViewById(R.id.SCM200BK);
        startButton9.setOnClickListener(this);
        
        View startButton25 = findViewById(R.id.SCM25BR);
        startButton25.setOnClickListener(this);
        
        View startButton10 = findViewById(R.id.SCM50BR);
        startButton10.setOnClickListener(this);
        
        View startButton11 = findViewById(R.id.SCM100BR);
        startButton11.setOnClickListener(this);
        
        View startButton12 = findViewById(R.id.SCM200BR);
        startButton12.setOnClickListener(this);
        
        View startButton26 = findViewById(R.id.SCM25FL);
        startButton26.setOnClickListener(this);
        
        View startButton13 = findViewById(R.id.SCM50FL);
        startButton13.setOnClickListener(this);
        
        View startButton14 = findViewById(R.id.SCM100FL);
        startButton14.setOnClickListener(this);
        
        View startButton15 = findViewById(R.id.SCM200FL);
        startButton15.setOnClickListener(this);
        
        View startButton27 = findViewById(R.id.SCM100IM);
        startButton27.setOnClickListener(this);
        
        View startButton16 = findViewById(R.id.SCM200IM);
        startButton16.setOnClickListener(this);
        
        View startButton17 = findViewById(R.id.SCM400IM);
        startButton17.setOnClickListener(this);
        
        View startButton18 = findViewById(R.id.SCM200FRR);
        startButton18.setOnClickListener(this);
        
        View startButton19 = findViewById(R.id.SCM400FRR);
        startButton19.setOnClickListener(this);
        
        View startButton20 = findViewById(R.id.SCM800FRR);
        startButton20.setOnClickListener(this);
        
        View startButton21 = findViewById(R.id.SCM200MDR);
        startButton21.setOnClickListener(this);       
        
        View startButton22 = findViewById(R.id.SCM400MDR);
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
   		Intent i28 = new Intent(this, MainActivity.class);
   		startActivity(i28);
   		break;
   	case R.id.SCM25FR:
   		Intent i23 = new Intent(this, SCM25FR.class);
   		startActivity(i23);
   		break;
   	case R.id.SCM50FR:
   		Intent i = new Intent(this, SCM50FR.class);
   		startActivity(i);
   		break;
   	case R.id.SCM100FR:
   		Intent i2 = new Intent(this, SCM100FR.class);
   		startActivity(i2);
   		break;
   	case R.id.SCM200FR:
   		Intent i3 = new Intent(this, SCM200FR.class);
   		startActivity(i3);
   		break;
   	case R.id.SCM400FR:
   		Intent i4 = new Intent(this, SCM400FR.class);
   		startActivity(i4);
   		break;
   	case R.id.SCM800FR:
   		Intent i5 = new Intent(this, SCM800FR.class);
   		startActivity(i5);
   		break;
   	case R.id.SCM1500FR:
   		Intent i6 = new Intent(this, SCM1500FR.class);
   		startActivity(i6);
   		break;
   	case R.id.SCM25BK:
   		Intent i24 = new Intent(this, SCM25BK.class);
   		startActivity(i24);
   		break;
   	case R.id.SCM50BK:
   		Intent i7 = new Intent(this, SCM50BK.class);
   		startActivity(i7);
   		break;
   	case R.id.SCM100BK:
   		Intent i8 = new Intent(this, SCM100BK.class);
   		startActivity(i8);
   		break;
   	case R.id.SCM200BK:
   		Intent i9 = new Intent(this, SCM200BK.class);
   		startActivity(i9);
   		break;
   	case R.id.SCM25BR:
   		Intent i25 = new Intent(this, SCM25BR.class);
   		startActivity(i25);
   		break;
   	case R.id.SCM50BR:
   		Intent i10 = new Intent(this, SCM50BR.class);
   		startActivity(i10);
   		break;
   	case R.id.SCM100BR:
   		Intent i11 = new Intent(this, SCM100BR.class);
   		startActivity(i11);
   		break;
   	case R.id.SCM200BR:
   		Intent i12 = new Intent(this, SCM200BR.class);
   		startActivity(i12);
   		break;
   	case R.id.SCM25FL:
   		Intent i26 = new Intent(this, SCM25FL.class);
   		startActivity(i26);
   		break;
   	case R.id.SCM50FL:
   		Intent i13 = new Intent(this, SCM50FL.class);
   		startActivity(i13);
   		break;
   	case R.id.SCM100FL:
   		Intent i14 = new Intent(this, SCM100FL.class);
   		startActivity(i14);
   		break;
   	case R.id.SCM200FL:
   		Intent i15 = new Intent(this, SCM200FL.class);
   		startActivity(i15);
   		break;
   	case R.id.SCM100IM:
   		Intent i27 = new Intent(this, SCM100IM.class);
   		startActivity(i27);
   		break;
   	case R.id.SCM200IM:
   		Intent i16 = new Intent(this, SCM200IM.class);
   		startActivity(i16);
   		break;
   	case R.id.SCM400IM:
   		Intent i17 = new Intent(this, SCM400IM.class);
   		startActivity(i17);
   		break;
   	case R.id.SCM200FRR:
   		Intent i18 = new Intent(this, SCM200FRR.class);
   		startActivity(i18);
   		break;
   	case R.id.SCM400FRR:
   		Intent i19 = new Intent(this, SCM400FRR.class);
   		startActivity(i19);
   		break;
   	case R.id.SCM800FRR:
   		Intent i20 = new Intent(this, SCM800FRR.class);
   		startActivity(i20);
   		break;
   	case R.id.SCM200MDR:
   		Intent i21 = new Intent(this, SCM200MDR.class);
   		startActivity(i21);
   		break;
   	case R.id.SCM400MDR:
   		Intent i22 = new Intent(this, SCM400MDR.class);
   		startActivity(i22);
   		break;
   	}
   }
}
