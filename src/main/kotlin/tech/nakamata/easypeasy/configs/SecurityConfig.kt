package tech.nakamata.easypeasy.configs

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.web.util.matcher.AntPathRequestMatcher

@EnableWebSecurity
@Configuration
class SecurityConfig : WebSecurityConfigurerAdapter(false) {
  override fun configure(web: WebSecurity?) {
    web!!.ignoring().antMatchers("/webjars/**")
  }
  
  override fun configure(http: HttpSecurity?) {
    http!!.authorizeRequests()
        .antMatchers("/webjars/∗∗").permitAll()
        .antMatchers("/css/∗∗").permitAll()
        .antMatchers("/").permitAll()
        .antMatchers("/login").permitAll()
        .anyRequest().authenticated()
        .and().formLogin()
        .loginProcessingUrl("/login")
        .loginPage("/login")
        .failureUrl("/login")
        .usernameParameter("user")
        .passwordParameter("pass")
        .defaultSuccessUrl("/home", true)
        .and()
        .httpBasic()
    
    http.logout()
        .logoutRequestMatcher(AntPathRequestMatcher("/logout"))
        .logoutUrl("/logout")
        .logoutSuccessUrl("/login?logout")
  }
}