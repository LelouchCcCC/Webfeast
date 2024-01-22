package com.zhangyuhan.onlineorder.hello;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Person sayHello(@RequestParam(required = false) String locale) {
        locale = (locale == null) ? "en-US" : locale;
        Faker faker = new Faker(new Locale(locale));
        String name = faker.name().fullName();
        String company = faker.company().name();
        String street = faker.address().streetAddress();
        String city = faker.address().city();
        String state = faker.address().state();
        String bookTitle = faker.book().title();
        String bookAuthor = faker.book().author();
        String template = "This is %s. I work at %s. I live at %s in %s %s. My favorite book is %s by %s.";
        return new Person(name, company, new Address(street, city, state, null), new Book(bookTitle, bookAuthor));
//        return "ok";
    }

    @GetMapping("/goodbye")
    public String sayGoodbye() {
        return "Hello Goodbye!";
    }
}
