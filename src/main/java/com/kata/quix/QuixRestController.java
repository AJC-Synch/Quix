package com.kata.quix;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class QuixRestController {

	@GetMapping(path = "/execute")
	public String Quiz() {
		return "Algo"; 
	}
	
	@GetMapping(path = "/result-bean")
	public String QuizBean() {
		new QuixBean();
		return QuixBean.transformerNumber(7);
	}
	@GetMapping(path = "/kata")
	public String QuizAll() {
		ArrayList<Integer> list= new ArrayList();
		String res = "";
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(51);
		list.add(53);
		list.add(33);
		list.add(33);
		list.add(15);
		new QuixBean();
		
		for(Integer l:list) {
		
			res = res.concat(l.toString()+"   ------->   \n\r");
			res = res.concat(QuixBean.transformerNumber(l));
			res = res.concat("    *******     \n" +
					"\n\r");
		}
		return res;
	}

}


