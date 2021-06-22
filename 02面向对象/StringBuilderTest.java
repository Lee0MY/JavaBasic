public class StringBuilderTest{

    public static void main(String[] args){
        StringBuilder s = new StringBuilder("I");
        //在 s 后面添加字串"  java"
        s.append(" java");
        //在s[1]的位置插入字串
        s.insert(1, " love");
        String t = s.toString();  //转为字符串
        System.out.println(t);
    }

}