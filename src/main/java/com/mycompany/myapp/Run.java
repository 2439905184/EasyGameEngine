package com.mycompany.myapp;
import android.app.*;
import android.view.View;
import android.os.*;
import android.graphics.Canvas;

import android.opengl.*;
import android.graphics.*;
import android.*;
import android.view.*;
import android.content.*;
import android.view.SurfaceHolder.*;
import android.widget.*;
//实现的surface渲染类
public class Run extends SurfaceView //implements SurfaceHolder
{

	private SurfaceHolder holder;
	@Override
	protected void onAttachedToWindow ( )
	{
		//Toast.makeText(getContext(),"添加到"+"1",Toast.LENGTH_SHORT).show();
		super.onAttachedToWindow ( );
		setBackgroundColor(Color.BLUE);
		holder =getHolder();
		//Toast.makeText(getContext(),holder.toString(),Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onScreenStateChanged ( int screenState ) {
		// TODO: Implement this method
		super.onScreenStateChanged ( screenState );
	}

	@Override
	public boolean onTouchEvent ( MotionEvent event ) {
		// TODO: Implement this method
		switch(event.getAction())
		{
			case event.ACTION_DOWN:
				Toast.makeText(getContext(),"按下了",1000).show();
				return false;
		}
		return super.onTouchEvent ( event );
	} 
	
	
	public Run(Context ctx)
	{
		super(ctx);
	}
	@Override
	protected void onDraw ( Canvas canvas ) 
	{
		super.onDraw ( canvas );
		Paint pen= new Paint();
		pen.setStrokeWidth(100f);
		pen.setColor(Color.BLUE);
		//canvas.drawLine(200f,300f,300f,100f,pen);
		canvas.drawColor(Color.BLUE);
		Toast.makeText(getContext(),"开始绘画",2000).show();
		//先画背景，后画文字
		pen.setColor(Color.WHITE);
		pen.setStrokeWidth(200f);
		canvas.drawText("测试",0,0,pen);
		//动画实现
		int x;
		int height=0;
		for(x=0;x<4;x++)
		{
			height+=100;
			canvas.drawText("测试",0,height,pen);
			
		}
	}

	@Override
	protected void onMeasure ( int widthMeasureSpec, int heightMeasureSpec )
	{
		/*widthMeasureSpec=200;
		heightMeasureSpec=200;*/
		super.onMeasure ( widthMeasureSpec, heightMeasureSpec );
		Toast.makeText(getContext(),"测量时间",Toast.LENGTH_SHORT).show();
		}

	@Override
	protected void onCreateContextMenu ( ContextMenu menu )
	{
		super.onCreateContextMenu ( menu );
		Toast.makeText(getContext(),"我的世界",200).show();
	}
}
