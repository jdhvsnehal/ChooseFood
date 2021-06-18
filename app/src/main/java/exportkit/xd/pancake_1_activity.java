
	 
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

public class pancake_1_activity extends Activity {

	
	private View _bg__pancake_1_ek2;
	private View rectangle_1_ek2;
	private View rectangle_2_ek2;
	private View rectangle_57_ek2;
	private TextView _back_to_home_ek2;
	private TextView enjoy_your_blueberry_love;
	private ImageView _qp7wa8av2x0;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.pancake_1);

		
		_bg__pancake_1_ek2 = (View) findViewById(R.id._bg__pancake_1_ek2);
		rectangle_1_ek2 = (View) findViewById(R.id.rectangle_1_ek2);
		rectangle_2_ek2 = (View) findViewById(R.id.rectangle_2_ek2);
		rectangle_57_ek2 = (View) findViewById(R.id.rectangle_57_ek2);
		_back_to_home_ek2 = (TextView) findViewById(R.id._back_to_home_ek2);
		enjoy_your_blueberry_love = (TextView) findViewById(R.id.enjoy_your_blueberry_love);
		_qp7wa8av2x0 = (ImageView) findViewById(R.id._qp7wa8av2x0);
	
		
		_back_to_home_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_screen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_qp7wa8av2x0.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pancake_1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	