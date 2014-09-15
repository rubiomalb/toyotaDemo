package com.elasticbox.usecases.services;

import java.util.List;

import com.elasticbox.usecases.model.entities.Accesory;
import com.elasticbox.usecases.model.entities.Car;
import com.elasticbox.usecases.model.entities.CarColor;
import com.elasticbox.usecases.model.entities.RimsColor;

public interface ToyotaConfiguratorService {
	public List<Car> getAllCars();
	public List<CarColor> getCarColorByCarId(long carId);
	public List<RimsColor> getRimsColorByCarId(long carId);
	public List<Accesory> getAccesoriesByCarId(long carId);
}
