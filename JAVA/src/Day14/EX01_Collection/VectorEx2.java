package Day14.EX01_Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx2 {

	public static void printList(List<?> list) {
		// 유효성 검사(null, 비어있는지 체크)
		if( list == null || list.isEmpty() ) {
			System.err.println("요소가 없습니다.");
		return;
		}
		
		Iterator<?> it = list.iterator();
		while( it.hasNext() ) {
			Object item = it.next();
			System.out.print(item);
			if ( it.hasNext() ) {
			System.out.print(", ");
			}else {
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> menuList = new Vector<String>();
		System.out.println("---------메뉴 관리----------");
		
		do {
			System.out.print("입력 : ");
			String menu = sc.nextLine();
			if ( menu.equals("0") ) {
				break;
			}else {				
			menuList.add(menu);	
			}
		} while (true);
		
		printList(menuList);
		
		// 전체 추가
		Vector<String> goodsList = new Vector<String>();
		goodsList.add("딸기 텀플러");
		goodsList.add("화이트 머그컵");
		
		menuList.addAll(goodsList);	// menuList <- goodsList 전체추가
		
		System.out.print(menuList);
		
		sc.close();
	}
}
