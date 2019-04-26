package com.mycompany.myapp;

public class Button extends MyNode
{
	private static String name;
	private static String Image;
	public void onclick()
	{
		
	}
	//public Button(){}
	/**设置按钮文字**/
	public void setButtonText(String name)
	{
		Button.name=name;
	}
	/**设置按钮图片**/
	public void setImage(String path)
	{
		Button.Image=path;
	}
}
