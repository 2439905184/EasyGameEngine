package com.mycompany.myapp;
import android.widget.*;
public class MyProgressBar extends MyNode
{
	public static float progress;
	//默认最大值100
	public static int Max_progress=100;
	public MyProgressBar(String a){}
	
	/**获取进度**/
	public static float getProgress()
	{
		return MyProgressBar.progress;
	}
	/**设置进度条图片**/
	public static void setProgressImage(String path)
	{
		
	}
	/**设置最大进度**/
	public static void setMaxProgress(int value)
	{
		/*if(os.isAndroid())
		{
		 	ProgressBar bar =new ProgressBar();
			bar.setMax(value);
		}*/
	}
	/**设置进度**/
	public void setProgress(int progress)
	{
		if(os.isAndroid())
		{
			/*ProgressBar bar=new ProgressBar(Context ctx);
			bar.setProgress(progress);*/
		}
		if(os.isIos())
		{
			
		}
		if(os.isWeb())
		{
			
		}
	}
	
}

