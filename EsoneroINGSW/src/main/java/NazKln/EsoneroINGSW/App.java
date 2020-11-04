package NazKln.EsoneroINGSW;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList lista=new ArrayList<Integer>();
    	ArrayList vedi= new ArrayList<Integer>();
    	//lista.add(5);
    	//lista.add(7);
    	//lista.add(2);
        MyListUtil ml= new MyListUtil();
        
        Scanner sc= new Scanner(System.in);
        int num=0;
        int n=0;
        System.out.println("Inserire il numero di elementi");
        num=sc.nextInt();
        System.out.println("Inserire i numeri");
        for(int i=0; i<num; i++)
        {
        	n=sc.nextInt();
        	lista.add(n);
        }
        System.out.println("Premi 0 per ordinare decrescente 1 crescente");
        n=sc.nextInt(n);
        switch(n)
        {
        case 0:
        	vedi= new ArrayList<Integer>(ml.OrdinaDecrescente(lista));
        	break;
        case 1:
        	vedi = new ArrayList<Integer>(ml.OrdinaCrescente(lista));
        	break;
        }
        for(int i=0; i<vedi.size(); i++)
        {
        	System.out.println(vedi.get(i));
        }
    }
}
