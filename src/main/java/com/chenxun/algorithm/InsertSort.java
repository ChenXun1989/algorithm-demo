/**
 * Project Name:algorithm-demo
 * File Name:InsertSort.java
 * Package Name:com.chenxun.algorithm
 * Date:2017年2月6日下午2:28:26
 * Copyright (c) 2017, Shanghai Law Cloud Technology Co., Ltd. All Rights Reserved.
 *
*/

package com.chenxun.algorithm;
/**
 * ClassName:InsertSort <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年2月6日 下午2:28:26 <br/>
 * @author   陈勋
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class InsertSort implements Sort{

	@Override
	public void sort(int[] a) {
		if(a==null||a.length<2){
			return ;
		}
		
		for(int i=1;i<a.length;i++){  // i
			// 时间成本取决于间隔
			for(int p=i;p>0&&a[p]<a[p-1];p--){			
					int tmp=a[p];
					a[p]=a[p-1];
					a[p-1]=tmp;
					
			}
		}
		
		
		
	}


	
	

}

