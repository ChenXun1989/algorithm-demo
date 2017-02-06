/**
 * Project Name:algorithm-demo
 * File Name:ShellSort.java
 * Package Name:com.chenxun.algorithm
 * Date:2017年2月6日下午3:05:56
 * Copyright (c) 2017, Shanghai Law Cloud Technology Co., Ltd. All Rights Reserved.
 *
*/

package com.chenxun.algorithm;
/**
 * ClassName:ShellSort <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年2月6日 下午3:05:56 <br/>
 * @author   陈勋
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ShellSort implements Sort {

	/**
	 * 
	 * 希尔排序
	 * @see com.chenxun.algorithm.Sort#sort(int[])
	 */
	@Override
	public void sort(int[] a) {
         //  5  3  1
		for(int g=a.length/2; g>0 ; g /=2){
			for(int i=g;i<a.length;i++){
				for(int j=i; j>=g&&a[i]<a[j-g];j -= g){
					int tmp=a[j];
					a[j]=a[j-g];
					a[j-g]=tmp;
				}
			}
		}

	}

}

