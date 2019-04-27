package com.mycompany.myapp;

import android.app.*;
import android.content.*;
import android.graphics.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.*;
import android.content.res.*;
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
	//切换到代码编辑器
	public void toCodeEditor(View v)
	{
		Intent i=new Intent(MainActivity.this,Controller.class);
		startActivity(i);
	}
	//添加节点
	public void addNode(View v)
	{
		//findViewById(R.id.)
		AlertDialog.Builder node_list = new AlertDialog.Builder(MainActivity.this);
		node_list.setTitle("添加节点");
		//添加节点的实现
		OnClickListener add_node_toEditor=new OnClickListener()
		{
			@Override
			public void onClick ( View p1 ) {
			Toast.makeText(MainActivity.this,"view按钮"+p1.toString(),Toast.LENGTH_LONG).show();
			Context ctx=p1.getContext();
			Resources res=ctx.getResources();
			//CharSequence s=res.getText ( 0 );
				Toast.makeText ( MainActivity.this, "View内容ctx" + ctx.toString ( ), Toast.LENGTH_LONG ).show ( );
				Toast.makeText ( MainActivity.this, "res资源" + res, Toast.LENGTH_SHORT ).show ( );
		//		Toast.makeText(MainActivity.this,"文字"+s,Toast.LENGTH_SHORT).show();
				}

			
		};
		ScrollView node_scroller=new ScrollView(MainActivity.this);
		LinearLayout node_list_room= new LinearLayout(MainActivity.this);
		node_scroller.addView(node_list_room);
		
		//node_list_room.set();
		//下面全是编辑器中的节点
		//初始化添加节点的编辑器显示
		ButtonNode btn_Node=new ButtonNode();
		btn_Node.setButtonText("button");
		//摄像机节点
		ButtonNode btn_node_camera=new ButtonNode();
		btn_node_camera.setButtonText("摄像机");
		//摄像机节点显示
		Button btn_display_camera=new Button(MainActivity.this);
		btn_display_camera.setText("摄像机");
		btn_display_camera.setOnClickListener(add_node_toEditor);
		node_list_room.addView(btn_display_camera);
		//Sprite节点显示
		Button btn=	new Button(MainActivity.this);
		btn.setText("Sprite");
		btn.setOnClickListener(add_node_toEditor);
		node_list_room.addView(btn);
		//碰撞节点显示
		Button btn_display_collision =new Button(MainActivity.this);
		btn_display_collision.setText("碰撞节点");
		btn_display_collision.setOnClickListener(add_node_toEditor);
		node_list_room.addView(btn_display_collision);
		//音乐节点显示
		Button btn_display_music =new Button(MainActivity.this);
		btn_display_music.setText("音乐");
		btn_display_music.setOnClickListener(add_node_toEditor);
		node_list_room.addView(btn_display_music);
		//路径节点显示
		Button btn_display_path=new Button(MainActivity.this);
		btn.setText("路径");
		node_list_room.addView(btn_display_path);
		//设置背景
		node_list_room.setBackgroundColor(Color.BLUE);
		node_list.setView(node_scroller);
		node_list.show();
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
