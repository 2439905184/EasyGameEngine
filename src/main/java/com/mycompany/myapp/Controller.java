package com.mycompany.myapp;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;
import android.graphics.*;
import android.widget.TableLayout.*;
//蓝图编辑器
public class Controller extends Activity
{
RelativeLayout room;
	@Override
	protected void onCreate ( Bundle savedInstanceState ) {
		// TODO: Implement this method
		super.onCreate ( savedInstanceState );
		setContentView(R.layout.controller);
	}

	@Override
	protected void onStart ( ) {
		// TODO: Implement this method
		View out=findViewById(R.id.out);
		OnLongClickListener oout=new OnLongClickListener()
		{
			@Override
			public boolean onLongClick ( View p1)
			{
				Toast.makeText(Controller.this,"开始拖拽出连接线",Toast.LENGTH_LONG).show();
				return false;
			}
		};
		out.setOnLongClickListener(oout);
		//获取底部容器
		room=(RelativeLayout)findViewById(R.id.controllerRoom);
		
		super.onStart ( );
	}
	
	
	//添加自定义方法
	public void addMethod(View v)
	{
		//同步脚本
		//write("func"+" "+name+":");
		Toast.makeText(Controller.this,"测试方法成功",Toast.LENGTH_SHORT).show();
		AlertDialog.Builder a=new AlertDialog.Builder(Controller.this);
		ScrollView scrol=new ScrollView(Controller.this);
		LinearLayout line=new LinearLayout(Controller.this);
		scrol.addView(line);
		line.setBackgroundColor(Color.RED);
		//开始的模块
		Button btn_func=new Button(Controller.this);
		btn_func.setText("start");
		OnClickListener btn_func_click=new OnClickListener()
		{
			@Override
			public void onClick ( View p1 )
			{
				Toast.makeText(Controller.this,"添加模块",Toast.LENGTH_LONG).show();
				//退出alert
				//新建一个模块
				RelativeLayout module= new RelativeLayout(Controller.this);
				//module.setLayoutMode(LayoutMode)
				LayoutParams p=new LayoutParams(400,400);
				module.setLayoutParams(p);
				TextView module_type= new TextView(Controller.this);
				room.addView(module);
				module.addView(module_type);
				module.setX(20f);
				
				module.setBackgroundColor(Color.RED);
				
			}
		};
		btn_func.setOnClickListener(btn_func_click);
		line.addView(btn_func);
		a.setView(scrol);
		a.setTitle("弄");
		a.show();
		/*if(v.)
		{}*/
	}
	//改变编程模式
	public void chaneCodeMode(View v)
	{
		if(v.isActivated())
		{
			setContentView(R.layout.CodeEditor);
		}
	}
}
