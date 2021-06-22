public class Test{
    /*
    // 方法重载
    void f(int i){
        System.out.println("i=" + i);
    }

    void f(float f){
        System.out.println("f=" + f);
    }

    void f(String s){
        System.out.println("s=" + s);
    }

    void f(String s1, String s2){
        System.out.println("s1+s2=" + (s1+s2));
    }

    void f(String s, int i){
        System.out.println("s=" + s + ",i=" + i);
    }
    */
    
    public static void main(String[] args){
        /*
        // 方法重载
        Test test = new Test();
        test.f(3456);
        test.f(34.56f);
        test.f("abc");
        test.f("abc", "def");
        test.f("abc", 3456);
        */

        /*
        // 方法重写
        Animal a = new Animal();
        Dog d = new Dog();

        Animal b = new Dog();  // Dog 对象，向上转型为 Animal 类型，具体在后面的内容进行详解。

        a.bark();  // 执行 Animal 类的方法
        d.bark();  //执行 Dog 类的方法
        b.bark();  //执行 Dog 类的方法
        */

        //向上转型
        Animal a = new Animal();
        Animal b = new Dog();
        Dog d = new Dog();

        a.bark();
        b.bark();
        //b.dogType();
        //b.dogType()编译不通过
        d.bark();
        d.dogType();

        // 由于 b 是父类的引用，指向子类的对象，因此不能获取子类的方法，同时当调用 bark()方法时，由于子类重写了父类的 bark()方法，所以调用子类中的 bark()方法。
    
    }
}