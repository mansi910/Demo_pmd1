package wdf.sap.corp.DemoProject;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
	}


	public String Method1() {
		try {
			System.out.println( "My Exception" );
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			return "A. O. K."; // Very bad.
		}
	}

	public void Method2() {
		String a = null, baz = "";
		if (a.equals(baz) && a != null) {}
	}

	public void Method3() throws Exception{
		try{
			String a="",b ="";
			if(a == b){}
		}catch(Exception f){
			System.out.println(f.getLocalizedMessage());
		}
	}


	public void Method4() {
		Collection c=new ArrayList();
		Integer obj=new Integer(1);
		c.add(obj);

		// this would trigger the rule (and throw a ClassCastException if executed)
		Integer[] a=(Integer [])c.toArray();

		// this wouldn't trigger the rule
		Integer[] b=(Integer [])c.toArray(new Integer[c.size()]);
	}


}
