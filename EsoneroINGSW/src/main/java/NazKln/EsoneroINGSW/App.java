package NazKln.EsoneroINGSW;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList lista=new ArrayList<Integer>();
    	lista.add(5);
    	lista.add(7);
    	lista.add(2);
        MyListUtil ml= new MyListUtil();
        
        ArrayList vedi= new ArrayList<Integer>(ml.OrdinaCrescente(lista));
        
        for(int i=0; i<vedi.size(); i++)
        {
        	System.out.println(vedi.get(i));
        }
        
        ArrayList vediRew = new ArrayList<Integer>(ml.OrdinaDecrescente(lista));
        
        for(int i=0; i<vediRew.size(); i++)
        {
        	System.out.println(vediRew.get(i));
        }
        
    }
}
