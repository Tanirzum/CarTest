package Jeep;

import PackageOne.Car;

public class Hummer implements Car {
    @Override
    public void place() {
        System.out.println("4 - местный Hummer");
    }

    @Override
    public void engine() {
        System.out.println("Мотор v10");
    }

    @Override
    public void forces() {
        System.out.println("456 лошадных сил");
    }

    @Override
    public void exhaustPipe() {
        System.out.println("Выхлопная труба от Hummer");
    }
}
