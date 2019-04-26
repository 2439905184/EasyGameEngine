package com.mycompany.myapp;

import android.app.*;
import android.content.*;
import android.graphics.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.*;
public class MainActivity extends Activity{
	//Vibrator mVibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
	BitmapFactory factory;
	Intent run;
	//sprite
	Intent filePicker;
	String filepath;
	Bitmap drawSprite;
	ImageView sprite;
	Class<?> o;
	WindowManager m;
	@Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		sprite=(ImageView)findViewById(R.id.sprite);
	}
	public void selectBackground(View v){
		View selScript=findViewById(R.id.script);
		selScript.setBackgroundColor(Color.BLUE);
	}
	//启动surface view进行渲染
	public void run(View v)
	{
		run=new Intent(MainActivity.this,RunActivity.class);
		startActivity(run);
	}
	//打开logcat的按钮
	public void openLogCat(View v)
	{
		AlertDialog.Builder logcat_outPut=new AlertDialog.Builder(MainActivity.this);
	 	//View logcat =View.inflate(null,R.layout.logcat,null);
		//logcat_outPut.setView(logcat);
		logcat_outPut.setTitle("控制台输出");
		logcat_outPut.setMessage("输出信息");
		logcat_outPut.show();
	}
	//数字常量
	public void makeToast(String text,int duration)
	{
		Toast.makeText(MainActivity.this,text,duration).show();
	}
	//完全封装
	public void makeToast(Context ctx,String text,int duration)
	{
		Toast.makeText(ctx,text,duration).show();
	}
	//辅助Toast方法
	public  void makeToast(String text,String duration){
		if(duration.equals("long"))
		{
			Toast.makeText(MainActivity.this,text,Toast.LENGTH_LONG).show();
		}
		if(duration.equals("short"))
		{
			Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
		}
	}//缩放方法
	public void scale(View v){
		ImageView scaleTool =(ImageView) findViewById(R.id.scale);
		scaleTool.setBackgroundColor(Color.BLUE);
		boolean scale=true;
	}//旋转方法
	public void rotation(View v){
		ImageButton rotationTool= (ImageButton)findViewById(R.id.rotation);
		rotationTool.setBackgroundColor(Color.BLUE);
		boolean rotation=true;
	}
//移动方法
	public void move(View v){
		ImageButton moveTool=(ImageButton)findViewById(R.id.move);
	//	moveTool.setBackgroundColor(Color.BLUE);
		v.setBackgroundColor(Color.BLUE);
	}
	@Override
	protected void onStart(){
		super.onStart();
	//final View layout=findViewById(R.id.relative);

	final View.DragShadowBuilder shadow =new DragShadowBuilder(sprite);
	sprite.setOnLongClickListener(new OnLongClickListener()
	{
	public boolean onLongClick(View v){
		//ClipData dragData =new ClipData("f);
		v.startDrag(null,shadow,null,0);
		//shadow.onDrawShadow();
		return true;
	}
	});
sprite.setOnDragListener(new OnDragListener(){
	public boolean onDrag(View v,DragEvent e){
		switch(e.getAction()){
			case e.ACTION_DRAG_STARTED:
				makeToast("开始拖拽","long");
				float x=e.getX();		
				break;
			case e.ACTION_DRAG_ENDED:
				float Endx=e.getX();
				float Endy=e.getY();
				sprite.setBackgroundColor(Color.BLACK);
				makeToast("k"+v.getLayoutParams(),6000);
				//makeToast("本地状态"+e.getClipData().toString(),2000);
				makeToast("结果","long"+ e.getResult());
				makeToast("停止拖拽","long");
				//Toast.makeText(MainActivity.this,"this"+MainActivity.this,2000).show();
				break;
			default:
				break;
		}
		return true;
	}
	});
	}
}
