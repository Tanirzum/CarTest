package Sedan;

import PackageOne.Car;
import PackageOne.CarInterior;

public class Mercedes implements Car, CarInterior {

    @Override
    public void place() {
        System.out.println("4 - местный Mercedes");
    }

    @Override
    public void engine() {
        System.out.println("Мотор v6");
    }

    @Override
    public void forces() {
        System.out.println("271 лошадных сил");
    }

    @Override
    public void exhaustPipe() {
        System.out.println("Выхлопная труба от AMG");
    }
    @Override
    public void сarInterior() {
        System.out.println("Кожанный интерьер");
    }

    @Override
    public void wheelCar() {
        System.out.println("Велюрный руль");
    }

    @Override
    public void transmissionCar() {
        System.out.println("Коробка автомат");
    }
}
