package deb.practice.interview.abstractfactorypattern.factory;

import deb.practice.interview.abstractfactorypattern.Computer;
import deb.practice.interview.abstractfactorypattern.PcComputer;

/**
 * Created by Deb
 * Date : 5/1/2023
 */
public class PcFactory implements ComputerFactory {
    private final String ram;
    private final String hdd;

    public PcFactory(String ram, String hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer() {
        return new PcComputer(this.ram, this.hdd);
    }
}
