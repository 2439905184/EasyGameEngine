package com.mycompany.myapp;
import android.annotation.*;
import android.graphics.*;
import android.transition.*;
//节点类 无位置 底层抽象类
public class MyNode
{
	//public  movePath node;
	public static MyNode src;
	public static MyNode index;
	public static MyNode posation;
	public static MyNode node;
	public String name;
	public String path;
	public static float scale;
	public static float width;
	public static float height;
	public static MyNode parent;
	public static boolean hide;
	//中心点
	public static float archerX;
	public static float archerY;
	public static float Rotation_deg;
	public static boolean enableGravity;
	/**初始化事件**/
	public static void onCreate(String callback)
	{
		
	}
	/**更新循环**/
	public static void onUpdate()
	{
	
	}
	public MyNode getNodeByName(String name)
	{
		return MyNode.node;
	}
	/**设置中心点位置**/
	public static void setArcherPosation(float X,float Y)
	{
		MyNode.archerX=X;
		MyNode.archerY=Y;
	}
	/**启用重力**/
	public static void enableGravity(boolean enable)
	{
		if(enable==true)
		{
			MyNode.enableGravity=true;
		}
		if(enable==false)
		{
			MyNode.enableGravity=false;
		}
	}
	/**设置旋转角度**/
	//世界坐标系
	public static void setRotation(float deg)
	{
		MyNode.Rotation_deg=deg;
	}
	//设置本地旋转
	//本地坐标系
	public static void set_Local_Rotation(float deg)
	{
		MyNode.Rotation_deg=deg;
	}
	/**设置高度**/
	public static void setHeight(float value)
	{
		MyNode.height=value;
	}
	/**设置宽度**/
	public static void setWidth(float value)
	{
		MyNode.width=value;
	}
	/**设置位置int类型**/
	public void setPostation(int x,int y)
	{
	/*	MyNode.x=this.x;
		MyNode.y=this.y;*/
	}
	/**改变Node的图层位置**/
	public void change_Layer(int index)
	{
		MyNode.index=this.index;
	}
	/**设置父节点**/
	public static void setParent(String parent)
	{
		//MyNode.parent=parent;
	}
	/**获取父节点**/
	public static MyNode getParentNode(String name)
	{
		return MyNode.parent;
	}
	/**获得指定索引的子节点**/
	/*public static MyNode getChildNode(int index)
	{
		//return Node a;
		//return ;
	}*/
	/**移动Node节点的位置**/
	public void moveTo(int x,int y)
	{
		/*MyNode.x=this.x;
		MyNode.y=this.y;*/
	}
	/**销毁Node节点**/
	public static  void deleate(String name)
	{
		//remove()
	}
	/**设置是否可见Node节点**/
	public void setVisiable(String name,boolean visiable)
	{
		if(visiable==true)
		{
			MyNode.hide=true;
		}
		else if(visiable==false)
		{
			MyNode.hide=false;	
		}
		if(MyNode.hide==true)
		{
			hide();
		}
		else if(MyNode.hide==false)
		{
			display();
		}
		
	}
	/**隐藏节点**/
	public void hide()
	{
		
	}
	/**显示节点**/
	public void display()
	{
		
	}
}
