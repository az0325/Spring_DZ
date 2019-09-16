package pack01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Tiger {
	
	@RequestMapping("/t1")
	public String func01() {
		System.out.printf("함수 콜\n");
		return null;
	}
	
	@RequestMapping("/t2")
	public String func02() {
		System.out.printf("함수 콜\n");
		return "TigerView";
	}
}