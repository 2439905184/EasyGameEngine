package com.mycompany.myapp;
import android.net.http.*;

public class Sprite extends MyNode
{
	public static int x;
	public static int y;
	private static String Path;
	/*public void setImage ( String path )
	{
	}*/

	@Override
	public void setPostation ( int x, int y )
	{
		super.setPostation ( x, y );
	}
/**设置sprite父节点**/
	@Override
	public void setVisiable ( String name, boolean visiable ) 
	{
		super.setVisiable ( name, visiable );
	}
/**改变渲染图层位置**/
	@Override
	public void change_Layer ( int index )
	{
		// TODO: Implement this method
		super.change_Layer ( index );
	}
	
	
}
