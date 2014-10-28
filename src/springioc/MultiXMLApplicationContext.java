/**
 * 
 */
package springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sayed
 *
 */
public class MultiXMLApplicationContext {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "beans.xml", "demo.xml" });
		Demo demo = (Demo) context.getBean("demo");
		System.out.println(demo);
		Marks mark = (Marks) context.getBean("mark");
		System.out.println(mark);
	}
}
