package com.entity;

public class Cart {
	
private int CID;
private int BID;
private int UID;
private String BookName;
private String Author;
private int Price;
private int Total;
public int getCID() {
	return CID;
}
public void setCID(int cID) {
	CID = cID;
}
public int getBID() {
	return BID;
}
public void setBID(int bID) {
	BID = bID;
}
public int getUID() {
	return UID;
}
public void setUID(int uID) {
	UID = uID;
}
public String getBookName() {
	return BookName;
}
public void setBookName(String bookName) {
	BookName = bookName;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
public int getTotal() {
	return Total;
}
public void setTotal(int total) {
	Total = total;
}

}
