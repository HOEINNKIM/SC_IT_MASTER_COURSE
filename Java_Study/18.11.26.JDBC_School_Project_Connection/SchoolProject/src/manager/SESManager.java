package manager;
import java.util.Iterator;

import dao.SESDaoManager;
import vo.Human;

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
	private SESDaoManager sdm = null;
	
	/**
	 * 생성자
	 */
	public SESManager(){
		sdm = new SESDaoManager();
	}
	
	/**
	 * 새로운 Human 객체를 등록한다.
	 * @param human 등록할 Professor, Trainee, Staff 클래스의 객체
	 * @return 성공 여부
	 * */
	public boolean insertHuman(Human human) {
		Human find_h = findHuman(human.getJumin());
		
		// 등록된 주민번호인지 체크한다
		if (find_h != null) {
			return false;
		}

		return sdm.insertHuman(human);
	}

	/**
	 * 등록된 Human 객체를 검색한다.
	 * @param jumin 검색할 Human의 주민번호
	 * @return Human 배열에 등록된 객체들 중 파라메터로 전달된 주민번호와 일치되는 Human 객체, 검색 결과가 없을 시 null을 반환한다.
	 * */
	public Human findHuman(String jumin) {
		return sdm.findHuman(jumin);
	}

	/**
	 * 등록된 Human 객체를 삭제한다.
	 * @param jumin 삭제할 Human의 주민번호
	 * @return 주어진 주민번호와 일치되는 Human 객체의 삭제 결과, Human 배열에 등록된 객체들 중 파라메터로 전달된 주민번호와 일치되는 Human 객체가 발견되어 삭제를 성공하면 true를 그렇지 않으면 false를 반환
	 * */
	public boolean deleteHuman(String jumin){
		boolean flag = false;
		if(sdm.findHuman(jumin) != null) {
			flag = sdm.deleteHuman(jumin);
		}
		return flag;
	}

	/**
	 * 등록된 모든 Human 객체 정보를 출력한다.
	 * */
	public void showAll() {
		Iterator<Human> it = sdm.getHumanList().iterator();
		
		while(it.hasNext()){
			it.next().showInfo();
		}
	}
}
