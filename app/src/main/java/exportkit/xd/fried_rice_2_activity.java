
	 
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

public class fried_rice_2_activity extends Activity {

	
	private View _bg__fried_rice_2_ek2;
	private View rectangle_1_ek10;
	private View rectangle_2_ek10;
	private View rectangle_57_ek10;
	private TextView _back_to_home_ek10;
	private TextView enjoy_your_shrimp_fried_rice;
	private ImageView _rh0yhbinkf4;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fried_rice_2);

		
		_bg__fried_rice_2_ek2 = (View) findViewById(R.id._bg__fried_rice_2_ek2);
		rectangle_1_ek10 = (View) findViewById(R.id.rectangle_1_ek10);
		rectangle_2_ek10 = (View) findViewById(R.id.rectangle_2_ek10);
		rectangle_57_ek10 = (View) findViewById(R.id.rectangle_57_ek10);
		_back_to_home_ek10 = (TextView) findViewById(R.id._back_to_home_ek10);
		enjoy_your_shrimp_fried_rice = (TextView) findViewById(R.id.enjoy_your_shrimp_fried_rice);
		_rh0yhbinkf4 = (ImageView) findViewById(R.id._rh0yhbinkf4);
	
		
		_back_to_home_ek10.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_screen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rh0yhbinkf4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), fried_rice_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	