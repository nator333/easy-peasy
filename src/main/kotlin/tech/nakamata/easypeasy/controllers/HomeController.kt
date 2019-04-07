package tech.nakamata.easypeasy.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import tech.nakamata.easypeasy.controllers.base.AbstractController


@Controller
class HomeController : AbstractController() {
  
  @ModelAttribute("module")
  override fun module(): String {
    return "home"
  }
  
  @GetMapping("/", "/home")
  fun getHome(): String {
    return "pages/home/index"
  }
  
  @GetMapping("/hello")
  fun getHello(): String {
    return "pages/hello/index"
  }
  
  @PostMapping("/hello")
  fun postHello(@RequestParam("user") user: String,
                @RequestParam("pass") pass: String,
                model: Model): String {
    model.addAttribute("user", user)
    model.addAttribute("pass", pass)
    return "pages/hello/res"
    
  }
  
}