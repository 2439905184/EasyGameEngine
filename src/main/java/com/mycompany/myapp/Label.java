package com.mycompany.myapp;

public class Label extends MyNode
{
	public static String font;
	public static float scale;
	public static String color;
	public static String text;
	/**设置Label文字**/
	public static void setText(String text)
	{
		Label.text=text;
	}
}
