package com.mycompany.myapp;

public class ButtonNode extends MyNode
{
	public String name;
	private static String Image;
	public void onclick()
	{
	}
	//public Button(){}
	/**设置按钮文字**/
	public void setButtonText(String Inname)
	{
		name=Inname;
	}
	/**设置按钮图片**/
	public void setImage(String path)
	{
		ButtonNode.Image=path;
	}
}
