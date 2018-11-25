public class HelloJava {
        String sayHello = "안녕하세요";
        String name = "임진영";
        int age;

        public HelloJava(int newAge) {
	System.out.println("생성자가 시작되었다.");
	System.out.println(age);
                age = newAge;
	System.out.println(name);
	System.out.println(age);
	
        }

        public void setAge(int newAge) {
                age = newAge;
        }

        public void setName(String newName) {
                name = newName;
        }

        public static void main(String[] args) {
	System.out.println("메인매서드시작");
                new HelloJava(28);
	System.out.println("메인매서드끝");
        }
}
