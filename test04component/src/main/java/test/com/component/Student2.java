package test.com.component;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value = "st_02")		// 이름을 별도로 부여할 수 있음
public class Student2 {
	
	private static final Logger logger = LoggerFactory.getLogger(Student2.class);
	private ArrayList<String> list;
	
	public Student2() {
		logger.info("Student2() .... !! "); 
		list = new ArrayList<String>();
		list.add("kim04");
		list.add("kim05");
		list.add("kim06");
	}

	@Override
	public String toString() {
		return "Student2 [list=" + list + "]";
	}
}
