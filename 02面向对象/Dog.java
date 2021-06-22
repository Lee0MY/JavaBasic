public class Dog extends Animal{
    // 重写父类的 bark() 方法
    public void bark(){
        System.out.println("汪！汪！汪！");
    }

    // 子类自己的方法
    public void dogType(){
        System.out.println("这是什么品种的狗？");
    }
}