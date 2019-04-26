package com.mycompany.myapp;

public class movePath
{
	private int startX;
	private int startY;
	private int EndX;
	private int EndY;
	private int moveSpeed=1;
	private static String loopMode="oneShoot";
	/**改变循环模式**/
	public void ChangeLoopMode(String Mode)
	{
		movePath.loopMode=Mode;
		if(Mode.equals("oneShoot"))
		{
		}
		if(Mode.equals("loop"))
		{
			
		}
		if(Mode.equals("pingpong"))
		{
			
		}
	}
}
