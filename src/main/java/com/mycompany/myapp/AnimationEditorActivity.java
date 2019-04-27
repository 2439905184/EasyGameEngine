package com.mycompany.myapp;
import android.app.*;
import android.graphics.*;
import android.os.*;
import android.view.*;


public class AnimationEditorActivity extends Activity
{
	@Override
	protected void onCreate ( Bundle savedInstanceState ) {
		// TODO: Implement this method
		super.onCreate ( savedInstanceState );
		setContentView(R.layout.AnimationEditor);
	}

	@Override
	protected void onStart ( ) {
		// TODO: Implement this method
		super.onStart ( );
		//findViewById(R.id.);
	}
	//播放动画
	public void Play(View v)
	{
		v.setBackgroundColor(Color.BLUE);
	}
	
}
