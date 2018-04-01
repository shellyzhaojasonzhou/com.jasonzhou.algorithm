package com.jasonzhou.algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicates {

	public static void main(String[] args) {
		//组装传入指标数据
		Map<String,List<String>> indexRelationMap = new LinkedHashMap<String,List<String>>();
		indexRelationMap.put("1001", new ArrayList<String>(Arrays.asList("30001","30002","30003")));
		indexRelationMap.put("1002", new ArrayList<String>(Arrays.asList("30003","30004","30009","30005")));
		indexRelationMap.put("1003", new ArrayList<String>(Arrays.asList("30005","30006","30007")));
		
		//临时集合
		List<String> removeTempList = new ArrayList<String>();
		for(Entry<String,List<String>>  list:indexRelationMap.entrySet())
		{
			//最终需要的集合
			List<String> removeEndList = new ArrayList<String>();
			for(String str:list.getValue())
			{
				if(!removeTempList.contains(str)) 
				{
					removeEndList.add(str);
				}
				removeTempList.add(str);
			}
			System.out.println(list.getKey()+":"+removeEndList);
		}
		
	}
}
