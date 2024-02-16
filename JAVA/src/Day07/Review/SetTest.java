package Day07.Review;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet(); 
		
		// set 선언 하는거임. 여기서 Tree Set 는 오름 차순으로 값을 정렬해서 갖고 있고
		// 다른 set 보다 대량 데이터 검색할때 훨씬 빠르게됨 
		
		set.add("a");
		set.add("b");
		set.add("f"); // set에 중복값 저장 불가함
		set.add("c"); // set에 값 담기.
		set.add("asd");
		set.add("g");
		
		System.out.println("Set 크기 확인 :" + set.size());

	}

}
