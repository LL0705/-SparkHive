public class Students {
    private String name;

    private int age;
    //无参构造
    public  Students(){
        super();
    }
    //有参构造
    public Students(String name,int age) {
        this.name = name;
        this.age = age;
    }

    //Get,Set
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    //成员方法
    public void study(){
        System.out.println("学习");
    }
    public void exam(){
        System.out.println("考试");
    }
    public void show(){
        System.out.println("姓名："+name+" 年龄："+age);
    }
}
class StudentDemo {
    public static void main(String[] args) {
        Students s1 = new Students("小红",18);
        Students s2 = new Students();
        s2.setAge(50);
        s2.setName("老王");
        s1.show();
        s2.show();
        s1.study();
        s1.exam();
    }
}