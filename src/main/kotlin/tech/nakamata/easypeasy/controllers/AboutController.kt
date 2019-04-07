package tech.nakamata.easypeasy.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import tech.nakamata.easypeasy.controllers.base.AbstractController

@Controller
class AboutController : AbstractController() {
  @ModelAttribute("module")
  override fun module(): String {
    return "about"
  }
  
  @GetMapping("/about")
  fun getWorks(): String {
    return "pages/about/index"
  }
  
}