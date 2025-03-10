package collection3;

import java.util.ArrayList;
import java.util.Collections;

import com.mysql.cj.x.protobuf.MysqlxExpr.Object;

public class MainMt {
	public static void main(String[] args) {
		
//		ArrayList<Member> list = new ArrayList<>();
//		
//		list.add( new Member(1l,"lej","dmswls10917@naver.com","1234","010314") );
//		list.add( new Member(2l,"dw","dw@naver.com","2345","020312") );
//		System.out.println( list );

		
		
		MemberDao dao = new MemberDao();
		
		ArrayList<Member> memberList = dao.select();
		
		for(Member m : memberList) {
			System.out.println( m );
		}
		
		// 이메일로 아이디와 비밀번호를 조회하기 
		String email = "brown@gamil.com";
		for(Member mem : memberList) { 
			if( mem.getEmail().equals(email)) {
				System.out.println(mem.getMemberId());
				System.out.println(mem.getPassword());
				break;
			}
		}
//		System.out.println(
//				memberList.get(0).equals(email));
		
		
		//memberList.contains ( 대상 );
		// 타입에 대해서도 비교하기 떄문에 동일한 타입으로 비교할 수 있게 email은 Stirng 클래스 타입이라 안된다
		// 그래서 Member클래스 객체에 email을 담아서 비교하게 된다.
		
//		Member 대상 = new Member();
//		대상.setEmail("babo@daum.net");
//		
//		for(int i=0; i<memberList.size();i++) {
//			Member cmp = memberList.get(i);
//			
//			if(cmp.equals(대상)) {
//				System.out.println("찾았다!");
//			}
//		}
		
//		System.out.println( memberList.contains(대상));
		
		// 장은호 생년월일이 memberLsit에 등록된 사람들중 똑같은 거 있나
		Member 장은호 = new Member();
		장은호.setBirth("19970818");
		장은호.setEmail("babo@daum.net");
		장은호.setMemberId("kkk1");
		
		for(int i=0;i<memberList.size();i++) {
			Member m = memberList.get(i);
			
			if(m.equals(장은호)) {
				System.out.println("찾았당!");
			}
		}
		
		System.out.println(memberList.contains(장은호));
		System.out.println( memberList.indexOf(장은호));
		
		System.out.println( "apple".compareTo("bag"));
		Collections.sort( memberList ); 
		for(Member m: memberList) {
			System.out.println(m.getId()+" "+m.getMemberId()+" "+m.getAge());
		}
//		System.out.println( memberList);
		
		
		
	}
}

