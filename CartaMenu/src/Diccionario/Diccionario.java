package Diccionario;

import java.util.*;

public class Diccionario {
	private String palab;
	private String traduc;
	private Map<String, String> map;
	
	public Diccionario(){
		this.palab="";
		this.traduc="";
		map=new TreeMap();
	}
	
	public Diccionario(String p,String t){
		this.palab=p;
		this.traduc=t;
		map=new TreeMap();
		map.put(palab, traduc);
	}
	
	public void add(String p,String t){
		this.palab=p;
		this.traduc=t;
		map.put(palab, traduc);
	}
	
	public Map getDiccionario(){
		return map;
	}
		
}