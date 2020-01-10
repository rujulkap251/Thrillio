package com.semanticsqaure.thrillio.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.semanticsquare.thrillio.entities.WebLink;
import com.semanticsquare.thrillio.managers.BookmarkManager;

class WebLinkTest {

	@Test
	void testIsKidFriendlyCriteria() {
		//Test 1: porn in url --false 
		WebLink weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html",
				"http://www.javaworld.com");
		
		Boolean isKidFriendlyEligible = weblink.isKidFriendlyCriteria();
		
		assertFalse(isKidFriendlyEligible, "For porn in url - isKidFriendlyCriteria() must return false");
		
		//Test 2: porn in title -- false
		weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming porn, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		
		isKidFriendlyEligible = weblink.isKidFriendlyCriteria();
		
		assertFalse(isKidFriendlyEligible, "For porn in title - isKidFriendlyCriteria() must return false");
		
		//Test 3: adult in host -- false 
		weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.adult.com");
		
		isKidFriendlyEligible = weblink.isKidFriendlyCriteria();
		
		assertFalse(isKidFriendlyEligible, "For adult in host - isKidFriendlyCriteria() must return false");
		
		//Test 4: adult in url, but not in host -- true
		weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-adult--part-2.html",
				"http://www.javaworld.com");
		
		isKidFriendlyEligible = weblink.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyEligible, "For adult in url, but not in host - isKidFriendlyCriteria() must return true");
		
		//Test 5: adult in title only -- true
		weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming adult, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		
		isKidFriendlyEligible = weblink.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyEligible, "For adult in title only - isKidFriendlyCriteria() must return true");
		
		//Test 6: porn in host only -- true
		weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.porn.com");
		
		isKidFriendlyEligible = weblink.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyEligible, "For porn in host only - isKidFriendlyCriteria() must return true");
		
	}

}
