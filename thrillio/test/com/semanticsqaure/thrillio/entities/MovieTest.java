package com.semanticsqaure.thrillio.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.semanticsquare.thrillio.constants.MovieGenre;
import com.semanticsquare.thrillio.entities.Movie;
import com.semanticsquare.thrillio.managers.BookmarkManager;

class MovieTest {

	@Test
	void testIsKidFriendlyCriteria() {
		// Test 1: For genre - HORROR return false
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.HORROR,
				8.5);
		
		Boolean isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertFalse(isKidFriendlyCriteria, "For HORROR genre,  isKidFriendlyCriteria() should return false");

		// Test 2: For genre - THRILLERS return false
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.THRILLERS,
				8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertFalse(isKidFriendlyCriteria, "For THRILLERS genre,  isKidFriendlyCriteria() should return false");


		// Test 3: For genre - CLASSICS return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.CLASSICS,
				8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For CLASSICS genre,  isKidFriendlyCriteria() should return true");


		// Test 4: For genre - DRAMA return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.DRAMA, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For DRAMA genre,  isKidFriendlyCriteria() should return true");

		// Test 5: For genre - SCIFI_AND_FANTASY return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.SCIFI_AND_FANTASY, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For SCIFI_AND_FANTASY genre,  isKidFriendlyCriteria() should return true");
		
		// Test 6: For genre - COMEDY return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.SCIFI_AND_FANTASY, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For SCIFI_AND_FANTASY genre,  isKidFriendlyCriteria() should return true");

		// Test 7: For genre - CHILDREN_AND_FAMILY return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.CHILDREN_AND_FAMILY, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For CHILDREN_AND_FAMILY genre,  isKidFriendlyCriteria() should return true");

		// Test 8: For genre - ACTION_AND_ADVENTURE return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.ACTION_AND_ADVENTURE, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For ACTION_AND_ADVENTURE genre,  isKidFriendlyCriteria() should return true");

		// Test 9: For genre - MUSIC_AND_MUSICALS return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.MUSIC_AND_MUSICALS, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For MUSIC_AND_MUSICALS genre,  isKidFriendlyCriteria() should return true");

		// Test 10: For genre - TELEVISION return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.TELEVISION, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For TELEVISION genre,  isKidFriendlyCriteria() should return true");

		// Test 11: For genre - SPECIAL_INTEREST return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.SPECIAL_INTEREST, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For SPECIAL_INTEREST genre,  isKidFriendlyCriteria() should return true");

		// Test 12: For genre - INDEPENDENT return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.INDEPENDENT, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For INDEPENDENT genre,  isKidFriendlyCriteria() should return true");

		// Test 13: For genre - SPORTS_AND_FITNESS return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.SPORTS_AND_FITNESS, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For SPORTS_AND_FITNESS genre,  isKidFriendlyCriteria() should return true");

		// Test 14: For genre - ANIME_AND_ANIMATION return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.ANIME_AND_ANIMATION, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For ANIME_AND_ANIMATION genre,  isKidFriendlyCriteria() should return true");

		// Test 15: For genre - GAY_AND_LESBIAN return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.GAY_AND_LESBIAN, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For GAY_AND_LESBIAN genre,  isKidFriendlyCriteria() should return true");

		// Test 16: For genre - CLASSIC_MOVIE_MUSICALS return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.CLASSIC_MOVIE_MUSICALS, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For CLASSIC_MOVIE_MUSICALS genre,  isKidFriendlyCriteria() should return true");

		// Test 17: For genre - FAITH_AND_SPIRITUALITY return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.FAITH_AND_SPIRITUALITY, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For FAITH_AND_SPIRITUALITY genre,  isKidFriendlyCriteria() should return true");

		// Test 18: For genre - FOREIGN_DRAMAS return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.FOREIGN_DRAMAS, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For FOREIGN_DRAMAS genre,  isKidFriendlyCriteria() should return true");

		// Test 19: For genre - FOREIGN_ACTION_AND_ADVENTURE return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.FOREIGN_ACTION_AND_ADVENTURE, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For FOREIGN_ACTION_AND_ADVENTURE genre,  isKidFriendlyCriteria() should return true");

		// Test 20: For genre - FOREIGN_THRILLERS return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.FOREIGN_THRILLERS, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For FOREIGN_THRILLERS genre,  isKidFriendlyCriteria() should return true");

		// Test 21: For genre - TV_SHOWS return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.TV_SHOWS, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For TV_SHOWS genre,  isKidFriendlyCriteria() should return true");

		// Test 22: For genre - DRAMAS return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.DRAMAS, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For DRAMAS genre,  isKidFriendlyCriteria() should return true");

		// Test 23: For genre - ROMANTIC_MOVIES return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.ROMANTIC_MOVIES, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For ROMANTIC_MOVIES genre,  isKidFriendlyCriteria() should return true");

		// Test 24: For genre - COMEDIES return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.COMEDIES, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For COMEDIES genre,  isKidFriendlyCriteria() should return true");

		// Test 25: For genre - DOCUMENTARIES return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.DOCUMENTARIES, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For DOCUMENTARIES genre,  isKidFriendlyCriteria() should return true");

		// Test 26: For genre - FOREIGN_MOVIES return true
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" },
				MovieGenre.FOREIGN_MOVIES, 8.5);
		
		isKidFriendlyCriteria = movie.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For FOREIGN_MOVIES genre,  isKidFriendlyCriteria() should return true");

	}

}
