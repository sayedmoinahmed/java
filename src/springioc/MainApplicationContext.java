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
public class MainApplicationContext {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student);
		Marks marks = (Marks) applicationContext.getBean("mark");
		System.out.println(marks);
	}
}
