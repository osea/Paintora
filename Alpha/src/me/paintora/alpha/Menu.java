package me.paintora.alpha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends Activity implements OnClickListener {

	Button btnGame, btnFreedraw, btnGallery;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		btnGame = (Button) findViewById(R.id.btnGame);
		btnGame.setOnClickListener(this);
		btnGallery = (Button) findViewById(R.id.btnGallery);
		btnGallery.setOnClickListener(this);
		btnFreedraw = (Button) findViewById(R.id.btnFreedraw);
		btnFreedraw.setOnClickListener(this);
	}

	public void onClick(View v) {
		if (v.equals(btnGame)) {
			Toast.makeText(getApplicationContext(),
					"Games are coming soon.",Toast.LENGTH_SHORT).show();
		} else if (v.equals(btnGallery)) {
			Toast.makeText(getApplicationContext(),
					"Gallery is coming soon.",Toast.LENGTH_SHORT).show();
		} else if (v.equals(btnFreedraw)) {
			Intent drawing = new Intent(Menu.this, FreeDraw.class);
			startActivity(drawing);
		}
	}
	
	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	public void onBackPressed() {
		System.exit(0);
		finish();
	}
}