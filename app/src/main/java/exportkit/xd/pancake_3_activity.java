
	 
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

public class pancake_3_activity extends Activity {

	
	private View _bg__pancake_3_ek2;
	private View rectangle_1;
	private View rectangle_2;
	private View rectangle_57;
	private TextView _back_to_home;
	private TextView enjoy_your_berry_mounts;
	private ImageView _y4k7ydp2z3y;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.pancake_3);

		
		_bg__pancake_3_ek2 = (View) findViewById(R.id._bg__pancake_3_ek2);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		rectangle_57 = (View) findViewById(R.id.rectangle_57);
		_back_to_home = (TextView) findViewById(R.id._back_to_home);
		enjoy_your_berry_mounts = (TextView) findViewById(R.id.enjoy_your_berry_mounts);
		_y4k7ydp2z3y = (ImageView) findViewById(R.id._y4k7ydp2z3y);
	
		
		_back_to_home.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_screen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_y4k7ydp2z3y.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pancake_3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	