package designpatterns.prototype;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Resume resume = new Resume("大鸟");
        resume.setPersionInfo("男",25);
        resume.setWorkExperience("2007-2009","阿里巴巴");
        Resume clone = resume.clone();
        System.out.println(clone == resume);
        System.out.println(clone.getWork() == resume.getWork());

        Resume deepClone = resume.deepClone();
        System.out.println(deepClone == resume);
        System.out.println(deepClone.getWork() == resume.getWork());
    }

}
