package vegetable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import vegetable.model.VegetableModel;
import vegetable.service.VegetableService;

@RestController
public class VegetableController {
	@Autowired
	VegetableService jeevi;
	@GetMapping("/gop")
	public List<VegetableModel>saveInfo(){
		return jeevi.saveInfo();
	}
	@PostMapping("/mon")
	public VegetableModel sub(@RequestBody VegetableModel d)
	{
		return jeevi.sub(d);
	}
	@PutMapping("/log")
	public VegetableModel dub(@RequestBody VegetableModel d)
	{
		return jeevi.dub(d);
	}
	@DeleteMapping("/del/{vin}")
	public void delete(@PathVariable("vin") int price) {
		jeevi.del(price);
	}

}
