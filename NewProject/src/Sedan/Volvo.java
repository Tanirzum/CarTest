package Sedan;

import PackageOne.Car;
import PackageOne.CarInterior;

public class Volvo implements Car, CarInterior {
    @Override
    public void place() {
        System.out.println("5 - местный Volvo");
    }

    @Override
    public void engine() {
        System.out.println("Мотор v4");
    }

    @Override
    public void forces() {
        System.out.println("189 лошадных сил");
    }

    @Override
    public void exhaustPipe() {
        System.out.println("Выхлопная труба обычный от Volvo");
    }

    @Override
    public void сarInterior() {
        System.out.println("Велюрный интерьер");
    }

    @Override
    public void wheelCar() {
        System.out.println("Велбрный руль");
    }

    @Override
    public void transmissionCar() {
        System.out.println("Коробка механика");
    }
}
