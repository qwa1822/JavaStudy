package ch15;

import java.util.ArrayList;

public class SheIf {

	
	protected ArrayList<String> sheIf;
	
	public SheIf() {
		sheIf=new ArrayList<>();
	}
	
	public ArrayList<String> getSheIf(){
		return sheIf;
	}
	
	public int getCount() {
		return sheIf.size();
	}
}
