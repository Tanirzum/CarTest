package Jeep;

import PackageOne.Car;

public class Touareg implements Car {

    @Override
    public void place() {
        System.out.println("4 - местный Touareg");
    }

    @Override
    public void engine() {
        System.out.println("Мотор v6");
    }

    @Override
    public void forces() {
        System.out.println("253 лошадных сил");
    }

    @Override
    public void exhaustPipe() {
        System.out.println("Выхлопная труба от Volkswagen");
    }
}

