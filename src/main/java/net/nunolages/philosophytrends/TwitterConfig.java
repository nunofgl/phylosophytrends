package net.nunolages.philosophytrends;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.SocialConfigurer;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.twitter.connect.TwitterConnectionFactory;

@Configuration
public class TwitterConfig implements SocialConfigurer {
	
	// As documented at https://docs.spring.io/spring-social-twitter/docs/1.1.2.RELEASE/reference/htmlsingle/

    @Override
    public void addConnectionFactories(ConnectionFactoryConfigurer cfConfig, Environment env) {
        cfConfig.addConnectionFactory(new TwitterConnectionFactory(
            env.getProperty("nunolages.consumerKey"),
            env.getProperty("nunolages.consumerSecret")));
    }

	@Override
	public UserIdSource getUserIdSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsersConnectionRepository getUsersConnectionRepository(ConnectionFactoryLocator arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}