public class NewObject {
    public static void main(String args[]){
        People LiLei = new People();  // 创建一个 People对象 LiLei

        // 利用 setter 方法为属性赋值
        LiLei.setHeight(170.0);

        // 利用 getter 方法取属性值
        System.out.println("LiLei的身高是" + LiLei.getHeight());

        LiLei.age = 20;
        LiLei.sex = 1;

        LiLei.printBaseMes(); 
    }
}