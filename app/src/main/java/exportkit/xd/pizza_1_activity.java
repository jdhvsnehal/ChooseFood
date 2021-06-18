
	 
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

public class pizza_1_activity extends Activity {

	
	private View _bg__pizza_1_ek2;
	private View rectangle_1_ek8;
	private View rectangle_2_ek8;
	private View rectangle_57_ek8;
	private TextView _back_to_home_ek8;
	private TextView enjoy_your_neapolitian_pizza;
	private ImageView __1hl_cllrspw;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.pizza_1);

		
		_bg__pizza_1_ek2 = (View) findViewById(R.id._bg__pizza_1_ek2);
		rectangle_1_ek8 = (View) findViewById(R.id.rectangle_1_ek8);
		rectangle_2_ek8 = (View) findViewById(R.id.rectangle_2_ek8);
		rectangle_57_ek8 = (View) findViewById(R.id.rectangle_57_ek8);
		_back_to_home_ek8 = (TextView) findViewById(R.id._back_to_home_ek8);
		enjoy_your_neapolitian_pizza = (TextView) findViewById(R.id.enjoy_your_neapolitian_pizza);
		__1hl_cllrspw = (ImageView) findViewById(R.id.__1hl_cllrspw);
	
		
		_back_to_home_ek8.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_screen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		__1hl_cllrspw.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pizza_1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	