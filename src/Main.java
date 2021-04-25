
public class Main {

	public static void main(String[] args) {
		
		//Teacher
		
		Teacher teacher1=new Teacher();
		teacher1.id=1;
		teacher1.name="Engin";
		teacher1.surName="Demirog";
		
		Teacher teacher2=new Teacher(2,"Derin","Demirog");
		
		Teacher[] teachers= {teacher1,teacher2};
		
		for (Teacher teacher : teachers) {
		
			System.out.println(teacher.name+teacher.surName);
		}
		//Course
		
		Course course1=new Course();
		course1.id=1;
		course1.name="C#+Angular";
		course1.detail="Yazılım Geliştirici Yetiştirme Kampı";
		
		Course course2=new Course(2,"Java+React","Yazılım Geliştirici Yetiştirme Kampı");
		
		Course[] courses= {course1,course2};
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		//----------------------------------------------------------------------------
		//Manager
		
		//TeacherManager
		TeacherManager teacherManager=new TeacherManager();
		teacherManager.courseAddToTeacher(teacher2, course2);
		teacherManager.courseAddToTeacher(teacher1, course1);
		
		//CourseManager
		CourseManager courseManager=new CourseManager();
		courseManager.chooseCourse(course2, teacher2);
		courseManager.chooseCourse(course1, teacher1);
		
		
		
		
	}

}
