package com.tns.collections;

import java.util.Comparator;

public class EsalCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee e1,Employee e2) {
		
		if (e1.sal==e2	.sal) {
			return 0;
		}else if(e1.sal>e2.sal) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
}
