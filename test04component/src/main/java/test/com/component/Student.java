package test.com.component;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

// 컴포넌트로 사용
// 재기동 시 자동으로 올라감
@Component
public class Student {
	
	private static final Logger logger = LoggerFactory.getLogger(Student.class);
	private ArrayList<String> list;
	
	public Student() {
		logger.info("Student() .... !! "); 
		list = new ArrayList<String>();
		list.add("kim01");
		list.add("kim02");
		list.add("kim03");
	}

	@Override
	public String toString() {
		return "Student [list=" + list + "]";
	}
}
