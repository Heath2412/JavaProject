package hello;

import repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloImpl implements IHello {
    @Autowired
    private SanPhamRepository sanphamRepository;
    public void setClothingRepository(SanPhamRepository sanphamRepository){
        this.sanphamRepository = sanphamRepository;
    }
    
	public String sayHello() {
		return "Hello the world" + sanphamRepository.getAll().size();
	}

}
