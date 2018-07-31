import java.util.Scanner;

/**
 * 
 * @ClassName:  DichotomySearch   
 * @Description:对于一维数组的查找我们采用一个for循环遍历一次数组就可以实现，但有时候当数组太大，用二分法来实现 
				可以节省更多的内存，当然二分法也只能实现【有序】序列的查找，这里我们就以一个递增的数组来说
				输入一个人数组，关于二分法的实现主要的就是设定一个中间值mid = （low + high）/2 
				假设我们要查找的数为 findvalue 
 * @author: shsun 
 * @date:   2018年7月30日 下午2:39:31   
 *     
 * @Copyright: 2018 www.shsun.com Inc. All rights reserved. 
 * 注意：本内容仅限于shsun公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class DichotomySearch {
	static int num;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("按要求输入：");
        int high = in.nextInt()+1;//输入数组的长度
        int low = in.nextInt();//输入开始查询的位置
        int findvalue = in.nextInt();//输入要查找的值
        int [] array = new int [high];//输入要查询的数组
        for(int i = 0;i<high;i++){
            array[i] = in.nextInt();
        }
        System.out.println("查询的数的位置在"+SearchResult(array, low, high-1, findvalue));
        System.out.println("查询轮数"+num);
        num = 0;
        System.out.println("查询的数的位置在"+SrearchResult1(array, findvalue));
        System.out.println("查询轮数"+num);
	}
	
	
	/*
    递归实现二分查找
    需要知道开始和结束的位置
     */
  public static int SearchResult(int [] array,int low ,int high,int findValue){

      if(array == null)return -1;
      num++;
     if(low<=high){
          int mid = (low + high)/2;
          if(array[mid] == findValue){
              return mid;
          }else if(array[mid] < findValue){
              return SearchResult( array, mid+1, high, findValue);
          }else{
              return SearchResult(array, low, mid-1, findValue);
          }
      }else{
          return -1;
      }
  }
  
  
  /**
   * 循环来实现二分查找
   */
  public static int SrearchResult1(int [] array,int findvalue){
      if(array == null) {
          return -1;
      }
      int high = array.length-1;
      int low = 0;
      while(low<=high){
          num++;
          int mid = (low+high)/2;
          if(array[mid] == findvalue){
              return mid;
          }else if(array[mid]<findvalue){
              low = mid+1;

          }else{
              high = mid-1;
          }
      }
      return -1;
  }


}
