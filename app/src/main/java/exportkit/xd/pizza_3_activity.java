
	 
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

public class pizza_3_activity extends Activity {

	
	private View _bg__pizza_3_ek2;
	private View rectangle_1_ek6;
	private View rectangle_2_ek6;
	private View rectangle_57_ek6;
	private TextView _back_to_home_ek6;
	private ImageView _y6ogisigbjm;
	private TextView enjoy_your_st__louis_pizza;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.pizza_3);

		
		_bg__pizza_3_ek2 = (View) findViewById(R.id._bg__pizza_3_ek2);
		rectangle_1_ek6 = (View) findViewById(R.id.rectangle_1_ek6);
		rectangle_2_ek6 = (View) findViewById(R.id.rectangle_2_ek6);
		rectangle_57_ek6 = (View) findViewById(R.id.rectangle_57_ek6);
		_back_to_home_ek6 = (TextView) findViewById(R.id._back_to_home_ek6);
		_y6ogisigbjm = (ImageView) findViewById(R.id._y6ogisigbjm);
		enjoy_your_st__louis_pizza = (TextView) findViewById(R.id.enjoy_your_st__louis_pizza);
	
		
		_back_to_home_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_screen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_y6ogisigbjm.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pizza_3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	