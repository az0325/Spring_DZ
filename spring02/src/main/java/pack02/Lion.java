package pack02;

import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pack01.Apple;

@Controller
public class Lion {

	@RequestMapping("/t9")
	public String func01() {
		return "LionView";
	}

	@RequestMapping("/t10")
	public String func02() {
		return "v1/Giraffe";
	}

	@RequestMapping("/t11")
	public void func03(@RequestParam(value = "add") String add, @RequestParam(value = "age") int age) {
		System.out.println(add);
		System.out.println(age);
	}

	@RequestMapping("/t12")
	public void func04(HttpServletRequest r) {
		String add = r.getParameter("add");
		String age = r.getParameter("age");
	}

	// 커맨드 방식
	@RequestMapping("/t13")
	public void func05(Apple a) {
		System.out.println(a.getAdd());
		System.out.println(a.getAge());
	}

	@RequestMapping("/t14")
	public String func06(Model model) {
		String[] ar = new String[10];
		ar[0] = "tiger00";
		ar[1] = "tiger01";
		ar[2] = "tiger02";
		ar[3] = "tiger03";
		model.addAttribute("ar", ar);

		return "LionView";
	}

	@RequestMapping("/t15")
	public String func07(Model model) {
		Apple app = new Apple("산토끼", 20);
		model.addAttribute("app", app);
		return "LionView";
	}

	@RequestMapping("/t16")
	public String func08(Model model) {
		Apple[] a = new Apple[4];
		a[0] = new Apple("산토끼", 20);
		a[1] = new Apple("들토끼", 40);
		a[2] = new Apple("바토끼", 60);
		a[3] = new Apple("다토끼", 80);
		model.addAttribute("a", a);

		return "LionView";
	}

	@RequestMapping("/t17")
	public String func09(Model model) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("tiger00");
		list.add("tiger01");
		list.add("tiger02");
		list.add("tiger03");
		list.add("tiger04");
		model.addAttribute("list", list);
		return "LionView";
	}

	@RequestMapping("/t18")
	public String func10(Model model) {
		LinkedList<Apple> li = new LinkedList<Apple>();
		for (int a = 0; a < 4; a++) {
			Apple app = new Apple("호랑이" + a, a * 2 + 1);
			li.add(app);
		}
		model.addAttribute("li", li);
		return "LionView";
	}
}
