package oopIntroPractice;

public class CourseManager {
	public void startCourse(Course course) {
		System.out.println("Kursa baþlandý: " + course.name);
	}
	
	public void nextLesson(Course course) {
		System.out.println("Ders: " + course.lesson + ".Ders " + course.name);
	}
}
