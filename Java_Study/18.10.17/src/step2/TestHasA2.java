package step2;

class Student{
	private String name;
	private NoteBook noteBook;
	
	Student(String name, NoteBook noteBook){
		this.name = name;
		this.noteBook = noteBook;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NoteBook getNoteBook() {
		return noteBook;
	}

	public void setNoteBook(NoteBook noteBook) {
		this.noteBook = noteBook;
	}
	
	
};

class NoteBook{
	private String maker;
	private String model;
	
	NoteBook(String maker, String model){
		this.maker = maker;
		this.model = model;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}	
};




public class TestHasA2 {
	public static void main(String[] args) {
		Student s = new Student("김회인", new NoteBook("엘지","올데이그램"));
		System.out.println(s.getName()); //김회인
		System.out.println(s.getNoteBook().getMaker());//엘지
		System.out.println(s.getNoteBook().getModel());//올데이그램
	}

}
