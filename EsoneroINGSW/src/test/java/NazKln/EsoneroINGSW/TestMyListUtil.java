package NazKln.EsoneroINGSW;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyListUtil 
{
	public static MyListUtil ml;
	public static ArrayList lista;
	@BeforeClass
	public static void init()
	{
		ml= new MyListUtil();
		lista= new ArrayList<Integer>();
		lista.add(5);
		lista.add(7);
		lista.add(2);
		
	}
	
	@Test
	public void TestOrdinaCrescente()
	{
		assertEquals(ml.OrdinaCrescente(lista),Arrays.asList(2,5,7));
	}
	
	
	@Test
	public void TestOrdinaDecrescente()
	{
		assertEquals(ml.OrdinaDecrescente(lista),Arrays.asList(7,5,2));
	}
	
}
