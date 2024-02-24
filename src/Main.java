import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Person person1 = new PersonBuilder()
                .setName("Иван")
                .setSurname("Иванов")
                .setAge(20)
                .setAddress("Москва")
                .build();
        person1.happyBirthday();
        System.out.println(person1);

        Person child = person1.newChildBuilder()
                .setName("Петр")
                .build();
        child.happyBirthday();
        System.out.println(child);

        Person person2 = new PersonBuilder()
                .setName("Василий")
                .setSurname("Васильев")
                .setAddress("Иркутск")
                .build();

        System.out.println(person2);
    }
}