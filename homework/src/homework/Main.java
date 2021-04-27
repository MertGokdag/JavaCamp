package homework;

public class Main {

	public static void main(String[] args) {

		Job job1 = new Job(1, "Electrical Engineer", "Engineer", "Bachelor");
		Job job2 = new Job(2, "Plumber", "Craft", "Highschool");
		Job job3 = new Job(3, "Doctor", "Medical", "Bachelor");

		Job[] jobs = { job1, job2, job3 };

		for (Job job : jobs) {
			System.out.println(job.name);
		}

		Department department1 = new Department(1, "Engineer");
		Department department2 = new Department(2, "Craft");
		Department department3 = new Department(3, "Medical");

		
		
		Department[] departments = { department1, department2, department3 };

		DepartmentManager departmentManager = new DepartmentManager();

		for (Department department : departments) {
			departmentManager.showDepartments(department);
		}

		JobManager jobManager = new JobManager();
		jobManager.add(new Job(1, "Lawyer", "Law", "Bachelor"));
		jobManager.showw(job2);

		DepartmentManager.add(new Department(4, "Economy"));

	}

}
