package POJO;

import java.util.List;
import POJO.Book;

public class POJOcomplex {
	 public String userID;
	    public String userName;
	    public List<Book> books;
		public String getUserID() {
			return userID;
		}
		public void setUserID(String userID) {
			this.userID = userID;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public List<Book> getBooks() {
			return books;
		}
		public void setBooks(List<Book> books) {
			this.books = books;
		}
}
