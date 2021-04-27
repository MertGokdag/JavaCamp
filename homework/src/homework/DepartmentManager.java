package homework;

public class DepartmentManager {

	public static void add(Department department) {

		System.out.println("New Department Added :" + department.department);

	}

	public void showDepartments(Department department) {
		System.out.println("---------------");
		System.out.println("Department ID : " + department.id + "\n" + "Department Name : " + department.department);
	}
}
