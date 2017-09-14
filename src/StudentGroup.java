import java.util.Date;
import java.util.List;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students == null)
		{
			throw new IllegalArgumentException("student is null");
		}
		else
		{
			Student[] stud = getStudents();
			for(int i=0;i<students.length;i++)
			{
				stud[i] = students[i]; 
			}
			//Student[] stud = getStudents();
			//List<Integer> targetList = new ArrayList<Integer>(Arrays.asList(stud));
			
			
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if((index <= 0) || (index >= students.length))
		{
			throw new IllegalArgumentException("index out of range");
		}
		else
		{
			Student[] s1 = getStudents();
			Student s = s1[index];
		return s;
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		Student[] stu = getStudents();
		if(student  == null)
		{
			throw new IllegalArgumentException("student is null inside setStudent");
		}
		else if((index <= 0 || index >= stu.length))
				{
					throw new IllegalArgumentException("index out of rangeinside setStudent");
				}
		else
		{
			stu[index] = student;
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student  == null)
		{
			throw new IllegalArgumentException("student is null inside setStudent");
		}
		Student[] stu = getStudents();
		Student[] stu1 = new Student[stu.length + 1];
		stu1[0] = student;
		for(int i=0;i<stu.length;i++)
		{
			stu1[i+1] = stu[i];
		}
		stu = stu1;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student  == null)
		{
			throw new IllegalArgumentException("student is null inside setStudent");
		}
		Student[] stu = getStudents();
		Student[] stu1 = new Student[stu.length + 1];
		int i;
		for(i=0;i<stu.length;i++)
		{
			stu1[i] = stu[i];
		}
		stu1[i] = student;
		stu = stu1;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		Student[] stu = getStudents();
		if(student  == null)
		{
			throw new IllegalArgumentException("student is null");
		}
		else if((index <= 0 || index >= stu.length))
		{
			throw new IllegalArgumentException("index out of range");
		}
		Student[] stu1 = new Student[stu.length + 1];
		int i;
		for(i=0;i<index;i++)
		{
			stu1[i] = stu[i];
		}
		stu1[i] = student;
		for(;i<stu.length;i++)
		{
			stu1[i+1] = stu[i];
		}
		stu = stu1;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		Student[] stu = getStudents();
		if((index <= 0 || index >= stu.length))
		{
			throw new IllegalArgumentException("index out of rangeinside");
		}
		Student[] stu1 = new Student[stu.length - 1];
		int j=0,i;
		for(i=0;i<index;i++)
		{
			stu1[j] = stu[i];
			j++;
		}
		i++;
		for(;i<stu.length;i++)
		{
			stu1[j] = stu[i];
			j++;
		}
		stu = stu1;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student  == null)
		{
			throw new IllegalArgumentException("student is null");
		}
		Student[] stu = getStudents();
		Student[] stu1 = new Student[stu.length - 1];
		int j=0,ind=-1,i;
		for(i=0;i<stu.length;i++)
		{
			if(student == stu[i])
			{
				ind = i;
				break;
			}
		}
		if(ind == -1)
		{
			throw new IllegalArgumentException("Student not exist");
		}
		for(i=0;i<ind;i++)
		{
			stu1[j] = stu[i];
			j++;
		}
		i++;
		for(;i<stu.length;i++)
		{
			stu1[j] = stu[i];
			j++;
		}
		stu = stu1;
		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		Student[] stu = getStudents();
		if((index <= 0 || index >= stu.length))
		{
			throw new IllegalArgumentException("index out of rangeinside");
		}
		Student[] stu1 = new Student[index];
		for(int i=0;i<index;i++)
		{
			stu1[i] = stu[i];
		}
		stu = stu1;
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student  == null)
		{
			throw new IllegalArgumentException("student is null");
		}
		Student[] stu = getStudents();
		
		int j=0,ind=-1;
		for(int i=0;i<stu.length;i++)
		{
			if(student == stu[i])
			{
				ind = i;
				break;
			}
		}
		if(ind == -1)
		{
			throw new IllegalArgumentException("Student not exist");
		}
		Student[] stu1 = new Student[ind+1];
		for(int i=0;i<ind;i++)
		{
			stu1[i] = stu[i];
		}
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		Student[] stu = getStudents();
		if((index <= 0 || index >= stu.length))
		{
			throw new IllegalArgumentException("index out of rangeinside");
		}
		Student[] stu1 = new Student[index];
		int j=0;
		for(int i=index;i<stu.length;i++)
		{
			stu1[j] = stu[i];
			j++;
		}
		stu = stu1;
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student  == null)
		{
			throw new IllegalArgumentException("student is null");
		}
		Student[] stu = getStudents();
		int j=0,ind=-1;
		for(int i=0;i<stu.length;i++)
		{
			if(student == stu[i])
			{
				ind = i;
				break;
			}
		}
		Student[] stu1 = new Student[stu.length - ind];
		for(int i=ind;i<stu.length;i++)
		{
			stu1[j] = stu[i];
			j++;
		}
		stu = stu1;
		
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
