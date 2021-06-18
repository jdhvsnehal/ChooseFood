
	 
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

public class pancake_2_activity extends Activity {

	
	private View _bg__pancake_2_ek2;
	private View rectangle_1_ek1;
	private View rectangle_2_ek1;
	private View rectangle_57_ek1;
	private TextView _back_to_home_ek1;
	private TextView enjoy_your_sweet_nicities;
	private ImageView _zt_0gwkodxk;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.pancake_2);

		
		_bg__pancake_2_ek2 = (View) findViewById(R.id._bg__pancake_2_ek2);
		rectangle_1_ek1 = (View) findViewById(R.id.rectangle_1_ek1);
		rectangle_2_ek1 = (View) findViewById(R.id.rectangle_2_ek1);
		rectangle_57_ek1 = (View) findViewById(R.id.rectangle_57_ek1);
		_back_to_home_ek1 = (TextView) findViewById(R.id._back_to_home_ek1);
		enjoy_your_sweet_nicities = (TextView) findViewById(R.id.enjoy_your_sweet_nicities);
		_zt_0gwkodxk = (ImageView) findViewById(R.id._zt_0gwkodxk);
	
		
		_back_to_home_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_screen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_zt_0gwkodxk.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pancake_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	