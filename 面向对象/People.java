/*
public class People{
    // 属性（成员变量）有什么，前面添加了访问修饰符 private
    // 变成了私有属性，必须通过方法调用
    private double height;  // 身高
    int age;  // 年龄
    int sex;  // 性别, 0 为男性，1 为女性

    // 属性已经封装好了，如果用户需要调用属性
    // 必须用 getter 和 是 setter 方法进行调用
    // getter 方法和 setter 方法必须程序员自己定义
    public double getHeight(){
        // getter 方法命名是 get 关键字加属性名（属性名首字母大写）
        // getter 方法一般是为了得到属性值
        return height;
    }

    // 同理设置我们的 setter 方法
    // setter 方法命名说 set 关键字加属性名（首字母大写）
    // setter 方法一般时给属性值赋值，所以有一个参数
    public void setHeight(double newHeight){
        height = newHeight;
    }

    // 方法 干什么
    void cry(){
        System.out.println("我在哭！");
    }
    void laugh(){
        System.out.println("我在笑！");
    }
    void printBaseMes(){
        System.out.println("我的身高是" + height + "cm");
        System.out.println("我的年龄是" + age + "岁");
        if(this.sex == 0){
            System.out.println("我是男性！");
        }else{
            System.out.println("我是女性！");
        }
    }

}
*/

/*
//成员内部类
//People.Java
        //外部类 People
        public class People{
            private String name = "LiLei";  //外部类的私有属性
            //内部类Student
            public class Student{
                String ID = "201603770";  //内部类的成员属性
                //内部类的方法
                public void stuInfo(){
                    System.out.println("访问外部类中的name: "+ name);
                    System.out.println("访问内部类中的ID: " + ID);
                }
            }

            //测试成员内部类
            public static void main(String[] args){
                People a = new People();  //创建外部类对象，对象名为 a
                Student b = a.new Student();  //使用外部类对象创建内部类对象，对象名为 b
                //或者名为 People.Student b = a.new Student();
                b.stuInfo();  //调用内部对象的suInfo方法
            }
        }
*/


//People.java
//外部类People
//静态内部类

/*外部类的静态变量。
    Java 中被 static 修饰的成员称为静态成员或类成员。它属于整个类所有，而不是某个对象所有，即被类的所有对象所共享。静态成员可以使用类名直接访问，也可以使用对象名进行访问。
*/
/*
public class People{
    private String name = "LiLei";  //外部类的私有属性

    static String ID = "510xxx199X0724XXXX";

    //静态内部类Student
    public static class Student{
        String ID = "20151234";  //内部类的成员属性
        //内部类的方法
        public void stuInfo(){
            System.out.println("访问外部类中的name：" + (new People().name));
            System.out.println("访问外部类中的ID：" + People.ID);
            System.out.println("访问内部类中的ID：" + ID);
        }
    }

    //测试成员内部类
    public static void main(String[] args){
        Student b = new Student();  //直接创建内部类对象，对象名为 b
        b.stuInfo();  //调用内部对象的suInfo方法
    }

}
*/

//People.java
// 外部类People
// 局部内部类
public class People{
    //定义在外部类中的方法内；
    public void peopleInfo(){
        final String sex = "man";  //外部类中的常量

        class Student{
            String ID = "20151234";  //内部类中的常量
            public void print(){
                System.out.println("访问外部类的方法常量sex：" + sex);
                System.out.println("访问内部类的方法变量ID：" + ID);
            }
        }

        Student a = new Student();  //创建方法内部类的对象
        a.print();  //调用内部类的方法
    }

    //定义在外部类中的作用域内
    public void peopleInfo2(boolean b) {
        if(b){
            final String sex = "man";  //外部类方法中的常量
            class Student {
                String ID = "20151234"; //内部类中的常量
                public void print() {
                    System.out.println("访问外部类的方法中的常量sex：" + sex);
                    System.out.println("访问内部类中的变量ID:" + ID);
                }
            }
            Student a = new Student();  //创建方法内部类的对象
            a.print();//调用内部类的方法
        }
    }
    //测试方法内部类
    public static void main(String[] args) {
        People b = new People(); //创建外部类的对象
        System.out.println("定义在方法内：===========");
        b.peopleInfo();  //调用外部类的方法
        System.out.println("定义在作用域内：===========");
        b.peopleInfo2(true);
    }
}