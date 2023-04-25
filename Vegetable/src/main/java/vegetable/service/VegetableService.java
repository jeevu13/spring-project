package vegetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vegetable.model.VegetableModel;
import vegetable.repository.VegtableRepository;

@Service
public class VegetableService {
@Autowired
VegtableRepository jj;
public List<VegetableModel>saveInfo()
{
	return jj.findAll();
}
public VegetableModel sub(VegetableModel d) {
	return jj.save(d);
}
public VegetableModel dub(VegetableModel d) {
	return jj.save(d);
}
public void del(int price)
{
	jj.deleteById(price);
}
}
