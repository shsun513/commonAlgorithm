package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Snippet {
	public static void main(String[] args) throws NoSuchFieldException {
	/*
	 * 使用反射来创建构造方法私有化的对象
	 * */
	      //1:获取类的无参构造方法
	      Test test = new Test("张三");
	
	      Field[] fields = Test.class.getDeclaredFields();
	      for (int i = 0; i < fields.length; i++) {
	          fields[i].setAccessible(true);//重点
	          try {
	              System.out.println(fields[i].get(test));
	          } catch (IllegalArgumentException e) {
	              e.printStackTrace();
	          } catch (IllegalAccessException e) {
	              e.printStackTrace();
	          }
	          System.out.println(fields[i].getName());
	      }
	      
	      
	      
	      
	      
	      Method[] methods2 = Test.class.getDeclaredMethods();
	      for (int i = 0; i < methods2.length; i++) {
	           methods2[i].setAccessible(true);//重点
	           System.out.println(methods2[i].getName());
	      }
	      
	      
	      
	      
	      
	      Test test1 = new Test("张三");

	      Method[] methods1 = Test.class.getDeclaredMethods();
	      for (int i = 0; i < methods1.length; i++) {
	          methods1[i].setAccessible(true);//重点
	          try {
	              methods1[i].invoke(test1,"成功调用");
	          } catch (IllegalAccessException e) {
	              e.printStackTrace();
	          } catch (IllegalArgumentException e) {
	              e.printStackTrace();
	          } catch (InvocationTargetException e) {
	              e.printStackTrace();
	          }
	          System.out.println(methods1[i].getName());
	      }
	
	  }
}

