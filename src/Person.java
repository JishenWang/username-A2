public class Person {
    private String name;
    private int age;
    private String gender;
    private String phoneNumber; // 将地址改为电话号码

    // Default constructor
    public Person() {
        this.name = "";
        this.age = 0;
        this.gender = "";
        this.phoneNumber = ""; // 初始化新增的电话号码
    }

    // Constructor with parameters
    public Person(String name, int age, String gender, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber; // 初始化电话号码
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
