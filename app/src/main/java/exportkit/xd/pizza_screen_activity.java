
	 
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

public class pizza_screen_activity extends Activity {

	
	private View _bg__pizza_screen_ek2;
	private View rectangle_1_ek14;
	private View rectangle_2_ek14;
	private TextView our_variants__pizza;
	private TextView popular_now_ek2;
	private View rectangle_54_ek2;
	private View rectangle_55_ek2;
	private View rectangle_56_ek2;
	private TextView neapolitan_pizza__250_00;
	private TextView detroit_pizza__200_00;
	private TextView st__louis_pizza__300_00;
	private ImageView __1hl_cllrspw_ek2;
	private ImageView _bmvayjpf6mu_ek1;
	private ImageView _y6ogisigbjm_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.pizza_screen);

		
		_bg__pizza_screen_ek2 = (View) findViewById(R.id._bg__pizza_screen_ek2);
		rectangle_1_ek14 = (View) findViewById(R.id.rectangle_1_ek14);
		rectangle_2_ek14 = (View) findViewById(R.id.rectangle_2_ek14);
		our_variants__pizza = (TextView) findViewById(R.id.our_variants__pizza);
		popular_now_ek2 = (TextView) findViewById(R.id.popular_now_ek2);
		rectangle_54_ek2 = (View) findViewById(R.id.rectangle_54_ek2);
		rectangle_55_ek2 = (View) findViewById(R.id.rectangle_55_ek2);
		rectangle_56_ek2 = (View) findViewById(R.id.rectangle_56_ek2);
		neapolitan_pizza__250_00 = (TextView) findViewById(R.id.neapolitan_pizza__250_00);
		detroit_pizza__200_00 = (TextView) findViewById(R.id.detroit_pizza__200_00);
		st__louis_pizza__300_00 = (TextView) findViewById(R.id.st__louis_pizza__300_00);
		__1hl_cllrspw_ek2 = (ImageView) findViewById(R.id.__1hl_cllrspw_ek2);
		_bmvayjpf6mu_ek1 = (ImageView) findViewById(R.id._bmvayjpf6mu_ek1);
		_y6ogisigbjm_ek1 = (ImageView) findViewById(R.id._y6ogisigbjm_ek1);
	
		
		__1hl_cllrspw_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pizza_1_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_bmvayjpf6mu_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pizza_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_y6ogisigbjm_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), pizza_3_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	