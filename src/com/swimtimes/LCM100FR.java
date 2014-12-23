package com.swimtimes;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class LCM100FR extends Activity implements OnClickListener
{
	private EditText editBox;
	private EditText editBox2;
	private EditText editBox3;
	private EditText editBox4;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lcm100fr);
   
        editBox =(EditText)findViewById(R.id.editText1);
        editBox2 =(EditText)findViewById(R.id.editText2);
        editBox3 =(EditText)findViewById(R.id.editText3);
        editBox4 =(EditText)findViewById(R.id.editText4);
        
      //Set up click listeners for all the buttons
        View back = findViewById(R.id.hp);
        back.setOnClickListener(this);
    }
    
    public void onClick(View v)
    {
    	switch (v.getId())
    	{
    	case R.id.hp:
    		Intent i = new Intent(this, LCMtimes.class);
    		startActivity(i);
    		break;
    	}
    }
   
   protected void onResume() 
   {
        super.onResume();

        SharedPreferences prefs = getPreferences(0);
        String restoredText = prefs.getString("text", null);
        if (restoredText != null)
        {
            editBox.setText(restoredText, TextView.BufferType.EDITABLE);

            int selectionStart = prefs.getInt("selection-start", -1);
            int selectionEnd = prefs.getInt("selection-end", -1);
            if (selectionStart != -1 && selectionEnd != -1)
            {
                editBox.setSelection(selectionStart, selectionEnd);
            }
        
            SharedPreferences prefs2 = getPreferences(1);
        	String restoredText2 = prefs2.getString("text2", null);
        	if (restoredText2 != null)
        	{
        		editBox2.setText(restoredText2, TextView.BufferType.EDITABLE);
        	}
        	SharedPreferences prefs3 = getPreferences(1);
        	String restoredText3 = prefs3.getString("text3", null);
        	if (restoredText3 != null)
        	{
        		editBox3.setText(restoredText3, TextView.BufferType.EDITABLE);
        	}
        	SharedPreferences prefs4 = getPreferences(1);
        	String restoredText4 = prefs4.getString("text4", null);
        	if (restoredText4 != null)
        	{
        		editBox4.setText(restoredText4, TextView.BufferType.EDITABLE);
        	}
        }
    }

    protected void onPause() {
        super.onPause();

        SharedPreferences.Editor editor = getPreferences(0).edit();
        editor.putString("text", editBox.getText().toString());
        editor.putInt("selection-start", editBox.getSelectionStart());
        editor.putInt("selection-end", editBox.getSelectionEnd());
        editor.commit();
        
        SharedPreferences.Editor editor2 = getPreferences(1).edit();
        editor2.putString("text2", editBox2.getText().toString());
        editor2.putInt("selection-start2", editBox2.getSelectionStart());
        editor2.putInt("selection-end2", editBox2.getSelectionEnd());
        editor2.commit();
        
        SharedPreferences.Editor editor3 = getPreferences(1).edit();
        editor3.putString("text3", editBox3.getText().toString());
        editor3.putInt("selection-start3", editBox3.getSelectionStart());
        editor3.putInt("selection-end3", editBox3.getSelectionEnd());
        editor3.commit();
        
        SharedPreferences.Editor editor4 = getPreferences(1).edit();
        editor4.putString("text4", editBox4.getText().toString());
        editor4.putInt("selection-start4", editBox4.getSelectionStart());
        editor4.putInt("selection-end4", editBox4.getSelectionEnd());
        editor4.commit();
    }
}
