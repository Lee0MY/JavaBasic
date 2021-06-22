### 基础语法 上
    - 方法：Java中的方法，可以看成一个功能的集合，它们是为了解决特定问题的代码组合。
    定义语法：
        访问修饰符 返回值类型 方法名(参数列表){
            方法体
        }
    比如：
        public void functionName(Object arg){
            System.out.println("Hello World.");
        }
    1.访问修饰符：代表方法被允许访问的权限范围，可以是 public 、protected 、 private 或者省略(default)，其中 public 表示该方法可以被其他任何代码调用。
    2.返回值类型：方法返回值的类型，如果方法不返回任何值，则返回值类型指定为 void（代表无类型）；如果方法具有返回值，则需要指定返回值的类型，并且在方法体重使用 return 语句返回值。
    3.方法名：是方法的名字，必须使用合法的标识符。
    4.参数列表：是传递给方法的参数列表，参数可以有多个，多个参数间用逗号隔开，每个参数由参数类型和参数名组成。这个值被称为实参或变量。参数列表是指方法的参数类型、顺序和参数个数。参数是可选的，方法可以不包含任何参数。
    5.方法体：方法体包含具体的语句，定义该方法的功能。

    当方法定义好后，需要调用才可以生效，我们可以通过main方法（main方法是Java程序的入口，所以需要它来调用）来调用它。

### 基础语法 下
- 流程控制
- 数组
- 用户输入操作

### 面向对象
- 类

    类是封装对象的属性和行为的载体，反过来说具有相同属性和行为的一类实体被称为类。

    + 类是相同或相似对象的一种抽象，是对象的一个模板，它描述了一类对象的行为和状态。
    + 类是具有相同属性和方法（行为）的对象的集合。
    
    属性：对象具有的特征。每个对象的每个属性都拥有特定值。我们上面讲过对象是一个具体并且确定的事物，正是对象属性的值来区分不同的对象，比如我们可以通过一个人的外貌区分他。

    行为：在计算机中我们通过方法去实现对象的行为，而对象的方法便是对象所具有的操作，比如人会走路、会哭泣、会学习等等都是人的行为，也就是人的方法。

    其实，类就是对象的抽象（或者模板），对象就是类的具体（或者实例）。比如手机是一个抽象的概念，它代表类。而一部iPhone6便是手机具象化处理的实体，也就是一个对象。

    Java 是面向对象的语言，而他的体现就在于 Java 程序都是以类 class 为组织单元。而一个类是对象的抽象，所以类由属性和方法两部分组成。
        
    + 定义类名
    + 编写类的属性
    + 编写类的方法

    一个类可以包含以下类型变量：
    + 局部变量：在方法、构造方法或者语句块中定义的变量称为局部变量。变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。
    + 成员变量：成员变量是定义在类中，方法之外的变量。这种变量在创建对象的时候实例化。成员变量可以被类中方法、构造方法和特定类的语句块访问。 
    + 类变量：也叫静态变量，类变量也声明在类中，方法体之外，但必须声明为 static 类型。 

- 对象

    创建对象的语法如下：
        
        类名 对象名 = new 类名();
    创建对象后，我们就要使用对象了，使用对象无非就是对属性和方法进行操作和调用。语法如下：
        
        // 引用对象属性
        对象名.属性
        // 引用对象方法
        对象名.方法
     成员变量就是指对象的属性，是在类中定义，来描述对象的特性。还有一种变量叫局部变量，它是由类的方法定义，在方法中临时保存数据。

     PS：成员变量可以被本类的所有方法使用，同时可以被与本类有关的其他类所使用。而局部变量只能在当前的方法中使用。

    作用域：作用域可以简单理解为变量的生存期或者作用范围，也就是变量从定义开始到什么时候消亡。
    + 局部变量的作用域仅限于定义它的方法内。而成员变量的作用域在整个类内部都是可见的。
    + 同时在相同的方法中，不能有同名的局部变量；在不同的方法中，可以有同名的局部变量。
    + 成员变量和局部变量同名时，局部变量具有更高的优先级。 

