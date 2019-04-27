package com.mycompany.myapp;
import android.graphics.*;
import android.gesture.*;
import java.util.*;

public class MyPath extends MyNode
{
	public int x;
	public int y;
	public int point_numbers;//路径点的数量
	public int[] point_position={4,4,4,4};
	public int startX;
	public int startY;
	public int endX;
	public int endY;
	//二维数组
	//路径第一个点的x
	/*path[1].x
	path[2].y*/
	//在编辑器中画路径
	public void drawPath()
	{
		Canvas c=new Canvas();
		//Run d=new Run();
		//d.drawPath(c);
	}
	//在编辑器移动路径
	public void movePath()
	{
		Gesture i=new Gesture();
		ArrayList k= i.getStrokes();
		k.toString();
		//把获取到的手指的位置的值赋值给路径点
		x=1;
		y=1;
	}
}
