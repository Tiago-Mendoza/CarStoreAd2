package br.com.carstore.dto;

import java.util.List;

public class CarResponseBody {

    private List<br.com.carstore.dto.CarDTO> cars;

    public CarResponseBody(List<br.com.carstore.dto.CarDTO> allCars) {
        this.cars = allCars;
    }

    private br.com.carstore.dto.CarDTO car;

    public br.com.carstore.dto.CarDTO getCar() {
        return car;
    }

    public void setCar(br.com.carstore.dto.CarDTO car) {
        this.car = car;
    }
}
