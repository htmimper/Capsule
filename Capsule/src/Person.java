
public class Person {
	 private String name = null;
	 private int age = 0;
	 public Person (String name,int age){
		 this.name=name;
		 this.age=age;//(演習⑤)
		 }
	 public String getName(){
		 return this.name;
		 }
	 public void setName(String name){
		 this.name = name;
	 }//(演習①)
	 public int getAge(){
		 return this.age;
		 }

	 public void setAge(int age){
		 this.age = age;
	    }
}
