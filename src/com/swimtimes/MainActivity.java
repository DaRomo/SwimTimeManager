package com.swimtimes;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tapfortap.TapForTap;
import com.tapfortap.AdView;

public class MainActivity extends Activity implements OnClickListener
{
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        
        // Substitute your real App ID here
        TapForTap.setDefaultAppId("fc1478c0-d2d6-012f-d895-40400a3f6b7e");
        TapForTap.checkIn(this);
        
        setContentView(R.layout.mainpage);
        
        //Set up click listeners for all the buttons
        View LCM = findViewById(R.id.button1);
        LCM.setOnClickListener(this);
        
        View SCM = findViewById(R.id.button2);
        SCM.setOnClickListener(this);
        
        View SCY = findViewById(R.id.button3);
        SCY.setOnClickListener(this);
        
        View OW = findViewById(R.id.button4);
        OW.setOnClickListener(this);
        
        View About = findViewById(R.id.button5);
        About.setOnClickListener(this);
    
        // Now get the AdView and load TapForTap ads!
        AdView adView = (AdView) findViewById(R.id.ad_view);
        adView.loadAds();
        
        // If you want to remove the ad view later just be sure to call
        // stopLoadingAds() first, e.g. adView.stopLoadingAds()
    }
    
    /**
	 * @param View v
	 */
    public void onClick(View v)
    {
    	switch (v.getId())
    	{
    	case R.id.button1:
    		Intent i = new Intent(this, LCMtimes.class);
    		startActivity(i);
    		break;
    	case R.id.button2:
    		Intent j = new Intent(this, SCMtimes.class);
    		startActivity(j);
    		break;
    	case R.id.button3:
    		Intent k = new Intent(this, SCYtimes.class);
    		startActivity(k);
    		break;
    	case R.id.button4:
    		Intent l = new Intent(this, OWtimes.class);
    		startActivity(l);
    		break;
    	case R.id.button5:
    		Intent m = new Intent(this, About.class);
    		startActivity(m);
    		break;
    	}
    }
    
    static public class GraphicsView extends View
    {
    	Paint cPaint = null;
		Paint tPaint = null;
    	
    	public GraphicsView (Context context)
    	{
    		super(context);
    	}
    
    	@Override
    	protected void onDraw(Canvas canvas)
    	{
    	
    		Path circle = new Path();
    		circle.addCircle(150, 150, 100, Direction.CW);
    	
    		final String TITLE = "Best Swim Times";
    		cPaint.setColor(Color.RED);
    		tPaint.setColor(Color.BLUE);
    		canvas.drawPath(circle, cPaint);
    		canvas.drawTextOnPath(TITLE, circle, 0, 20, tPaint);    	
    	}
    }
}