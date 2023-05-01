package deb.practice.interview.abstractfactorypattern;

/**
 * Created by Deb
 * Date : 5/1/2023
 */
public abstract class Computer {
    protected final String ram;
    protected final String hdd;

    public Computer(String ram, String hdd) {
        System.out.printf("Creating computer using ram %s and %s hdd%n", ram, hdd);
        this.ram = ram;
        this.hdd = hdd;
    }

    public abstract String getRam();

    public abstract String getHdd();
}
