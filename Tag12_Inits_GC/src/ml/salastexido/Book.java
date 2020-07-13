package ml.salastexido;

public class Book {
	private String title;
	private String author;
	private String publishingCompany; //Verlag
	private int numberOfPages;//Anzahl der Seiten
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishingCompany() {
		return publishingCompany;
	}
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public Book(String title, String author, String publishingCompany, int numberOfPages) {
		this.title = title;
		this.author = author;
		this.publishingCompany = publishingCompany;
		this.numberOfPages = numberOfPages;
	}	
	
}
