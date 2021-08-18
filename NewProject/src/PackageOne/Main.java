package PackageOne;

import Sedan.*;

public class Main {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes();
        Bmw bmw = new Bmw();
        Volvo volvo = new Volvo();
        mercedes.engine();
        bmw.exhaustPipe();
        volvo.place();
    }
}
