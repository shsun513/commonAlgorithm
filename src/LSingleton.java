/**
 * 
 * @ClassName:  LLSingleton   
 * @Description:懒汉式  
 * @author: shsun 
 * @date:   2018年7月30日 下午2:47:04   
 *     
 * @Copyright: 2018 www.shsun.com Inc. All rights reserved. 
 * 注意：本内容仅限于shsun公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class LSingleton {
	    //类加载时就初始化
	    private static LSingleton instance;
	    
	    private LSingleton(){}
	 
	    public static synchronized LSingleton getInstance(){
	        if(instance==null){
	          instance = new LSingleton();
	        }
	        return instance;
	    }

}
