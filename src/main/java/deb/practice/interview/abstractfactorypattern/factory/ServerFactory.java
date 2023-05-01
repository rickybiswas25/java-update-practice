package deb.practice.interview.abstractfactorypattern.factory;

import deb.practice.interview.abstractfactorypattern.Computer;
import deb.practice.interview.abstractfactorypattern.ServerComputer;

/**
 * Created by Deb
 * Date : 5/1/2023
 */
public class ServerFactory implements ComputerFactory {
    private final String hdd;
    private final String ram;

    public ServerFactory(String ram, String hdd) {
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public Computer createComputer() {
        return new ServerComputer(this.ram, this.hdd);
    }
}
