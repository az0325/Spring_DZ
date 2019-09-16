package pack01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Tiger {

	@RequestMapping("/t1")
	public String func01() {
		System.out.println("함수 콜\n");
		return null;
	}

	@RequestMapping("/t2")
	public String func02() {
		System.out.println("함수 콜\n");
		return "TigerView";
	}

	// Get 전송 방식
	// ?name=value 를 받아온다. -> @RequestParam
	@RequestMapping("/t3")
	public String func03(@RequestParam(value = "name") String n) {
		System.out.println(n);
		return "TigerView";
	}

	@RequestMapping("/t4")
	public String func04(@RequestParam(value = "name") String n, @RequestParam(value = "age") int i) {
		System.out.println("name : " + n + ", age : " + i);
		return "TigerView";
	}

	// @RequestParam은 속성을 사용하는 방법이 여러가지가 있음
	@RequestMapping("/t5")
	public String func05(@RequestParam(value = "name") String n, @RequestParam(value = "age") int i, Model model) {
		System.out.println("name : " + n + ", age : " + i);
		model.addAttribute("name", n);
		model.addAttribute("age", i);
		model.addAttribute("salary", 999);
		return "TigerView";
	}

	@RequestMapping("/t6")
	public String func06(@RequestParam(value = "name") String n, @RequestParam(value = "age") int i,
			HttpServletRequest r) {
		System.out.println("name : " + n + ", age : " + i);
		String name = r.getParameter(n);
		return "TigerView";
	}

	// Model과 View를 같이 넘기겠다
	@RequestMapping("/t7")
	public ModelAndView func07() {
		System.out.println("함수 콜\n");

		String s;
		if (true) {
			s = "TigerView";
		} else {
			s = "LionView";
		}

		ModelAndView mv = new ModelAndView(s);
		mv.addObject("name", "이순신");
		mv.addObject("age", 100);
		return mv;
	}
}