package test.spring;
/**
 *  
 *  吴伟 版权所有
 */


import org.junit.Test;
import org.junit.runner.RunWith;
import org.marker.mushroom.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 用户数据库操作对象测试
 * @author marker
 * @date 2013-11-29 上午9:47:26
 * @version 1.0
 * @blog www.yl-blog.com
 * @weibo http://t.qq.com/wuweiit
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = "classpath:/config/spring/*.xml")
public class ServiceTest extends AbstractJUnit4SpringContextTests {
 
	
	@Autowired CategoryService categoryService;
	
	@Test
	public void sendMail(){ 
		System.out.println(categoryService.list("article"));
	}
	 
 
}
 