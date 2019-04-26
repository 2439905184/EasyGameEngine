package com.mycompany.myapp;
import android.widget.*;
//调试器类
public class Debuger
{
	Thread debuger_Thread;
	/**线程开始时执行**/
public void start()
{
	debuger_Thread=new Thread();
	debuger_Thread.run();
	debuger_Thread.setName("Debuger");
	
}
public void end()
{
	//debuger_Thread.destroy();
	Toast.makeText(RunActivity.context,"删除debug后台线程",Toast.LENGTH_SHORT).show();
}
}
