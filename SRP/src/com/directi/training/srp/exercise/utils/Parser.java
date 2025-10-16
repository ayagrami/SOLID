package com.directi.training.srp.exercise.utils;
import java.util.List;
import com.directi.training.srp.exercise.Car;

public class Parser {
    public static String parseToString(List<Car> cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getName());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
