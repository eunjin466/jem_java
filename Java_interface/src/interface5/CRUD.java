package interface5;

public interface CRUD {

	public boolean save(); // db저장용
	public CRUD select(); // db 조회용
	public CRUD update(); //db 수정용
	public boolean delete(); // db삭제용

	
}
interface a{ // 함수형 인터페이스
	public void bb();
}
/*
 * => 화살표함수 (이름 없는 함수)
 * 
 * 
 * 
 * 
 * */
 