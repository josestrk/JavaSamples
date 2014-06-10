package eliza;

import java.util.*;

public class Eliza {
	private HashMap frasesRegistrada;
	
	public Eliza(){
		frasesRegistrada=new HashMap();
	}
	public void add(String a,Lista b) throws ExistePalabra{
		if(frasesRegistrada.containsKey(a))
			throw new ExistePalabra();
		else
			frasesRegistrada.put(a,b);
	}
	public String contesta(Lista frase) throws NoExiste{
		String s="";
		String sc="";
		boolean sw=false;
		while(!frase.isEmpty()){
			sc=(String) frase.sacar();
			if(frasesRegistrada.containsKey(sc)){
				sw=true;
				s+=" "+frasesRegistrada.get(sc);
			}
		}
		if(sw)
			return s;
		else
			throw new NoExiste();
	}
}
