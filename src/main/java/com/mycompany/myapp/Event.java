package com.mycompany.myapp;
//自定义事件类
public class Event
{
	public static String type ;
	public void push(String type)
	{
		Event.type=type;
		if(type.equals("global"))
		{
		}
		if(type.equals("local"))
		{ 
		}
	}
}
