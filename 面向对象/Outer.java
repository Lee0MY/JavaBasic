// Outer.java
public class Outer {

    public Inner getInner(final String name, String city) {
        return new Inner() {
            private String nameStr = name;
            private String cityStr = city;
            public String getName() {
                return nameStr;
            }
            public String cityName() {
                return cityStr;
            }
        };
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.getInner("Inner", "NewYork");
        System.out.println(inner.getName());
        System.out.println(inner.cityName());
    }
}
interface Inner {
    String getName();
    String cityName();
}
