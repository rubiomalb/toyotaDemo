package com.elasticbox.usecases.model.dao;

import java.util.List;

import com.elasticbox.usecases.model.entities.Accesory;

public interface AccesoryDAO {
	public List<Accesory> getAllAccesoriesByCarId(long carId);
}