- 构造方法

    每个类都有构造方法，在创建该类的对象的时候他们将被调用，如果没有定义构造方法，Java编译器会提供一个默认构造方法。创建一个对象的时候，至少调用一个构造方法。比如在新建一个对象 new Object()，括号中没有任何参数，代表调用一个无参构造方法（默认构造方法就是一个无参构造方法）。构造方法的名称必须与类名相同，一个类可以有多个构造方法。

    构造方法的具体内容：
    
    1. 构造方法的名称与类名相同，且没有返回值。它的语法格式如下：
        
            //与类同名，可以指定参数，没有返回值
            public 构造方法名(){
                // 初始化代码
            }

        下面是一个构造方法的例子：
            
            public class People(){
                //无参构造方法
                public Peolple(){

                }

                //有一个参数的构造方法
                public Peolple(int age){

                }
            }
        又例如具体的构造方法：
            public class Peolple{
                // 属性（成员变量）有什么
                double heigjt;  // 身高
                int age;  // 年龄
                int sex;  // 性别， 0为男性，非 0 为女性

                // 构造方法，初始化了所有属性
                public People(double h, int a, int s){
                    height = h;
                    age = a;
                    sex = s;
                }
            }

            //创建对象，调用我们自己定义的有参构造方法
            People XiaoMing = new People(168,21,1);
        通过以上例子可知，通过 new 关键字将类实例化成对象，而 new 后面跟的就是构造方法。于是可以知道 ( new + 构造方法 ) 可以创建一个新的对象。
    
    2.如果在定义类的时候没有写构造方法，系统会默认生成一个无参构造方法，这个构造方法什么也不会做。
    
    3.当有指定的构造方法时，系统都不会再添加无参构造方法了。

    4.构造方法的重载：方法名相同，但参数不同的多个方法，调用时会自动根据不同的参数选择相应的方法。

- 引用与对象实例

    在新建对象实例时，需要为对象实例设置一个对象名，就像这样：

            Object object = new Object();
    那么变量 object 就真的是 Object 对象么，这里其实只是创建了一个 object 对象的引用。如果学过 C 语言，这里和指针一样，变量 object 其实是保存的是 Object 对象的引用，指向了 Object 对象的引用。即：其实 object 变量的内存地址指向的是一个 Object 对象。

- static 
    Java 中被 static 修饰的成员称为静态成员或类成员。它属于整个类所有，而不是某个对象所有，即被类的所有对象所共享。静态成员可以使用类名直接访问，也可以使用对象名进行访问。 

        public class StaticTest{
        public static String string="shiyanlou";
        public static void main(String[] args){
            //静态成员不需要实例化 直接就可以访问
            System.out.println(StaticTest.string);
            //如果不加static关键字 需要这样访问
            StaticTest staticTest=new StaticTest();
            System.out.println(staticTest.string);
            //如果加上static关键字，上面的两种方法都可以使用
            }
        }

    静态方法：被 static 修饰的方法是静态方法，静态方法不依赖于对象，不需要将类实例化便可以调用，由于不实例化也可以调用，所以不能有 this，也不能有 this，也不能访问非静态成员变量和非静态方法。但是非静态成员和非静态方法可以访问静态方法。

- final

    1. final 修饰类，则该类不允许被继承，为最终类
    2. final 修饰方法，则该方法不允许被覆盖（重写）
    3. final 修饰属性：则该类的属性不会进行隐式的初始化（类的初始化属性必须有值）或在构造方法中赋值（但只能选其一）
    4. final 修饰变量，则该变量的值只能赋一次值，即常量
    
    如：
    
        // 静态变量
        public final static String SHI_YAN_LOU = "shiyanlou";

- 权限修饰符

    代码中经常用到 private 和 public 修饰符，权限修饰符可以用来修饰属性和方法的 访问范围。

    + private 本类
    + 默认 本类 同包
    + protected 本类 同包 子类
    + public 本类 同包 子类 其他

    private 修饰符的属性或者方法，只能在当前类中访问或者使用。默认 是修饰符都不加，默认在当前类中和同一包下都可以访问和使用。protected 修饰的属性或者方法，对同一包内的类和所有子类可见。public 修饰的属性或者方法，对所有类可见。

