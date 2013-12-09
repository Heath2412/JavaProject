package hello;

import Repository.ClothingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloImpl implements IHello {
    @Autowired
    private ClothingRepository clothingRepository;
    public void setClothingRepository(ClothingRepository clothingRepository){
        this.clothingRepository = clothingRepository;
    }
    
	public String sayHello() {
		return "Hello the world" + clothingRepository.getAll().size();
	}

}
