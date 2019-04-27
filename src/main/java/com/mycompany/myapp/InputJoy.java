package com.mycompany.myapp;
import android.gesture.*;
import android.widget.*;
import java.util.*;
//触摸摇杆输入
public class InputJoy extends MyNode
{
	//默认背景图片的路径
	public String default_background="";
	public String BackgroudColor;

	public ArrayList<GestureStroke> strokes;
	
	public void setBackground(String image)
	{
		
	}
	public void setBackgroundColor(String color)
	{
		if(color.equals(MyColor.Black))
		{
			BackgroudColor="black";
		}
	}
	public void input()
	{
		//手势
		Gesture hand=new Gesture();
		strokes=hand.getStrokes();
	}
}
