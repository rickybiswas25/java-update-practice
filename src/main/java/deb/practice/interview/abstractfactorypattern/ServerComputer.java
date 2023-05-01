package deb.practice.interview.abstractfactorypattern;

/**
 * Created by Deb
 * Date : 5/1/2023
 */
public class ServerComputer extends Computer {

    public ServerComputer(String ram, String hdd) {
        super(ram, hdd);
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }
}
