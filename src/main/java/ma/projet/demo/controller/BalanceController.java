package ma.projet.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BalanceController {
	
	@GetMapping("/myBalance")
	public String showMyBalancePage() {
		return "myBalance";
	}

}