- 封装

    封装：即隐藏对象的属性和实现细节，仅对外公开接口，控制在程序中属性的读和修改的访问级别。

    这样做有什么好处？

    1. 只能通过规定的方法访问数据。
    2. 隐藏类的实例细节，方便修改和实现。

    如何去实现类的封装呢？
    
    1. 修改属性的可见性，在属性的前面添加修饰符(private)
    2. 对每个值属性提供对外的公告方法访问，如创建 getter/setter（取值和赋值）方法，用于对私有属性的访问。
    3. 在 getter/setter 方法里加入属性的控制语句，例如我们可以加一个判断语句，对于非法输入给予否定。

    如果我们没有在属性前面添加任何修饰符，我们通过对象就可以直接对属性值进行修改，没有体现封装的特性。这在许多程序设计中都是不安全的，所以我们需要利用封装，来改进我们的代码。

- this

    this 关键字代表当前对象。使用 this.属性  操作当前对象的属性，this.方法 调用当前对象的方法。

    用 private 修饰的属性，必须定义 getter 和 setter方法才可以访问到。（Eclipse 和 IDEA 等 IDE 都有自动生成 getter 和 setter 方法的功能）。

    创建好了 getter 和 setter 方法后，我们发现方法中参数名和属性名一样。

    当成员变量和局部变量之间发生冲突时，在属性名前面添加了 this 关键字。此时就代表将一个参数的值赋给当前对象的属性。同理 this 关键字可以调用当前对象的方法。

- 继承 

    继承可以看成是类与类之间的衍生关系。比如狗类是动物类，牧羊犬类又是狗类。于是我们可以说狗类继承了动物类，而牧羊犬类继承了狗类。于是狗类就是动物类的子类（或派生类），动物类就是狗类的父亲（或基类）。

    所以继承需要符合的关系是：is-a，父类更通用，子类更具体。

    语法：

        class 子类 extends 父类
    
    例如我们定义了一个 Animal 类，再创建了一个 Dog 类，我们需要它继承 Animal 类。

        class Dog extends Animal{
            ...
        }

    Dog 类继承了父类 Animal，我们 Dog 类里什么都没有写，其实它继承了父类 Animal 类的全部方法和属性（除开 private 方法和属性）。

    #### 为什么需要继承？

    如果有两个类相似，那么它们会有许多重复的代码，导致后果就是代码量大且臃肿，后期的维护性不高。通过继承就可以解决这个问题，将两段代码中相同的部分提取出来组成一个父类，实现代码的复用。

    #### 继承的特点：

    + 子类拥有父类除 private 以外的所有属性和方法
    + 子类可以拥有自己的属性和方法
    + 子类可以重写实现父类的方法
    + Java 中的继承是单继承，一个类只有一个父类
    
    注：Java 实现多继承的一个办法是 implement（实现）接口，但接口不能有非静态的属性，这一点请注意。

- super

    super 关键字在子类内部使用，代表父类对象。

    1. 访问父类的属性 super.属性名。
    2. 访问父类的方法 super.方法名
    3. 子类构造方法需要调用父类的构造方法时，在子类的构造方法体里最前面的位置：super()。

- 方法重载与重写

    方法重载是指在一个类中定义多个同名的方法，但要求每个方法具有不同的参数的类型或参数的个数。方法重载一般用于创建一组任务相似但是参数不同的方法。

    方法重载有以下几种规则：

    + 方法中的参数列表必须不同。比如：参数个数不同或者参数类型不同。
    + 重载的方法中允许抛出不同的异常
    + 可以有不同的返回值类型，但是参数列表必须不同
    + 可以有不同的访问修饰符

    #### 方法重写

    子类可以继承父类的方法，但如果子类对父类的方法不满意，想在里面加入适合自己的一些操作时，就需要将方法进行重写。并且子类在调用方法中，优先调用子类的方法。

    比如 Animal 类中有 bark() 这个方法代表动物叫，但是不同的动物有不同的叫法，比如狗是汪汪汪，猫是喵喵喵。

    当然在方法重写时要注意，重写的方法一定要与原父类的方法语法保持一致，比如返回值类型，参数类型及个数，和方法名都必须一致。

