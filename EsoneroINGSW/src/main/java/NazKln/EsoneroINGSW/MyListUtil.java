package NazKln.EsoneroINGSW;

import java.util.ArrayList;

public class MyListUtil 
{
	ArrayList list;
	public MyListUtil()
	{
		list=new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> OrdinaCrescente(ArrayList<Integer> lista)
	{
		list= new ArrayList<Integer>(lista);
		for(int i=0; i<list.size(); i++)
		{
			for(int j=i+1; j<list.size(); j++)
			{
				Integer x=(Integer) list.get(i);
				Integer y=(Integer) list.get(j);
				int t=0;
				if(y<x)
				{
					t=x;
					x=y;
					y=t;
					list.set(i, x);
					list.set(j, y);
				}
			}
		}
		return list;
	}
	
	public ArrayList<Integer> OrdinaDecrescente(ArrayList<Integer> lista)
	{
		list= new ArrayList<Integer>(lista);
		for(int i=0; i<list.size(); i++)
		{
			for(int j=i+1; j<list.size(); j++)
			{
				Integer x=(Integer) list.get(i);
				Integer y=(Integer) list.get(j);
				int t=0;
				if(y>x)
				{
					t=x;
					x=y;
					y=t;
					list.set(i, x);
					list.set(j, y);
				}
			}
		}
		return list;
	}
}
