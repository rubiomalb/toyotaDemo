package com.elasticbox.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elasticbox.usecases.model.UIDataList;
import com.elasticbox.usecases.model.entities.Car;
import com.elasticbox.usecases.services.ToyotaConfiguratorService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ToyotaConfiguratorController {

	@Autowired
	private ToyotaConfiguratorService toyotaConfiguratorService;

	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("selectedCar", new Car());
		model.addAttribute("carsList",
				this.toyotaConfiguratorService.getAllCars());
		return "carConfigurator";
	}

	@RequestMapping("/getColors/{carId}")
	public String getColors(@PathVariable("carId") int id, Model model) {
		model.addAttribute("carColorsList",
				this.toyotaConfiguratorService.getCarColorByCarId(id));
		model.addAttribute("rimsColorsList",
				this.toyotaConfiguratorService.getRimsColorByCarId(id));
		return "carConfigurator";
	}

	@RequestMapping(value = "/car/{carId}", method = RequestMethod.GET)
	public @ResponseBody UIDataList getCarDataInJSON(
			@PathVariable("carId") long id) {

		UIDataList uiDataList = new UIDataList();
		uiDataList.setCarColors(this.toyotaConfiguratorService
				.getCarColorByCarId(id));
		uiDataList.setRimsColors(this.toyotaConfiguratorService
				.getRimsColorByCarId(id));
		uiDataList.setAccessories(this.toyotaConfiguratorService
				.getAccessoriesByCarId(id));

		return uiDataList;
	}

	@RequestMapping(value = "/configurator", method = RequestMethod.GET)
	public String getLandingPage() {
		return "redirect:/static/index.html";
	}
}
