package chap15;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Iterator 인터페이스 : 반복자, 
 * 	Collection 객체는 Iterator 객체로 변환이 가능함 : Iterator() 메서드
 * 	메서드
 *   boolean hasNext() : 조회 대상 객체가 존재?
 *   Object next() : 조회 대상 객체 리턴.
 *   void remove() : 조회 객체를 제거. 반드시 next() 실행 이후에 호출가능
 * Enumeration 인터페이스 : 반복자. Iterator구버전.
 * 						Collection 프레임워크 이전 반복자
 * 		Vector, Hashtable클래스에서만 사용 가능함
 * 	  메서드 
 * 	   boolean hasMoreElement() : 조회 대상 객체가 존재?
 * 	   Object nextElement() : 조회 대상 객체 리턴 
 */
public class IteratorEx1 {
	public static void main(String[] args) {
		Iterator it = null;
		List list = new ArrayList();
		Set set = new HashSet();
		for(int i=1;i<=5;i++) {
			list.add(i+10);
			set.add(i*10);
		}
		it=list.iterator();
		print(it);
		it=set.iterator();
		print(it);
		System.out.println(list);
		System.out.println(set);
		}
	private static void print(Iterator it) {
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}		
	}
}
