import java.net.Socket;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * 
 * @ClassName:  ArrayIntersection   
 * @Description:求两个int数组的交集  
 * @author: shsun 
 * @date:   2018年7月25日 上午6:07:51   
 *     
 * @Copyright: 2018 www.shsun.com Inc. All rights reserved. 
 * 注意：本内容仅限于shsun公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class ArrayIntersection {
	public static void main(String[] args) {
		testArrayIntersectionA();
		testArrayIntersectionD();
		testSetRetainAll();
	}
	public static void testArrayIntersectionA() {
        int[] arrayA = new int[]{1, 1, 2, 3, 4, 4, 5, 1, 1};
        int[] arrayB = new int[]{11, 1, 22, 3, 43, 4, 5, 11, 1, 22};
        /**
         	HashSet实现了Set接口，它不允许集合中出现重复元素。当我们提到HashSet时，第一件事就是在将对象存储在
			HashSet之前，要确保重写hashCode（）方法和equals（）方法，这样才能比较对象的值是否相等，确保集合中没有
			储存相同的对象。如果不重写上述两个方法，那么将使用下面方法默认实现：
　			public boolean add(Object obj)方法用在Set添加元素时，如果元素值重复时返回 "false"，如果添加成功则返回"true"
         */
        Set<Integer> intersectionSet = new HashSet<Integer>();
        //如果从效率上来处理，应该遍历较短的那个数组
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    intersectionSet.add(arrayA[i]);
                }
            }
        }
        System.out.println("testArrayIntersectionA:"+intersectionSet.toString());
    }
	public static void testArrayIntersectionD() {
        int[] arrayA = new int[]{1, 1, 2, 3, 4, 4, 5, 1, 1};
        int[] arrayB = new int[]{11, 1, 22, 3, 43, 4, 5, 11, 1, 22};
        int sizeArrayA=arrayA.length;
        int sizeArrayB=arrayB.length;
        Integer[] arrayA2=new Integer[sizeArrayA];
        Integer[] arrayB2=new Integer[sizeArrayB];
        for(int i=0;i<sizeArrayA;i++){
            arrayA2[i]=new Integer(arrayA[i]);
        }
        for(int i=0;i<sizeArrayB;i++){
            arrayB2[i]=new Integer(arrayB[i]);
        }
        Set<Integer> intersectionSet = new HashSet<Integer>();
        intersectionSet.addAll(Arrays.asList(arrayA2));
        System.out.println("testArrayIntersectionD:"+intersectionSet);
        //retainAll方法将保留与指定集合中相同的对象，而删除不相同的对象，它和removeAll方法正好相反。
        intersectionSet.retainAll(Arrays.asList(arrayB2));
        System.out.println("testArrayIntersectionD:"+intersectionSet);
    }
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void testSetRetainAll() {
	    Set set1 = new HashSet();
	    set1.add(new Date());     //向列表中添加数据
	    set1.add("apple");      //向列表中添加数据
	    set1.add(new Socket());     //向列表中添加数据
	    set1.add("TV");      //向列表中添加数据
	    System.out.println("Set1的大小为："+set1);
	    Set set2=new HashSet();
	    set2.add("TV");      //向列表中添加数据
	    set2.add("55555"); 
	    System.out.println("Set2的大小为："+set2);
	    set1.retainAll(set2);
	    System.out.println("从Set1集合移除Set2集合包含的内容");
	    System.out.println("Set1的大小为："+set1);
	}
}
