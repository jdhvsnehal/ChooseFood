
	 
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
import android.widget.ImageView;
import android.content.Intent;

public class splash_screen_activity extends Activity {

	
	private View _bg__splash_screen_ek2;
	private TextView choose_food;
	private TextView food_recomendation_application;
	private ImageView eeqbbemh9_c;
	private View rectangle_49;
	private TextView _get_started;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);

		
		_bg__splash_screen_ek2 = (View) findViewById(R.id._bg__splash_screen_ek2);
		choose_food = (TextView) findViewById(R.id.choose_food);
		food_recomendation_application = (TextView) findViewById(R.id.food_recomendation_application);
		eeqbbemh9_c = (ImageView) findViewById(R.id.eeqbbemh9_c);
		rectangle_49 = (View) findViewById(R.id.rectangle_49);
		_get_started = (TextView) findViewById(R.id._get_started);
	
		
		_get_started.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_screen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	