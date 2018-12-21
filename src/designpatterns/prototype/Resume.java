package designpatterns.prototype;

import java.io.*;

/**
 * 简历类
 * @author lch
 */
public class Resume implements Serializable,Cloneable {

    private static final long serialVersionUID = -8712470055053214704L;

    private String name;

    private String sex;

    private int age;

    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    public void setPersionInfo(String sex,int age){
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String workDate,String company) {
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    public void display(){
        System.out.println(String.format("%s %s %s",name,sex,age));
        System.out.println(String.format("工作经历: %s %s",work.getWorkDate(),work.getCompany()));
    }

    @Override
    public Resume clone() throws CloneNotSupportedException {
        return (Resume)super.clone();
    }

    public Resume deepClone() throws IOException, ClassNotFoundException {
        //将对象写到流里
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        //从流里读出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (Resume) oi.readObject();

    }

    public WorkExperience getWork() {
        return work;
    }
}
