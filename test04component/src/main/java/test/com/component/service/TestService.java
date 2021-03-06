package test.com.component.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.com.component.model.RequestVO;
import test.com.component.model.TestDAO;

//@Component
@Service			// TestService는 연결 역할을 하므로 service로 어노테이션을 선언하는게 좋음
public class TestService {

	@Autowired	
	private TestDAO dao;
	
	public int insert(RequestVO vo) {
		return dao.insert(vo);
	}
	
	public RequestVO selectOne(RequestVO vo) {
		return dao.selectOne(vo);
	}
	
	public ArrayList<RequestVO> selectAll(){
		return dao.selectAll();
	}

	public int delete(RequestVO vo) {
		return dao.delete(vo);
	}

	public int update(RequestVO vo) {
		return dao.update(vo);
	}

}
