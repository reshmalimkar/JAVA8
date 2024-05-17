package com.info;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*String str="Animal:Dog|Animal:Tiger|Fruit:Apple|Fruit:Orange|Animal:Dog|Animal:Tiger|Fruit:Apple|Fruit:Grapes";
output: 
{
	“Animal” : [“Dog”, “Tiger”],
	“Fruit” : [“Apple”, “Grapes”, “Orange”]
}*/
public class Imp {
	public static void main(String[] args) {
		String str="Animal:Dog|Animal:Tiger|Fruit:Apple|Fruit:Orange|Animal:Dog|Animal:Tiger|Fruit:Apple|Fruit:Grapes";
		String[] split = str.split("\\|");
		List<String> animalList = new ArrayList<String>();
		List<String> fruitList = new ArrayList<String>();
		Map<String,List<String>>map=new LinkedHashMap<>();
		for(String s:split) {
//			System.out.println(s);
			String[] split2 = s.split(":");
//			System.out.println(split2);
			if(split2[0].equals("Animal")) {
				animalList.add(split2[1]);
			}
			else if(split2[0].equals("Fruit")){
				fruitList.add(split2[1]);
			}
			map.put("Animal", animalList);
			map.put("Fruit", fruitList);
			
		}
		System.out.println(map);
		
	}

}
