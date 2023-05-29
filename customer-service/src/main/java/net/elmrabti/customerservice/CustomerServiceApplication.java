package net.elmrabti.customerservice;

import net.elmrabti.customerservice.entities.Customer;
import net.elmrabti.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerServiceApplication implements CommandLineRunner {
	@Autowired
	private CustomerRepository customerRepository ;

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		customerRepository.save(new Customer(null, "Ensias", "contact@ensias.ma")) ;
		customerRepository.save(new Customer(null, "Emi", "contact@emi.ma")) ;
		customerRepository.save(new Customer(null, "Insea", "contact@insea.ma")) ;

	}


}
