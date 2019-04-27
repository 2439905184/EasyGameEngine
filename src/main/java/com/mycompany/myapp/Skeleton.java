package com.mycompany.myapp;
//处理骨骼的类
public class Skeleton
{
	public void moveSkeleton(String name,int x,int y)
	{
		SkeletonNode ske= new SkeletonNode();
		MyNode ske_node=ske.getNodeByName(name);
		ske.setPostation(x,y);
	}
	public void removeSkeleton(String name)
	{
		SkeletonNode ske=new SkeletonNode();
		}
		//获得骨骼数量
		public int getSkeletonNums(String name)
		{
			SkeletonNode ske=new SkeletonNode();
			return ske.skeleton_numbers;
		}
		//获得骨骼数据
		public String[] getSkeletonData(String name)
		{
			SkeletonNode ske=new SkeletonNode();
			return ske.ske_data;
		}
}
