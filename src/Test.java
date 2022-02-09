public class Test {

   private String name;

   private int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class newTest {
    public static void main(String[] args) {
        Test test1 = new Test("yyy",45);
        System.out.println(test1);

        Test test2 = test1;
        System.out.println(test2); // здесь test 2 ссылается на test1 и получает его значения

        test2 = new Test("Bob", 90); // здесь я уже создаю новый объект

        System.out.println(test2);


    }


}
