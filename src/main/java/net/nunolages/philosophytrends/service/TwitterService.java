package net.nunolages.philosophytrends.service;

import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Service;

@Service
public class TwitterService {
	
	public SearchResults tweetSearch(Twitter twitter, String searchText) {
		return twitter.searchOperations().search(searchText);
	}
	
	
	
}