package au.zinoveva.lesson1;

import com.google.gson.Gson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    private static final Person person = new Person("Василий", "Васильев", 23);

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Gson gson = new Gson();
        String rs = gson.toJson(person);
        System.out.println(rs);
    }
}
