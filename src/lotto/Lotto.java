package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Lotto {
	private ArrayList<ArrayList<Integer>> lottoList = new ArrayList<ArrayList<Integer>>();
	
	public void RemoveListDuplication (){
	 
	        // List 준비
	        List<String> list = Arrays.asList("A", "B", "C", "A");
	 
	        // List를 Set으로 변경
	        Set<String> set = new HashSet<String>(list);
	 
	        // Set을 List로 변경
	        List<String> newList =new ArrayList<String>(set);
	 
	        // 결과 출력
	        System.out.println(newList);
	}

	public void printLotto() {
		System.out.println("자동 생성");
		
	}

	public void printMyNumLotto() {
		System.out.println("지정번호 포함");
		
	}

}
