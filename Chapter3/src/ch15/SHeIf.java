package ch15;

import java.util.ArrayList;

public class SHeIf {
	
	protected ArrayList<String> sheIf;
	
	public SHeIf() {
		sheIf=new ArrayList<>();   //������� �ʱ�ȭ
		
	}
	
	public ArrayList<String> getSheIf(){
		return sheIf;
	}
	
	
	public int getCount() {
		return sheIf.size();
	}
	
	
}
