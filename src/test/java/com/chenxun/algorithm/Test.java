/**
 * Project Name:algorithm-demo
 * File Name:Test.java
 * Package Name:com.chenxun.algorithm
 * Date:2017年2月6日下午2:27:01
 * Copyright (c) 2017, Shanghai Law Cloud Technology Co., Ltd. All Rights Reserved.
 *
*/

package com.chenxun.algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年2月6日 下午2:27:01 <br/>
 * @author   陈勋
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Test {
	
	static int[] initArr(int len){
		Random r=new Random();
		int[] arr=new int[len];
		for(int i=0;i<len;i++){
			arr[i]=r.nextInt(len);
		}
		return arr;
	}
	
	
    public static void main(String[] args) {
	     int[] arr=initArr(100);
	     System.out.println(Arrays.toString(arr));
	     //  插入排序
	     Sort sort=new InsertSort();
    	 sort.sort(arr);
    	 System.out.println(Arrays.toString(arr));
    	 // 希尔排序
    	 arr=initArr(100);  
    	 System.out.println(Arrays.toString(arr));
    	 sort=new ShellSort();
    	 sort.sort(arr);
    	 System.out.println(Arrays.toString(arr));
    	 
	}

}

