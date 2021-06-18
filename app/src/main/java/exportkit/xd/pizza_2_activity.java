
	 
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

public class pizza_2_activity extends Activity {

	
	private View _bg__pizza_2_ek2;
	private View rectangle_1_ek7;
	private View rectangle_2_ek7;
	private View rectangle_57_ek7;
	private TextView _back_to_home_ek7;
	private TextView enjoy_your_detroit_pizza;
	private ImageView _bmvayjpf6mu;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.pizza_2);

		
		_bg__pizza_2_ek2 = (View) findViewById(R.id._bg__pizza_2_ek2);
		rectangle_1_ek7 = (View) findViewById(R.id.rectangle_1_ek7);
		rectangle_2_ek7 = (View) findViewById(R.id.rectangle_2_ek7);
		rectangle_57_ek7 = (View) findViewById(R.id.rectangle_57_ek7);
		_back_to_home_ek7 = (TextView) findViewById(R.id._back_to_home_ek7);
		enjoy_your_detroit_pizza = (TextView) findViewById(R.id.enjoy_your_detroit_pizza);
		_bmvayjpf6mu = (ImageView) findViewById(R.id._bmvayjpf6mu);
	
		
		_back_to_home_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_screen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_bmvayjpf6mu.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pizza_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	