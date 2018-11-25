package broker.manager;

import java.util.ArrayList;

import broker.vo.RealEstate;

public interface RealEstateManager {
	
	/**
	 * 신규 부동산 매물을 등록한다.
	 * 각 등록된 매물은 고유의 주소정보를 가지고 있으며, 동일한 주소의 매물은 중복하여 등록할 수 없다.
	 * @return 등록에 성공하면 true를, 실패하면 false를 반환한다.
	 * @param 등록하고자 하는 부동산 매물의 정보를 갖는 RealEstate 클래스 객체
	 * */
	public boolean addForSales(RealEstate re);
		//등록 프린트 실행 후 -> 1234 중 선택하여 해당 번호에 맞는 객체 생성하여 등록
		//중복되는 주소에 대한 처리
		//등록 성공하면 true, 실패하면 false;
		
	
	/**
	 * 주소를 기준으로 등록된 부동산 매물을 검색한다.
	 * @return 주소로 검색된 매물정보를 갖는 RealEstate 클래스 객체
	 * @param 검색하고자하는 매물 주택정보의 주소
	 * */
	public RealEstate searchForSalesByAddress(String address);
		//검색 프린트 실행 후 -> 0 번 주소로 검색 실행시 발동 -> 주소를 파라미터로 받아서 equals 시전
	
	
	/**
	 * 거래형태(매매:1, 전세:2, 월세:3)에 따른 부동산 매물을 검색한다.
	 * @return 거래형태에 따른 매물정보를 갖는 RealEstate 클래스 객체의 목록
	 * @param 거래형태를 구분지는 값 (매매:1, 전세:2, 월세:3)
	 * */
	public ArrayList<RealEstate> searchForSalesByTradeType(int type);
		//검색 프린트 실행 후 -> 1, 2, 3으로 매물 검색시 발동 -> 번호를 파라미터로 받아서 해당하는 매물리스트 반환
	
	/**
	 * 등록된 매물 주택정보를 수정한다. 수정 가능한 정보는 각 매물의 가격(매매가격, 전세임대보증금, 월세)정보에 해당한다.
	 * @param 수정된 정보를 가지고 있는 RealEstate 클래스 객체
	 * */
	public void updateForSalesInfo(RealEstate re);
		//각 자식객체에서 추가된 변수를 기준으로 수정 가능
	
	/**
	 * 거래가 완료된 매매 물건은 거래 매물 목록에서 삭제한다.
	 * @param address 삭제하고자 하는 매물 주택정보의 주소
	 * @return 삭제를 성공하면 true를, 실패하면 false를 반환한다.
	 * */
	public boolean deleteForSaleInfo(String address);
		//삭제할 주소를 파라미터로 입력 받으면 해당 파라미터에 해당하는 어레이 삭제
		//성공하면 true, 실패하면 false;
	
	/**
	 * 등록된 모든 매물 주택정보에 대한 목록을 반환한다.
	 * @return 부동산 중계 프로그램에서 거래되는 모든 매물 정보가 등록되어 있는 ArrayList<RealEstate> 객체
	 * */
	public ArrayList<RealEstate> getAllForSalesInfo();
}
