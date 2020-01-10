package com.semanticsqaure.thrillio.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.semanticsquare.thrillio.constants.BookGenre;
import com.semanticsquare.thrillio.entities.Book;
import com.semanticsquare.thrillio.managers.BookmarkManager;

class BookTest {

	@Test
	void testIsKidFriendlyCriteria() {
		//Test 1: genre - PHILOSOPHY return false
		Book book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.PHILOSOPHY, 4.3);
		
		Boolean isKidFriendlyCriteria = book.isKidFriendlyCriteria();
		
		assertFalse(isKidFriendlyCriteria, "For PHILOSOPHY genre return false");
		
		//Test 2: genre - SELF_HELP return false
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.SELF_HELP, 4.3);
		
		isKidFriendlyCriteria = book.isKidFriendlyCriteria();
		
		assertFalse(isKidFriendlyCriteria, "For SELF_HELP genre return false");
		
		//Test 3: genre - ART return true
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.ART, 4.3);
		
		isKidFriendlyCriteria = book.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For ART genre return true");

		//Test 4: genre - BIOGRAPHY return true
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.BIOGRAPHY, 4.3);
		
		isKidFriendlyCriteria = book.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For BIOGRAPHY genre return true");
		
		//Test 5: genre - CHILDREN return true
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.CHILDREN, 4.3);
		
		isKidFriendlyCriteria = book.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For CHILDREN genre return true");
		
		//Test 6: genre - FICTION return true
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.FICTION, 4.3);
		
		isKidFriendlyCriteria = book.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For FICTION genre return true");
		
		//Test 7: genre - HISTORY return true
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.HISTORY, 4.3);
		
		isKidFriendlyCriteria = book.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For HISTORY genre return true");
		
		//Test 8: genre - MYSTERY return true
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.MYSTERY, 4.3);
		
		isKidFriendlyCriteria = book.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For MYSTERY genre return true");
		
		//Test 9: genre - RELIGION return true
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.RELIGION, 4.3);
		
		isKidFriendlyCriteria = book.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For RELIGION genre return true");
		
		//Test 10: genre - ROMANCE return true
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.ROMANCE, 4.3);
		
		isKidFriendlyCriteria = book.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For ROMANCE genre return true");
		
		//Test 11: genre - TECHNICAL return true
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.TECHNICAL, 4.3);
		
		isKidFriendlyCriteria = book.isKidFriendlyCriteria();
		
		assertTrue(isKidFriendlyCriteria, "For TECHNICAL genre return true");

	}

}
