package oopIntroPractice;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"JAVA + REACT","ÜCRETSÝZ","Engin Demiroð",2);
		Course course2 = new Course(2,"C# + ANGULAR","ÜCRETSÝZ","Engin Demiroð",2);
		Course course3 = new Course(3,"JavaScript","ÜCRETSÝZ","Engin Demiroð",2);
		
		Category category1 = new Category(1,"Programlama");		
		Category category2 = new Category(2," Engin Demiroð");
		
		Category[] categories = {category1,category2};
		
		for (Category category : categories) {
			
			System.out.print(category.name);
		}
		
		System.out.println();
		System.out.println();
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {		
			System.out.println(course.name);
			System.out.println(course.educator);
			System.out.println(course.fee);
			System.out.println();
		}
				
		CourseManager courseManager = new CourseManager();
		courseManager.startCourse(course1);
		courseManager.nextLesson(course1);

	}

}
