package designpatterns.facade;

/**
 * 门面类
 * @author lch
 */
public class Computer {

    private Cpu cpu;

    private Disk disk;

    private Memory memory;

    public Computer() {
        cpu = new Cpu();
        disk = new Disk();
        memory = new Memory();
    }

    public void start(){
        System.out.println("computer start begin");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("computer start end");
    }

    public void shutdown(){
        System.out.println("computer shutdown begin");
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
        System.out.println("computer shutdown end");
    }

}
