package io.arukas

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.{EnableAutoConfiguration, SpringBootApplication}
import org.springframework.context.annotation.{ComponentScan, Configuration}

/*@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
class BootScalaApplication

object SpringBootScalaApplication {

  def main(args: Array[String]) {
    SpringApplication.run(classOf[BootScalaApplication])

  }

}*/

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
class BootScalaApplication

object SpringBootScalaApplication extends App {

  SpringApplication.run(classOf[BootScalaApplication])

}
