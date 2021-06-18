
	 
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

public class icecream_screen_activity extends Activity {

	
	private View _bg__icecream_screen_ek2;
	private View rectangle_1_ek13;
	private View rectangle_2_ek13;
	private TextView our_variants__ice_cream;
	private TextView popular_now_ek1;
	private View rectangle_54_ek1;
	private View rectangle_55_ek1;
	private View rectangle_56_ek1;
	private TextView sweet_special__100_00;
	private TextView strawberry_delights__150_00;
	private TextView mango_monday__125_00;
	private ImageView _uoihptext3q_ek1;
	private ImageView _d9k7bfw2vh8_ek1;
	private ImageView _vvsv0vkh0b0_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.icecream_screen);

		
		_bg__icecream_screen_ek2 = (View) findViewById(R.id._bg__icecream_screen_ek2);
		rectangle_1_ek13 = (View) findViewById(R.id.rectangle_1_ek13);
		rectangle_2_ek13 = (View) findViewById(R.id.rectangle_2_ek13);
		our_variants__ice_cream = (TextView) findViewById(R.id.our_variants__ice_cream);
		popular_now_ek1 = (TextView) findViewById(R.id.popular_now_ek1);
		rectangle_54_ek1 = (View) findViewById(R.id.rectangle_54_ek1);
		rectangle_55_ek1 = (View) findViewById(R.id.rectangle_55_ek1);
		rectangle_56_ek1 = (View) findViewById(R.id.rectangle_56_ek1);
		sweet_special__100_00 = (TextView) findViewById(R.id.sweet_special__100_00);
		strawberry_delights__150_00 = (TextView) findViewById(R.id.strawberry_delights__150_00);
		mango_monday__125_00 = (TextView) findViewById(R.id.mango_monday__125_00);
		_uoihptext3q_ek1 = (ImageView) findViewById(R.id._uoihptext3q_ek1);
		_d9k7bfw2vh8_ek1 = (ImageView) findViewById(R.id._d9k7bfw2vh8_ek1);
		_vvsv0vkh0b0_ek1 = (ImageView) findViewById(R.id._vvsv0vkh0b0_ek1);
	
		
		_uoihptext3q_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), icecream_1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_d9k7bfw2vh8_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), icecream_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_vvsv0vkh0b0_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), icecream_3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	