package deb.practice.interview.abstractfactorypattern;

import deb.practice.interview.abstractfactorypattern.factory.ComputerFactory;
import deb.practice.interview.abstractfactorypattern.factory.PcFactory;
import deb.practice.interview.abstractfactorypattern.factory.ServerFactory;

/**
 * Created by Deb
 * Date : 5/1/2023
 */
public class Start {

    public static void main(String[] args) {
        ComputerFactory pcFactory = new PcFactory("16GB", "128GB");
        ComputerFactory serverFactory = new ServerFactory("512GB", "1TB");

        pcFactory.createComputer();
        serverFactory.createComputer();
    }
}
