/**
 * 
 * @ClassName:  ESingleton   
 * @Description:饿汉式
 * @author: shsun 
 * @date:   2018年7月30日 下午2:45:38   
 *     
 * @Copyright: 2018 www.shsun.com Inc. All rights reserved. 
 * 注意：本内容仅限于shsun公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class ESingleton {
	    //类加载时就初始化
	    private static final ESingleton instance = new ESingleton();
	    
	    private ESingleton(){}
	 
	    public static ESingleton getInstance(){
	        return instance;
	    }
}
