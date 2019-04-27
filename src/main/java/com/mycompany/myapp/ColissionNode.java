package com.mycompany.myapp;
import android.graphics.*;
//碰撞节点
public class ColissionNode extends MyNode
{
	public String name;
	public int x;
	public int y;
	public  int layer;
	public String[] Shape={"Rect","Circle","pixel"};
	public int[] rect_points={1,1,1,1};
	public int[] circle_points={1,3,3};//圆心 半径 π
	public int[] pixel_points={1,1};
	public ColissionNode(String NodeName)
	{
		name=NodeName;
	}
	//在编辑器中调用
	//设置碰撞箱形状
	public void setCollsionType(String type)
	{
		//方形
		if(type.equals(Shape[1]))
		{
			Canvas canvas=new Canvas();
			//实现在编辑器中画方形
			//Run d=new Run();
			//d.drawRect(canvas,4,4,MyColor.Black);
			//rect_points;
		}
		//在编辑器画圆形
		if(type.equals(Shape[2]))
		{
			Canvas c=new Canvas();
			//Run d=new Run();
			//d.drawCircle(c,MyColor.Black,4f,4f,4f);
			//Shape;
		}
		//在编辑器画像素
		if(type.equals(Shape[3]))
		{
			//Run d=new Run();
			//pixel
		}
	}
	
	
}
