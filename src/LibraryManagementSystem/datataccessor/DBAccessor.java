package LibraryManagementSystem.datataccessor;

import java.util.List;

import LibraryManagementSystem.book.BookCopy;

public class DBAccessor {

	public Results getBooksWithName(String bookName) {
		
	}
	public Results getBooksWithAuthorName(List<String> authors) {
		return null;
	}
	
	public Results getBooksWithBookID(int bookId) {
		return null;
		
	}
	public Results getMembersWithName(String memberName) {
		
	}
	
	public Results getMembersWithID(int memberId) {
		
	}
	public void insertBookCopy(BookCopy bookCopy) {
		
	}
	public void deleteBookCopy(BookCopy bookCopy) {
		
	}
	public void markAsBlocked(Member member) {
		
	}
	public void issueBookCopyToMember(BookCopy bookCopy, Mmeber member) {
		
	}
	public void submitBookCopyFromMember(BookCopy bookCopy, Member member) {
		
	}
	
	public boolean isCopyAvailable(BookCopy bookCopy) {
		
	}
	public Results getBoorower(BookCopy bookCopy) {
		
	}
	
	
}
