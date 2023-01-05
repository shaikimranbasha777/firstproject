

class UserInfoUsingConstructerAndUSingThis{
    public String name;
    protected int age;
    public String place;
    public String companyName;
    public String position;

     
    

    UserInfoUsingConstructerAndUSingThis(String name, int age, String place, String companyName, int userId,
            String position) {
        this(name, age);
        this.name = name;
        this.age = age;
        this.place = place;
        this.companyName = companyName;
        this.position = position;

        System.out.println("1st Constructer");
    }

    UserInfoUsingConstructerAndUSingThis() {
        System.out.println("Default Constructer");
    }

    UserInfoUsingConstructerAndUSingThis(String name, int age){
        //this();
        this.name = name;
        this.age = age;
                                                           
        System.out.println("2nd Constructer");
    }

    public static void main(String args[]) {
        UserInfoUsingConstructerAndUSingThis user4 = new UserInfoUsingConstructerAndUSingThis("Imran",23, "Kurnool", "Axis Bank", 1, "Full Stack Developer");
        UserInfoUsingConstructerAndUSingThis user5 = new UserInfoUsingConstructerAndUSingThis("Immu", 25);
        UserInfoUsingConstructerAndUSingThis user6 = new UserInfoUsingConstructerAndUSingThis();
        //user1.displayUser(user1);
        System.out.println(user4.name);
        System.out.println(user5.age);
        System.out.println(user6.age);
    }
}