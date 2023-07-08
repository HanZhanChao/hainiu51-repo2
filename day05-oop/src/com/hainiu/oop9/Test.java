package com.hainiu.oop9;

/**
 * @author HaiNiu
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Cat cat = new Cat();
//        useCat(cat);
        usePet(cat);

        Dog dog = new Dog();
//        useDog(dog);
        usePet(dog);

        usePet(new Monkey());

        System.out.println("---------");


        // 注意: 强制类型转换 只能将对象转成本来的数据类型
//        Cat c = (Cat) pet; // ClassCastException 类型转换异常

        Pet pet = new Dog(); // 向上转型
        // instanceof 检测左边的对象是不是右边的类型 右边的子类型
        System.out.println(pet instanceof Dog);
        System.out.println(pet instanceof Pet);
        System.out.println(pet instanceof Cat);

        System.out.println("---------");
        // 先判断是不是这个类型，再强转
        if (pet instanceof Dog) {
            Dog d = (Dog) pet; // 向下转型
            d.eat();
            d.play();
        }
        if (pet instanceof Cat) {
            Cat c = (Cat) pet;
            c.eat();
        }

    }

    /*
    // 定义一个方法 养宠物 猫
    public static void useCat(Cat cat) { // 传递的参数是Cat类的对象  Cat cat = new Cat();
        cat.eat();
    }

    // 定义一个方法 养宠物 狗
    public static void useDog(Dog dog) { // 传递的参数是Dog类的对象  Dog dog = new Dog();
        dog.eat();
    }
    */

    // 方法的参数是父类型，该父类的所有子类对象都可以传递过来 参与操作
    public static void usePet(Pet pet) { // 多态 Pet pet = cat;  Pet pet = dog;
        pet.eat(); // 执行子类重写的方法
    }
}
