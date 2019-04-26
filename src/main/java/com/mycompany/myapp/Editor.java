package com.mycompany.myapp;
import junit.runner.*;
import java.io.*;

public class Editor
{
	private static String Chui_zhi_tong_bu_Mode;
	private static int fps=60;//默认60fps
	private boolean enable_Collision_Debug;
	private static String GameVersion;
	private String gameName;
	private String PhysicsEngine;
	private static String gameEngine;
	private static String projectName;
	//设置游戏帧率
	public void setFps(int fps)
	{
		Editor.fps=fps;
	}
	//设置gpu同步模式
	public void set_tong_bu_Mode(String mode)
	{
		Editor.Chui_zhi_tong_bu_Mode=mode;
		if(mode.equals("垂直同步"))
		{
			Editor.Chui_zhi_tong_bu_Mode="垂直同步";
		}
		
	}
	/**导出游戏源代码**/
	public void outPut()
	{
	//	File f=new File();
	
	}
	/**设置编辑器风格**/
	public void setEditorStyle()
	{
		
	}
	/**安装插件**/
	public void install_Cha_Jian()
	{
		
	}
	/**卸载插件**/
	public void uninstall_Cha_Jian()
	{
		
	}
	/**设置项目名称**/
	public void setProjectName(String name)
	{
		Editor.projectName=name;
	}
	/**设置游戏版本**/
	public void setGameVersion(String Version)
	{
		Editor.GameVersion=Version;
	}
	/**设置自定义物理引擎**/
	public void setPhysicsEngine(String engine)
	{
		if(engine.equals("bullet"))
		{}
	}
	/**设置自定义游戏引擎**/
	public void setGameEngine(String engine)
	{
		if(engine.equals("cocos2dx"))
		{
			Editor.gameEngine="cocos2d";
		}
		if(engine.equals("libgdx"))
		{
			Editor.gameEngine="libgdx";
		}
		/*if(engine.equals("s"s))
		{
				
		}*/
	}
}
