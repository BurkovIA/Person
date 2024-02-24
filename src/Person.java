import java.util.Objects;

class Person {
        protected final String name;
        protected final String surname;
        protected int age;
        protected String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        if (age == -1) {
            throw new IllegalStateException("Не указан возраст");
        }
        this.age = age;
        this.address = address;
    }
    public boolean hasAge() {
        return age != -1;
    }
    public boolean hasAddress() {
        return !address.isEmpty();
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
//
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if(hasAge()){
            age++;
        } else {
            throw new IllegalStateException("Не указан возраст");
        }
    }
   public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAge(0)
                .setAddress(address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}
