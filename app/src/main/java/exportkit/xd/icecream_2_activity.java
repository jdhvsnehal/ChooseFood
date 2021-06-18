
	 
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

public class icecream_2_activity extends Activity {

	
	private View _bg__icecream_2_ek2;
	private View rectangle_1_ek4;
	private View rectangle_2_ek4;
	private View rectangle_57_ek4;
	private TextView _back_to_home_ek4;
	private TextView enjoy_your_strawberry_delights;
	private ImageView _d9k7bfw2vh8;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.icecream_2);

		
		_bg__icecream_2_ek2 = (View) findViewById(R.id._bg__icecream_2_ek2);
		rectangle_1_ek4 = (View) findViewById(R.id.rectangle_1_ek4);
		rectangle_2_ek4 = (View) findViewById(R.id.rectangle_2_ek4);
		rectangle_57_ek4 = (View) findViewById(R.id.rectangle_57_ek4);
		_back_to_home_ek4 = (TextView) findViewById(R.id._back_to_home_ek4);
		enjoy_your_strawberry_delights = (TextView) findViewById(R.id.enjoy_your_strawberry_delights);
		_d9k7bfw2vh8 = (ImageView) findViewById(R.id._d9k7bfw2vh8);
	
		
		_back_to_home_ek4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_screen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_d9k7bfw2vh8.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), icecream_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	