
	 
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

public class fried_rice_screen_activity extends Activity {

	
	private View _bg__fried_rice_screen_ek2;
	private View rectangle_1_ek15;
	private View rectangle_2_ek15;
	private TextView our_variants__fried_rice;
	private TextView popular_now_ek3;
	private View rectangle_54_ek3;
	private View rectangle_55_ek3;
	private View rectangle_56_ek3;
	private ImageView __1hl_cllrspw_ek3;
	private TextView veg__fried_rice__150_00;
	private TextView shrimp_fried_rice__250_00;
	private ImageView _rh0yhbinkf4_ek1;
	private ImageView __6wfu4zx1u18_ek1;
	private TextView special_fried_rice__200_00;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fried_rice_screen);

		
		_bg__fried_rice_screen_ek2 = (View) findViewById(R.id._bg__fried_rice_screen_ek2);
		rectangle_1_ek15 = (View) findViewById(R.id.rectangle_1_ek15);
		rectangle_2_ek15 = (View) findViewById(R.id.rectangle_2_ek15);
		our_variants__fried_rice = (TextView) findViewById(R.id.our_variants__fried_rice);
		popular_now_ek3 = (TextView) findViewById(R.id.popular_now_ek3);
		rectangle_54_ek3 = (View) findViewById(R.id.rectangle_54_ek3);
		rectangle_55_ek3 = (View) findViewById(R.id.rectangle_55_ek3);
		rectangle_56_ek3 = (View) findViewById(R.id.rectangle_56_ek3);
		__1hl_cllrspw_ek3 = (ImageView) findViewById(R.id.__1hl_cllrspw_ek3);
		veg__fried_rice__150_00 = (TextView) findViewById(R.id.veg__fried_rice__150_00);
		shrimp_fried_rice__250_00 = (TextView) findViewById(R.id.shrimp_fried_rice__250_00);
		_rh0yhbinkf4_ek1 = (ImageView) findViewById(R.id._rh0yhbinkf4_ek1);
		__6wfu4zx1u18_ek1 = (ImageView) findViewById(R.id.__6wfu4zx1u18_ek1);
		special_fried_rice__200_00 = (TextView) findViewById(R.id.special_fried_rice__200_00);
	
		
		__1hl_cllrspw_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), fried_rice_1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rh0yhbinkf4_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), fried_rice_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		__6wfu4zx1u18_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), fried_rice_3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	