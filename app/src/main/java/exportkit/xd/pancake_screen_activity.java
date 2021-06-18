
	 
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

public class pancake_screen_activity extends Activity {

	
	private View _bg__pancake_screen_ek2;
	private View rectangle_1_ek12;
	private View rectangle_2_ek12;
	private TextView our_variants__pancake;
	private TextView popular_now;
	private View rectangle_54;
	private View rectangle_55;
	private View rectangle_56;
	private TextView blueberry_love__125_00;
	private TextView sweet_nicities__150_00;
	private TextView berry_mounts__200_00;
	private ImageView _qp7wa8av2x0_ek1;
	private ImageView _zt_0gwkodxk_ek1;
	private ImageView _y4k7ydp2z3y_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.pancake_screen);

		
		_bg__pancake_screen_ek2 = (View) findViewById(R.id._bg__pancake_screen_ek2);
		rectangle_1_ek12 = (View) findViewById(R.id.rectangle_1_ek12);
		rectangle_2_ek12 = (View) findViewById(R.id.rectangle_2_ek12);
		our_variants__pancake = (TextView) findViewById(R.id.our_variants__pancake);
		popular_now = (TextView) findViewById(R.id.popular_now);
		rectangle_54 = (View) findViewById(R.id.rectangle_54);
		rectangle_55 = (View) findViewById(R.id.rectangle_55);
		rectangle_56 = (View) findViewById(R.id.rectangle_56);
		blueberry_love__125_00 = (TextView) findViewById(R.id.blueberry_love__125_00);
		sweet_nicities__150_00 = (TextView) findViewById(R.id.sweet_nicities__150_00);
		berry_mounts__200_00 = (TextView) findViewById(R.id.berry_mounts__200_00);
		_qp7wa8av2x0_ek1 = (ImageView) findViewById(R.id._qp7wa8av2x0_ek1);
		_zt_0gwkodxk_ek1 = (ImageView) findViewById(R.id._zt_0gwkodxk_ek1);
		_y4k7ydp2z3y_ek1 = (ImageView) findViewById(R.id._y4k7ydp2z3y_ek1);
	
		
		_qp7wa8av2x0_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pancake_1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_zt_0gwkodxk_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pancake_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_y4k7ydp2z3y_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pancake_3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	