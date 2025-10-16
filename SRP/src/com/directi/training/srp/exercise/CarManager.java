package com.directi.training.srp.exercise;

import java.util.List;

import com.directi.training.srp.exercise.utils.Compare;
import com.directi.training.srp.exercise.utils.Parser;

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
        return Parser.parseToString(cars);
    }

    public Car getBestCar()
    {
        List<Car> cars = carRepository.getAll();
        return Compare.compareByModel(cars);
    }
}