package com.directi.training.srp.exercise;

import java.util.List;

public class CarManager
{
    private CarRepository carRepository = new CarRepository();

    public Car getFromDb(final String carId)
    {
        return carRepository.getById(carId);
    }

    public String getCarsNames()
    {
        List<Car> cars = carRepository.getAll();
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getName());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar()
    {
        List<Car> cars = carRepository.getAll();
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}