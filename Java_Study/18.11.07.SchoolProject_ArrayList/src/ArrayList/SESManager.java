package ArrayList;

import java.util.ArrayList;

/**
 * <pre>
 * SES(Soft Engineer School) 관리 프로그램의 업무로직을 관리하는 클래스
 * 주요 기능으로는 다음과 같다.
 * 1. 신규 관리인원 등록
 * 2. 등록인원 검색
 * 3. 등록인원 삭제
 * 4. 전체 등록인원 출력
 * </pre>
 * */
public class SESManager {
	private ArrayList<Human> humanList; //관리인원(교수, 연수생, 운영진) 객체를 저장할 저장 공간
	
	/**
	 * 주어진 size의 초기값으로 새로운 SESManager 클래스의 객체를 생성한다.	 * 
	 * */
	public SESManager(){
		humanList = new ArrayList<Human>();
	}
	
	/**
	 * <pre>
	 * 새로운 Human 객체를 등록한다.
	 * 등록된 Human 객체 정보 중 주민번호는 중복될 수 없으며, 이미 등록된 주민번호의 Human 정보는 등록할 수 없다.
	 * </pre>
	 * @param human 등록할 Professor, Trainee, Staff 클래스의 객체
	 * @return 등록 성공 시 true를, 실패(이미 등록된 주민번호 중복 등록) 시 false를 반환한다.
	 * */
	public boolean insertHuman(Human human){
		Human find_h = findHuman(human.getJumin());
		
		// 중복된 주민번호인지 확인한다
		if (find_h != null) {
			System.out.println("[에러] 이미 등록된 주민번호입니다.");
			return false;
		}
		
		humanList.add(human);
		return true;
	}

	/**
	 * 등록된 Human 객체를 검색한다.
	 * @param jumin 검색할 Human의 주민번호
	 * @return Human ArrayList에 등록된 객체들 중 파라메터로 전달된 주민번호와 일치되는 Human 객체, 검색 결과가 없을 시 null을 반환한다.
	 * */
	public Human findHuman(String jumin){
		for(Human h : humanList){
			// 일치되는 주민번호를 찾았다면 반환한다
			if(jumin.equals(h.getJumin())){
				return h;
			}
		}
		return null;
	}

	/**
	 * 등록된 Human 객체를 삭제한다.
	 * @param jumin 삭제할 Human의 주민번호
	 * @return 주어진 주민번호와 일치되는 Human 객체의 삭제 결과, ArrayList에 등록된 객체들 중 파라메터로 전달된 주민번호와 일치되는 Human 객체가 발견되어 삭제를 성공하면 true를 그렇지 않으면 false를 반환
	 * */
	public boolean deleteHuman(String jumin){
		for(Human h : humanList){
			// 일치되는 주민번호를 찾았다면 리스트에서 삭제한다
			if(jumin.equals(h.getJumin())){
				humanList.remove(h);
				return true;
			}
		}
		return false;
	}

	/**
	 * 등록된 모든 Human 객체 정보를 출력한다.
	 * */
	public void showAll(){
		for(Human h : humanList) {
			h.showInfo();
		}
	}
}
