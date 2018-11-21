package mainpackage;

import java.util.ArrayList;

public class OggettoProva {
	
	
	private ArrayList<String> array = new ArrayList<>() ;  
	
	public OggettoProva() {
		init() ; 
	}
	private void init () {
		for (int i = 0 ; i < 10 ; i++ ) 
			array.add("String" + i ) ;
	}
	
	public String getElement (int i )
	{ 
		return array.get(i) ;
	}

	public static void main(String[] args) {
		OggettoProva main = new OggettoProva() ; 
		System.out.println(main.getElement(1));
	}
}
