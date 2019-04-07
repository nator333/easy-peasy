package tech.nakamata.easypeasy.configs

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect


@Configuration
class ThymeleafConfig {
  
  @Bean
  fun springSecurityDialect(): SpringSecurityDialect {
    return SpringSecurityDialect()
  }
}