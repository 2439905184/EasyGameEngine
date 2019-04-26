package com.mycompany.myapp;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.content.*;

public class RunActivity extends Activity
{
	Run run;
	//调试器类
	Debuger debuger;
	public static Context context;
	@Override
	protected void onCreate ( Bundle savedInstanceState ) {
		super.onCreate ( savedInstanceState );
		context=getApplicationContext();
		run=new Run(RunActivity.this);
		Handler Handle_debuge=new Handler();
		Message msg=new Message();
		msg.obtain();
		Handle_debuge.sendMessage(msg);
		Runnable a;
		a.run();
		Thread y;
		setContentView(run);
	}
	@Override
	protected void onStart ( ) {
		super.onStart ( );
		//Toast.makeText(RunActivity.this,"启动surfaceView!",Toast.LENGTH_SHORT).show();
		debuger=new Debuger();
		debuger.start();
		Toast.makeText(RunActivity.this,"debug后台线程开启",Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onPause ( ) {
		super.onPause ( );
		
	}

	@Override
	protected void onDestroy ( ) {
		// TODO: Implement this method
		super.onDestroy ( );
		Toast.makeText(RunActivity.this,"删除调试窗口",Toast.LENGTH_LONG).show();
		//停止调试器
		stopDebuger();
	}
	public void stopDebuger()
	{
		debuger.end();
	}
	
}