- 多态

    多态是指允许不同类的对象对同一消息可以根据发送对象的不同而采用多种不同的行为方式。多态也称作动态绑定（dynamic binding），是指在执行期间判断所引用对象的实际类型，根据其实际的类型调用其相应的方法。

    通俗地讲，只通过父类就能够引起不同的子类，这就是多态，我们只有在运行的时候才会知道引用变量所指向的具体实例对象。

    #### 多态的实现条件

        多态的实现有三个必要条件：继承、重写和向上转型
        （即父类引用指向子类对象）。

    只有满足上述三个条件，才能够在同一个继承结构中使用统一的逻辑实现代码处理不同的对象，从而达到执行不同的行为。

    #### 多态的实现方式

    Java 中多态的实现方式：继承父类进行方法重写，抽象类和抽象方法，接口实现。

- 向上转型

    要理解多态必须要明白什么是“向上转型”，比如一段代码如下，Dog 类是 Animal 类的子类：

        Animal a = new Animal();  //a是父类的引用指向的是本类的对象
        Animal b = new Dog();  //b是父类的引用指向的是子类的对象

    在这里，可以认为由于 Dog 继承于 Animal，所以 Dog 可以自动向上转型为 Animal，所以 b 是可以指向 Dog 实例对象的。

    注：不能使用一个子类的引用去指向父类的对象，因为子类对象中可能会含有父类对象中所没有的属性和方法。

    如果定义了一个指向子类对象的父类引用类型，那么它除了能够引用父类中定义的所有属性和方法外，还可以使用子类强大的功能。但是对于只存于子类的方法和属性就不能获取。

    #### 因此，向上转型，在运行时，会遗忘子类中与父类对象中不同的方法，也会覆盖与父类中相同的方法————重写（方法名，参数都相同）。

- 抽象类

    在定义类时，前面加上 abstract 关键字修饰的类叫做抽象类。

    抽象类中有抽象方法，这种方法是不完整的，仅有声明而没有方法体。抽象方法声明的语法如下：

        abstract void f();  //f()方法是抽象方法

    那我们什么时候会用到抽象类呢？

    1. 在某些情况下，某个父类只是知道其子类应该包含怎样的方法，但无法准确知道这些子类如何实现这些方法。也就是说抽象类是约束子类必须要实现哪些方法，而并不关注方法如何去实现。
    2. 从多个具有相同特征的类找那个抽象出一个抽象类，以这个抽象类做为子类的模板，从而避免了子类设计的随意性。

    所以由上可知，抽象类是限制规定子类必须实现某些方法，但不关注实现细节。

    那抽象类如何用代码实现呢，它的规则如下：

    1. 用 abstract 修饰符定义抽象类
    2. 用 abstract 修饰符定义抽象方法，只用声明，不需要实现
    3. 包含抽象方法的类都是抽象类
    4. 抽象类中可以包含普通的方法，也可以没有抽象的方法
    5. 抽象类的对象不能直接创建，通常是定义引用变量指向子类对象。

- 接口

    接口用于描述类所具有的功能，而不提供功能的实现，功能的实现需要写在实现接口的类中，并且该类必须实现接口中所有的未实现方法。

    接口的声明语法格式如下：

        修饰符 interface 接口名称 [extends 其他的接口名]{
            // 声明变量
            // 抽象方法
        }
    
    如声明一个 Animal 接口：

        // Animal.Java
        interface Animal{
            // int x;
            // 编译错误，x需要初始化，因为是 static final 类型
            int y = 5;
            public void eat();
            public void travel();
        }

    #### 注意点

    在 Java8 中：

    + 接口不能用于实例化对象
    + 接口中方法只能是抽象方法、default 方法、静态方法
    + 接口成员是 static final 类型
    + 接口支持多继承

    在 Java9 中，接口可以拥有私有方法和私有静态方法，但只能被该接口中的 default 方法和静态方法使用。

    多继承实现方式：

        修饰符 interface A extends 接口1，接口2{

        }

        修饰符 class A implements 接口1，接口2{
            
        }

- 内部类
    将一个类的定义放在另一个类的定义内部，这就是内部类。而包含内部类的类被称为外部类。

    内部类的主要作用如下：

    1. 内部类提供了更好的封装，可以把内部类隐藏到外部类之内，不允许同一个包中的其他类访问该类
    2. 内部类的方法可以直接访问外部类的所有数据，包括私有的数据
    3. 内部类所实现的功能使用外部类同样可以实现，只是有时使用内部类更方便
    4. 内部类允许继承多个非接口类型

    注：内部类是一个编译时的概念，一旦编译成功，就会成为完全不同的两类。对于一个名为 outer 的外部类和其内部定义名为 inner 的内部类。编译完成后出现 outer.class 和 out$inner.class 两类。所以内部类的成员变量 / 方法名可以和外部类相同。

