
package com.startdima.test.chapter2.file.serialize;
import java.io.Serializable;

/**
 * 
 * @ClassName Person
 * @Description 序列化对象
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月23日 下午4:00:00
 *
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 222932318151524348L;
    // 序列化ID指定保证在对象属性改变时序列化数据的可读取性
    // 对象序列化时会自动分配序列化ID并写入
    private int age;
    private String name;
    private String sex;
    // private int test;
    
    public Person() {}
    
    public Person(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "[int = " + age + ", name = " + name + ", sex = " + sex + "]";
        // return "[int = " + age + ", name = " + name + ", sex = " + sex + ",test = "+test + "]";
    }

    
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}