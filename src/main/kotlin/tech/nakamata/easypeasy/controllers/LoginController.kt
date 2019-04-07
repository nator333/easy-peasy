package tech.nakamata.easypeasy.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import tech.nakamata.easypeasy.controllers.base.AbstractController

@Controller
class LoginController : AbstractController() {
  @ModelAttribute("module")
  override fun module(): String {
    return "login"
  }
  
  @GetMapping("/login")
  fun getLogin(): String {
    return "pages/login/index"
  }
  
  @PostMapping("/login")
  fun postLogin(): String {
    return "pages/login/index"
  }
  
  @GetMapping("/logout")
  fun getLogout(): String {
    return "pages/login/logout"
  }
  
  @PostMapping("/logout")
  fun postLogout(): String {
    return "pages/login/index"
  }
  
}