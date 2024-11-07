package StudentData;

public class Student {

	int sid; String iname; char igen;
	
	void student() {
		System.out.println("Please wait your data is loading "+sid+" "+iname+" "+igen);
	}
	
	Student(int id, String name, char gen){
		sid=id;
		iname=name;
		igen=gen;
	}
	Student(){
		sid=202;
		iname="Kiran";
		igen='M';
	}
}
