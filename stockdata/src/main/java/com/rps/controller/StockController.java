package com.rps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class StockController {
	
	@GetMapping("/stocks")
	//@RequestMapping(path="/stocks",method=RequestMethod.GET)
	//@ResponseBody
	public String stockData() {
		return "Here is stock data";
	}

}
