package com.mycompany.myapp;
import android.media.*;

public class Audio
{
	private static String LoopMode="oneShoot";
	private static String time;
	public void playAudio()
	{
		
	}
	//获得时间
	public String getCurrentTime()
	{
		return Audio.time;
	}
	public void setLoopMode(String mode)
	{
		Audio.LoopMode=mode;
		if(mode.equals("loop"))
		{
			//MediaPlayer
			playAudio();
		}
		if(mode.equals("oneShoot"))
		{
			
		}
		
	}
}
