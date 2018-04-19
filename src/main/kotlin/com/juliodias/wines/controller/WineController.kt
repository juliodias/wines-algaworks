package com.juliodias.wines.controller

import javax.xml.ws.RequestWrapper
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping

@Controller
@RequestMapping("wines")
class WineController

@GetMapping("new")
fun new() : String {
	return "wines/new"	
}