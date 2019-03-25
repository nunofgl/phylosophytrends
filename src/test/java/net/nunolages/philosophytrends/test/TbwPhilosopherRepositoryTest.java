package net.nunolages.philosophytrends.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.nunolages.philosophytrends.domain.TbwPhilosopher;
import net.nunolages.philosophytrends.repository.ITbwPhilosopherRepository;

@SpringBootTest
public class TbwPhilosopherRepositoryTest {
	
	@Autowired
	private ITbwPhilosopherRepository tbwPhilosopherHome;

	
	@Test
	public void findByIdTest() {
		
		TbwPhilosopher expectedTbwPhilosopher = new TbwPhilosopher(1, "David Hume"); 
		
		TbwPhilosopher actualTbwPhilosopher = tbwPhilosopherHome.findById(1).get();
		
		assertThat(actualTbwPhilosopher, samePropertyValuesAs(expectedTbwPhilosopher));
	}
}
