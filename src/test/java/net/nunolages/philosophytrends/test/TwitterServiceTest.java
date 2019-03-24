package net.nunolages.philosophytrends.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import net.nunolages.philosophytrends.TwitterConfig;
import net.nunolages.philosophytrends.TwitterTemplateCreator;
import net.nunolages.philosophytrends.service.TwitterService;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = { TwitterConfig.class })
@SpringBootTest//(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TwitterServiceTest {
	
	@Autowired
	private TwitterService twitterService;
	
	@Autowired
	private TwitterTemplateCreator twitterCreator;
	 
	@Test
	public void twitterSearchTest() {
		Twitter twitterTemplate = twitterCreator.getTwitterTemplate("nunolages");
		twitterService.tweetSearch(twitterTemplate, "David Hume");
	}
}
