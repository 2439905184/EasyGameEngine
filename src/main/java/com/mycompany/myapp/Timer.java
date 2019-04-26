package com.mycompany.myapp;
import android.util.*;

public class Timer
{
	private static String type;
	private static String left;
	private static int time;
	//type有oneShoot,倒计时,每秒执行一次
	public Timer(String type)
	{
		Timer.type=this.type;
		if(type.equals("oneShoot"))
		{
				
		}
	}
	/**开始计时**/
	public void  start()
	{
		Timer.time-=1;
		//倒计时结束时执行
		if(Timer.left.equals("0"))
		{
			callback();
		}
	}
	/**获得实时时间**/
	public int getTime()
	{
		//time =time.getTime()
		return time;
	}
	/**计时完成的回调**/
	public void callback()
	{
		
	}
}
