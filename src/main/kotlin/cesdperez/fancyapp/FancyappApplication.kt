package cesdperez.fancyapp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class FancyappApplication

fun main(args: Array<String>) {
    SpringApplication.run(FancyappApplication::class.java, *args)
}
