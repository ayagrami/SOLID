package com.directi.training.srp.exercise.utils;

import java.util.List;

import com.directi.training.srp.exercise.Car;

public class Compare {
    public static Car compareByModel(List<Car> cars) {
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
    
}
