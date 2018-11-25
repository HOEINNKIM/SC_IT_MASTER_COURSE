class PracticalProblem1 {
	public static void main(String[] args) {

	double 원의둘레 = 2 * 3.14 * 11;
	int 책장너비 = 2;
	int A = (int)원의둘레 / 책장너비;
	int 책수 = 70;
	int 선반 = 14;
	int 책장당책 = 책수 * 선반;
	int 전체도서 = 책장당책 * A;
	System.out.println("책장 갯수 : " + A);
	System.out.println("전체 도서의 수 : " + 전체도서);

	}
}


//원의 둘레 공식 = 2 * 3.14 * r

// 도서관 내부공간에 책장을 전부 넣는다고 잘못생각하여 틀림
//double Extent = 3.14 * 11 * 11; // 도서관의 넓이
	//int BookCase = 2;				// 책장의 넓이
	//int A = (int)extent / BookCase; // 도서관 넓이에 맞는 총 넣을 수 있는 책장
	//int Shelf = 14;					// 선반의 수
	//int ShelfOnBook = 70;			// 선반당 들어갈 수 있는 책의 권수
	//int B = Shelf * ShelfOnBook; // 한 책장당 책
	//System.out.println("책장 갯수 : " + A);
	//System.out.println("전체 도서의 수 : " + B);
