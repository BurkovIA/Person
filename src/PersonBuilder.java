public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String address = "";

    public PersonBuilder setName (String name){
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname (String surname){
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge (int age){
        if (age<0){
            throw new IllegalArgumentException("Возрас не может быть меньше 0");
        }
        this.age = age;
        return this;
    }
    public PersonBuilder setAddress (String address){
        this.address = address;
        return this;
    }
    Person build(){
        if (name == null || surname == null){
            throw new IllegalStateException("Не указано имя или фимилия");
        }
        return new Person(name, surname, age, address);
    }
}


