
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		choosefood
	 *	@date 		1623935336887
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.ImageView;

public class icecream_3_activity extends Activity {

	
	private View _bg__icecream_3_ek2;
	private View rectangle_1_ek3;
	private View rectangle_2_ek3;
	private View rectangle_57_ek3;
	private TextView _back_to_home_ek3;
	private TextView enjoy_your_mango_monday;
	private ImageView _vvsv0vkh0b0;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.icecream_3);

		
		_bg__icecream_3_ek2 = (View) findViewById(R.id._bg__icecream_3_ek2);
		rectangle_1_ek3 = (View) findViewById(R.id.rectangle_1_ek3);
		rectangle_2_ek3 = (View) findViewById(R.id.rectangle_2_ek3);
		rectangle_57_ek3 = (View) findViewById(R.id.rectangle_57_ek3);
		_back_to_home_ek3 = (TextView) findViewById(R.id._back_to_home_ek3);
		enjoy_your_mango_monday = (TextView) findViewById(R.id.enjoy_your_mango_monday);
		_vvsv0vkh0b0 = (ImageView) findViewById(R.id._vvsv0vkh0b0);
	
		
		_back_to_home_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_screen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_vvsv0vkh0b0.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), icecream_3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	