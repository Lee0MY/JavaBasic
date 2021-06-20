public class StringTest{
    public static void main(String[] args){
        /*
        String s = new String("Java");
        String m = "java";
        boolean b = (s == m);

        System.out.println("用equals()比较，java和Java结果为："+s.equals(m));
        System.out.println("用equalsIgnoreCase()比较，java和Java结果为："+s.equalsIgnoreCase(m));
        System.out.println(b);
        */
        /*
        String s0 = new String("Hello ");
        String s1 = "World" + "!";
        String s2 = s0.concat(s1);
        System.out.println(s2);
        */
        /*
        String s = "abc";
        char c = s.charAt(1);
        System.out.println(c);
        */

        String s = "abcdefabc";
        System.out.println("字符a第一次出现的位置为" + s.indexOf('a'));
        System.out.println("字符串bc第一次出现的位置为" + s.indexOf("bc"));
        System.out.println("字符a最后一次出现的位置为" + s.lastIndexOf('a'));
        System.out.println("从位置3开始到结束的字符串" + s.substring(3));
        System.out.println("从位置3开始到6之间的字符串" + s.substring(3,6));
    }
}