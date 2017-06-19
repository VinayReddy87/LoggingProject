package com.hp.log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationException 
{
	public static void main(String a[])
	{
		List<String> arrString=new CopyOnWriteArrayList<String>();
		arrString.add("vinay");
		arrString.add("kumar");
		
		Iterator<String> itr=arrString.iterator();
		
		while(itr.hasNext())
		{
			arrString.add("reddy");
			System.out.println((String)itr.next());
			
		}
		
		/*for(String s:arrString)
		{
			arrString.add("reddy");
			System.out.println(s);
		}*/
			
	}

}