- 成员内部类

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
                    System.out.println("访问内部类中的ID: " + ID)；
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

    成员捏不累的使用方法：

    1. Student 类相当于 People 类中的一个成员变量，所以 Student 类可使用任意访问修饰符
    2. Student 类在 People 类里，所以访问范围在类里的所有方法均可以访问 People 属性（即内部类里面可以直接访问外部类的方法和属性，反之不行）
    3. 定义成员内部类后，必须使用外部类对象来创建内部类对象，即 内部类 对象名 = 外部类.new 内部类();
    4. 如果外部类和内部类具有相同的成员变量或方法，内部类默认访问自己的成员变量或方法，如果访问外部类的成员变量，可以使用 this 关键字。如上述代码中：a.this

    注：成员内部类不能包含 static 的变量和方法，因为成员内部类需要先创建了外部类，才能创建它自己的。

- 静态内部类

        //People.java
        //外部类People
        //静态内部类
        public class People{
            private String name = "LiLei";  //外部类的私有属性

            /*外部类的静态变量。
            Java 中被 static 修饰的成员称为静态成员或类成员。它属于整个类所有，而不是某个对象所有，即被类的所有对象所共享。静态成员可以使用类名直接访问，也可以使用对象名进行访问。
            */

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

    静态内部类是static修饰的是内部类，这种内部类的特点四：

    1. 静态内部类不能直接访问外部类的非静态成员，但可以通过 new 外部类().成员 的方式访问
    2. 如果外部类的静态成员与内部类的成员名称相同，可以通过 类名.静态成员 访问外部类的静态成员；如果外部类的静态成员与内部类的成员名称不相同，则可通过 成员名 直接调用外部类的静态成员
    3. 创建静态内部类的对象时，不需要外部类的对象，可以直接创建：内部类 对象名 = new 内部类();

- 局部内部类

    局部内部类，是指内部类定义在方法和作用域内。

    例如：

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

    局部内部类也像别的类一样进行编译，但只是作用域不同而已，只在该方法或条件的作用域才能使用，退出这些作用域后无法使用。

- 匿名内部类

    匿名内部类，顾名思义，就是没有名字的内部类。正因为没有名字，所以匿名内部类只能使用一次，它通常用来简化代码编写。但使用匿名内部类还有个前提条件：必须继承一个父类或实现一个接口。

    例如：

        // Outer.java
        public class Outer {

            public Inner getInner(final String name, String city) {
                return new Inner() {
                    private String nameStr = name;
                    public String getName() {
                        return nameStr;
                    }
                };
            }

            public static void main(String[] args) {
                Outer outer = new Outer();
                Inner inner = outer.getInner("Inner", "NewYork");
                System.out.println(inner.getName());
            }
        }
        interface Inner {
            String getName();
        }

    匿名内部类是不能加访问修饰符的。要注意的是，new 匿名类，这个类是要先定义的, 如果不先定义，编译时会报错该类找不到。

    同时，在上面的例子中，当所在的方法的形参需要在内部类里面使用时，该形参必须为 final。这里可以看到形参 name 已经定义为 final 了，而形参 city 没有被使用则不用定义为 final。

    然而，因为匿名内部类没名字，是用默认的构造方法的，无参数的，如果需要该类有带参数的构造方法，示例如下：

        public Inner getInner(final String name, String city) {
            return new Inner(name, city) {
                private String nameStr = name;

                public String getName() {
                return nameStr;
                }
            };
        }

    注意这里的形参 city，由于它没有被匿名内部类直接使用，而是被抽象类 Inner 的构造方法所使用，所以不必定义为 final。

- package

    为了更好的组织类，Java 提供了包机制，用于区别类名的命名空间。

    #### 包的作用

    + 把功能类似或相关的类或接口组织在同一个包中，方便类的查找和使用
    + 包采用了树形目录的存储方式。同一个包中的类名字是不同的，不同的包中的类的名字是可以相同的，当同时调用两个不同包中的相同类名的类时，应该加上包名加以区别
    + 包也限定了访问权限，拥有包访问权限的类才能访问某个包中的类

    定义语法：

        package 包名
        //注意：必须放在源程序的第一行，包名可用 "." 号隔开

    例如：

        //在定义文件的时候利用 "/" 来区分层次
        //包中用 "." 来区分层
        package com.shiyanlou.java

    不仅是我们这样利用包名来区分类，系统也是这样做得。

        //系统中的包
        java.(功能).(类)
        java.lang.(类)  包含Java语言基础的类
        java.util.(类)  包含Java语言各种工具类
        java.io.(类)    包含输入、输出相关功能的类
    
    #### 如何在不同包中使用另一个包中的类？

        使用 import 关键字。比如导入包 com.shiyanlou 下 People 这个类，import com.shiyanlou.Peolple;。同时如果 import com.shiyanlou.*; 这是将包下的所有文件都导入进来，* 是通配符。

    #### 包的命名规范是全小写字母拼写

**** 1. 面向对象的思想，体现的是人所关注的信息聚集在了一个具体的物体上。人们就是通过对象的"属性"和"行为"来了解对象。


# 常用类

&emsp;&emsp;Java 类库提供了不少常用类，可以在编程中直接调用使用。本节讲重点讲解 Arrays、StringBuilder、Calendar、Date、Math、System、Random 类以及类的常用方法。<br>

- Arrays

    Arrays 类包含用于操作数组的各种方法（例如排序和搜索）。还包含一个静态工厂，允许将数组转为 List。

    <T> List<T> asList(T... a)	返回由指定数组构造的 List

    void sort(Object[] a)	对数组进行排序

    void fill(Object[] a, Object val)	为数组的所有元素都赋上相同的值

    boolean equals(Object[] a, Object[] a2)	检查两个数组是否相等

    int binarySearch(Object[] a, Object key)	对排序后的数组使用二分法查找数据


- StringBuilder

    StringBuilder 类是可变的。它是String对等类，它可以增加和编写字符的可变序列，并且能够将字符插入到字符串中间或附加到字符串末尾（当然是不用创建其他对象的）。

    StringBuilder的构造方法：

        StringBuilder()	构造一个其中不带字符的 StringBuilder，其初始容量为 16 个字符
        StringBuilder(CharSequence seq)	构造一个 StringBuilder，它包含与指定的 CharSequence 相同的字符
        StringBuilder(int capacity)	构造一个具有指定初始容量的 StringBuilder
        StringBuilder(String str)	并将其内容初始化为指定的字符串内容

    StringBuilder 类的常用方法：

        insert(int offsetm,Object obj)	StringBuilder	在 offsetm 的位置插入字符串 obj
        append(Object obj)	StringBuilder	在字符串末尾追加字符串 obj
        length()	int	确定 StringBuilder 对象的长度
        setCharAt(int index,char ch)	void	使用 ch 指定的新值设置 index 指定的位置上的字符
        toString()	String	转换为字符串形式
        reverse()	StringBuilder	反转字符串
        delete(int start, int end)	StringBuilder	删除调用对象中从 start 位置开始直到 end 指定的索引（end-1）位置的字符序列
        replace(int start, int end, String str)	StringBuilder	使用一组字符替换另一组字符。将用替换字符串从 start 指定的位置开始替换，直到 end 指定的位置结束

- Calendar

    在早期的JDK版本中，Date类附有两大功能：

        1. 允许用年、月、日、时、分、秒来解释日期。
        2. 允许对表示日期的字符串进行格式化和句法分析。
        
    在 JDK1.1 中提供了类 Calender 来完成第一种功能，类 DateFormat 来完成第二项功能。DateFormat 是Java.text 包中的一个类。与Date类有所不同的是，DateFormat类可以接受用各种语言和不同习惯表示的日期字符串。

    但是 Calendar 类是一个抽象类，它完成Date类与普通日期表示法之间的转换，而我们更多的是使用Calendar类的子类 GregorianCalendar 。它实现了世界上普遍使用的公历系统。当我们也可以继承Calendar类，然后自己定义实现日历方法。

    GregorianCalendar 的构造函数：

        GregorianCalendar()	创建的对象中的相关值被设置成指定时区，缺省地点的当前时间，即程序运行时所处的时区、地点的当前时间
        GregorianCalendar(TimeZone zone)	创建的对象中的相关值被设置成指定时区 zone，缺省地点的当前时间
        GregorianCalendar(Locale aLocale)	创建的对象中的相关值被设置成缺省时区，指定地点 aLocale 的当前时间
        GregorianCalendar(TimeZone zone,Locale aLocale)	创建的对象中的相关值被设置成指定时区，指定地点的当前时间

    TimeZone 是 java.util 包中的一个类，其中封装了有关时区的信息。每一个时区对应一组 ID。类 TimeZone 提供了一些方法完成时区与对应 ID 两者之间的转换。

    例如：

        //太平洋时区的 ID 为 PST
        TimeZone tz0 = TimeZone.getTimeZone("PST")
        //getDefault()可以获取主机所处时区的对象
        TimeZone tz1 = TimeZone.getDefault()

    Locale 只是一种机制，它用来标识一个特定的地理、政治或文化区域获取一个 Locale 对象的构造方法。

        //调用Locale类的构造方法
        Locale l0 = new Locale(String language)
        Locale l1 = new Locale(String language, String country)
        Locale l2 = new Locale(String languge, String country, String variant)

        //调用Locale类中定义的常量
        Locale  l1 = Locale.CHINA
    

- Date

    Date类表示日期和时间，里面封装了操作日期和时间的方法。Date类经常用来获取系统当前时间。

    Date() 构造一个 Date 对象并对其进行初始化以反映当前时间
    
    Date(long date)	构造一个 Date 对象，并根据相对于 GMT 1970 年 1 月 1 日 00:00:00 的毫秒数对其进行初始化

- Math

    Math 类在 java.lang 包中，包含用于执行基本数学运算的方法，比如初等指数、对数、平方根和三角函数。
    |  方法   | 返回值  | 功能描述  |
    |  :----:  | :----:  | :----:  |
    | sin(double numvalue)  | double | 计算角 numvalue 的正弦值  |
    |  cos(double numvalue) | double | 计算角 numvalue 的余弦值  |
    | pow(double a, double b)  | double | 计算 a 的 b 次方  |
    | sqrt(double numvalue)  | double | 计算给定值的正平方根  |
    | ceil(double numvalue)  | double | 返回大于等于 numvalue 的最小整数值  |
    | abs(int numvalue)  | int | 计算 int 类型值 numvalue 的绝对值，也接收 long、float 和 double 类型的参数  |
    | floor(double numvalue)  | double | 返回小于等于 numvalue 的最大整数值  |
    | max(int a, int b)  | int | 返回 int 型 a 和 b 中的较大值，也接收 long、float 和 double 类型的参数  |
    | min(int a, int b)  | int | 返回 a 和 b 中的较小值，也可接受 long、float 和 double 类型的参数 |
    | rint(double numvalue)  | double | 返回最接近 numvalue 的整数值 |
    | round(T arg)  | arg 为 double 时返回 long，为 float 时返回 int | 返回最接近 arg 的整数值 |
    | random()  | double | 返回带正号的 double 值，该值大于等于 0.0 且小于 1.0 |

    上面都是一些常用方法，如果用到如极坐标、对数等，就可以去查一查手册！

- Ssystem

    System 类提供了以下功能：
    + 标准输入，标准输出和错误输出流；
    + 访问外部定义的属性和环境变量；
    + 加载文件和库的方法；
    + 以及用于快速复制数组的实用方法。

    System 不可以被实例化，只可以使用其静态方法。例：
    ```java
    //从指定的源数组中复制一个数组，从源数组指定的位置开始，到目标数组指定的位置
    public static void arrarycopy(Object src, int srcPos, Object dest, int desPos, int length)
    //返回以毫秒为单位的当前时间（从1970年到现在的毫秒数）
    public static long currentTimeMillis()
    //终止当前正在运行的 Java 虚拟机 status 为 0 时推出
    public static void exit(int status)
    // 运行垃圾收集器
    public static void gc()
    // 取得当前系统的全部属性
    public static Properties getProperties()
    // 获取指定键的系统属性
    public static String getProperty(String key)
    ```
- Random

    Random 类用于生成伪随机数流，在 java.util 包下。
    

