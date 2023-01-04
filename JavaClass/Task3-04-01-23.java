package JavaClass;

class UserInfoUsingConstructer{
    public String name;
    protected int age;
    public String place;
    public String companyName;
    public String position;

     
    

    UserInfoUsingConstructer(String name, int age, String place, String companyName, int userId,
            String position) {
        this(name, age);
        this.name = name;
        this.age = age;
        this.place = place;
        this.companyName = companyName;
        this.position = position;

        System.out.println("1st Constructer");
    }

    UserInfoUsingConstructer() {
        System.out.println("Default Constructer");
    }

    UserInfoUsingConstructer(String name, int age){
        //this();
        this.name = name;
        this.age = age;
                                                           
        System.out.println("2nd Constructer");
    }

    public static void main(String args[]) {
        UserInfoUsingConstructer user4 = new UserInfoUsingConstructer("Imran",23, "Kurnool", "Axis Bank", 1, "Full Stack Developer");
        UserInfoUsingConstructer user5 = new UserInfoUsingConstructer("Immu", 25);
        UserInfoUsingConstructer user6 = new UserInfoUsingConstructer();
        //user1.displayUser(user1);
        System.out.println(user4.name);
        System.out.println(user5.age);
        //System.out.println(user3.age);
    }
}
