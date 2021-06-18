
	 
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

public class icecream_1_activity extends Activity {

	
	private View _bg__icecream_1_ek2;
	private View rectangle_1_ek5;
	private View rectangle_2_ek5;
	private View rectangle_57_ek5;
	private TextView _back_to_home_ek5;
	private TextView enjoy_your_sweet_special;
	private ImageView _uoihptext3q;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.icecream_1);

		
		_bg__icecream_1_ek2 = (View) findViewById(R.id._bg__icecream_1_ek2);
		rectangle_1_ek5 = (View) findViewById(R.id.rectangle_1_ek5);
		rectangle_2_ek5 = (View) findViewById(R.id.rectangle_2_ek5);
		rectangle_57_ek5 = (View) findViewById(R.id.rectangle_57_ek5);
		_back_to_home_ek5 = (TextView) findViewById(R.id._back_to_home_ek5);
		enjoy_your_sweet_special = (TextView) findViewById(R.id.enjoy_your_sweet_special);
		_uoihptext3q = (ImageView) findViewById(R.id._uoihptext3q);
	
		
		_back_to_home_ek5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_screen_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_uoihptext3q.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), icecream_1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	