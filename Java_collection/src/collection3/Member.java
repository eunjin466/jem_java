package collection3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor // 기본 생성사 메서드
@AllArgsConstructor // 모든인스던스를 매개변수로 메서드 

public class Member implements Comparable<Member>{
	private Long id; // 회원번호
	private String memberId; // 회원아이디
	private String email; // 회원이메일
	private String password; // 회원 비밀번호
	private String birth; // 생년월일(8자리)
	private int age; // 나이
	//컬랙션에서 contains, indexOf같은 비교하는 동작 메서드
	//사용하려면 사용자정의 클래스에서 equals를 구현해야한다.
	
	@Override
	public boolean equals(Object obj) {
		Member temp = (Member) obj;
		boolean isSame = this.birth.equals(temp.birth);
		isSame = isSame && (this.email.equals(temp.email));
		isSame = isSame && (this.memberId.equals(temp.memberId));
		
		return isSame;
	} 
	@Override
	public int compareTo(Member o) {
			// 정렬을 위한 compareTo 메서드 구현
			// 정렬 기준을 정해야한다.
			
//		return this.age-o.age;
		return this.birth.compareTo(o.birth);
		//return o.birth.compareTo(this.birth); 
	}
	
	
		
	}
	


// 클래스 정의 
// 인스턴스변수의 접근 제어자는 private
// 인스턴스변스에 대해 get ,set 메서드
// toString 메서드 만들기
