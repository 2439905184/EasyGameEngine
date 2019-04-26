package com.mycompany.myapp;

public class os
{
	public Enum e;
	public static String targetOs="Android";
	/**获得系统**/
	public static String getos()
	{
		return os.targetOs;
	}
	/**是否是安卓系统**/
	public static boolean isAndroid()
	{
		if(os.targetOs.equals("Android"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/**是否ios**/
	public static boolean isIos()
	{
		if(os.targetOs.equals("ios"))
		{
			return true;
		}
		else return false;
	}
	/**是否Web**/
	public static  boolean isWeb()
	{
		if(os.targetOs.equals("Web"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
