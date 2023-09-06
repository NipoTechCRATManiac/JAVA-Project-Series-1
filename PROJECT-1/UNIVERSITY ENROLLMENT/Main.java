/* Learnings 
1. super is used to act as a constructor for child class.
2. to access private variable from superclass implement a getter method in superclass and call it from child class.
3. In Java, the methods declared in an interface have an implicit default access specifier of public. This means that all 
   methods declared in an interface are accessible from any class that implements the interface, regardless of the package 
   in which those classes are defined.You do not need to explicitly use the public access specifier when declaring methods in
   an interface
4. 
*/
import java.util.Scanner;
// ******************************************************* COURSE
interface Course 
{
// public and abstract methods are created 
	String getCourseCode(String a );
	String getCourseTitle(String b);
	int getCreditHours(int c);
}
// ******************************************************* PHILOSOPHY
class philosophy implements Course{
public String code, title; public int hrs;

public philosophy(){
	code = "18PHIS2011";
	title = "THE TIMES OF THE SOCRATES";
	hrs = 21;
}

@Override // is an annotation not a keyword 
public String getCourseCode(String code){
	return code;
}

@Override
public String getCourseTitle(String title){
	return title;
}

@Override
public int getCreditHours(int hrs){
	return hrs;
}
}
// ******************************************************* DATA STRUCTURES
class datastructures implements Course{
public String code, title; public int hrs;

public datastructures(){
	code = "19DS2011";
	title = "THE NITBIT OF A COMPUTER";
	hrs = 15;
}

@Override // is an annotation not a keyword 
public String getCourseCode(String code){
	return code;
}

@Override
public String getCourseTitle(String title){
	return title;
}

@Override
public int getCreditHours(int hrs){
	return hrs;
}
}
// ******************************************************* DBMS
class DBMS implements Course{
public String code, title; public int hrs;

public DBMS(){
	code = "21DBMS2011";
	title = "THE STOREHOUSE OF DATA";
	hrs = 10;
}

@Override // is an annotation not a keyword 
public String getCourseCode(String code){
	return code;
}

@Override
public String getCourseTitle(String title){
	return title;
}

@Override
public int getCreditHours(int hrs){
	return hrs;
}
}
// ******************************************************* BIOLOGY
class biology implements Course{
public String code, title; public int hrs;

public biology(){
	code = "20BIO2012";
	title = "THE SECRETS OF HUMAN BODY";
	hrs = 55;
}

@Override // is an annotation not a keyword 
public String getCourseCode(String code){
	return code;
}

@Override
public String getCourseTitle(String title){
	return title;
}

@Override
public int getCreditHours(int hrs){
	return hrs;
}
}
// ******************************************************* FINANCE
class finance implements Course{
public String code, title; public int hrs;

public finance(){
	code = "21FIN2009";
	title = "THE PSYCHOLOGY OF RICH DAD";
	hrs = 35;
}

@Override // is an annotation not a keyword 
public String getCourseCode(String code){
	return code;
}

@Override
public String getCourseTitle(String title){
	return title;
}

@Override
public int getCreditHours(int hrs){
	return hrs;
}
}
// ******************************************************* PERSON 
abstract class Person{
public int id; public String name, email;
public Person(int id, String name, String email)
	{
	this.id = id;
	this.name = name;
	this.email = email;
	}
}
// ******************************************************* STUDENT
class Student extends Person{
public String studentID, major;
public Student(int id, String name, String email, String studentID, String major)
	{
	super(id, name, email); //this thing is acting as a constructor for its super class because the superclass is abstract.
	this.studentID = studentID;
	this.major = major;
	}
public void display()
	{
	System.out.println("ID "+id+"\n"+"Name "+name+"\n"+"Email "+email+"\n"+"studentID "+studentID+"\n"+"Major "+major);
	}
}
// ******************************************************* ENROLLMENT
class enrollment {
public void Enrollment() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the courses ");
        System.out.println("1. PHILOSOPHY");
        System.out.println("2. DATA STRUCTURES");
        System.out.println("3. DBMS");
        System.out.println("4. FINANCE");
        System.out.println("5. BIOLOGY");
        int val = scanner.nextInt();
    }
}
// ******************************************************* FACULTY
class Faculty extends Person{
public String facultyID, depart;
public Faculty(int id, String name, String email, String facultyID, String depart)
	{
	super(id, name, email);
	this.facultyID = facultyID;
	this.depart = depart;
	}
public void display()
	{
	System.out.println("ID "+id+"\n"+"Name "+name+"\n"+"Email "+email+"\n"+"FacultyID "+facultyID+"\n"+"Depart "+depart);
	}
}
// ******************************************************* MAIN
public class Main{
public static void main(String args[])
	{
  	Scanner scanner = new Scanner(System.in);
	Student s1 = new Student(1289,"Naveen","naveen@rediffmail.com","98gg","Blockchain");
	s1.display();
	}
}