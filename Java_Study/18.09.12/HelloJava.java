public class HelloJava {
        String sayHello = "�ȳ��ϼ���";
        String name = "������";
        int age;

        public HelloJava(int newAge) {
	System.out.println("�����ڰ� ���۵Ǿ���.");
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
	System.out.println("���θż������");
                new HelloJava(28);
	System.out.println("���θż��峡");
        }
}
