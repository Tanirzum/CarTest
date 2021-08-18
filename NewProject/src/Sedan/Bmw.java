package Sedan;

import PackageOne.Car;
import PackageOne.CarInterior;

public class Bmw implements Car, CarInterior {
    @Override
    public void place() {
        System.out.println("2 - местный Bmw");
    }

    @Override
    public void engine() {
        System.out.println("Мотор v8");
    }

    @Override
    public void forces() {
        System.out.println("451 лошадных сил");
    }

    @Override
    public void exhaustPipe() {
        System.out.println("Выхлопная труба от Bmw e61");
    }

    @Override
    public void сarInterior() {
        System.out.println("Кожанный интерьер");
    }

    @Override
    public void wheelCar() {
        System.out.println("Кожанный руль");
    }

    @Override
    public void transmissionCar() {
        System.out.println("Коробка автомат");
    }
}
