package com.elasticbox.usecases.model;

import java.util.List;

import com.elasticbox.usecases.model.entities.Accesory;
import com.elasticbox.usecases.model.entities.CarColor;
import com.elasticbox.usecases.model.entities.RimsColor;

public class UIDataList {
	private List<CarColor> carColors;
	private List<RimsColor> rimsColors;
	private List<Accesory> accesories;

	public List<CarColor> getCarColors() {
		return carColors;
	}

	public void setCarColors(List<CarColor> carColors) {
		this.carColors = carColors;
	}

	public List<RimsColor> getRimsColors() {
		return rimsColors;
	}

	public void setRimsColors(List<RimsColor> rimsColors) {
		this.rimsColors = rimsColors;
	}

	public List<Accesory> getAccesories() {
		return accesories;
	}

	public void setAccesories(List<Accesory> accesories) {
		this.accesories = accesories;
	}

}
