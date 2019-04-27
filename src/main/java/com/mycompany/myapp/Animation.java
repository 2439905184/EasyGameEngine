package com.mycompany.myapp;

public class Animation
{
	private String Tracks;
	private static String State;
	private static String LoopMode;
	public String src;
	//设置这个动画节点的编辑器中的动画属性
	public void setAnimation(String real_src)
	{
		src=real_src;
	}
	/**播放动画**/
	public void playAnimation(String name)
	{
	
	}
	/**停止动画**/
	public void stopAnimation(String name)
	{
		Animation.State="stop";
	}
	/**暂停动画**/
	public void pauseAnimation()
	{
		Animation.State="pause";
	}
	/**动画停止回调**/
	public void OnStopAnimation()
	{
		
	}
	/**动画帧回调**/
	public void OnFrameAnimation()
	{
	
	}
	/**获得动画状态**/
	public String getAnimationState()
	{
		return Animation.State;
	}
	/**设置动画循环模式**/
	public void setAnimationLoopMode(String mode)
	{
		//重复播放
		if(mode.equals("loop"))
		{
				Animation.LoopMode="loop";
		}
		//只播放一次
		if(mode.equals("oneShoot"))
		{
			Animation.LoopMode="oneShoot";
		}
		//播放到结束时回过来播放
		if(mode.equals("pingPoing"))
		{
			Animation.LoopMode="pingPoing";
		}
	}
	/**设置是否混合处理动画和物理**/
	/*public void setBlendMode(boolean blend)
	{
		if
	}*/
}
