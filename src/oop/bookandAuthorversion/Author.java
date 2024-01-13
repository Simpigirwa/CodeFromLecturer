package oop.bookandAuthorversion;


public class Author {
private String Name;
private String email;
public Author(String name, String email) {
	super();
	Name = name;
	this.email = email;
}
public Author() {}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Author [Name=" + Name + ", email=" + email + "]";
}

}
