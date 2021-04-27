package homework;

public class JobManager {

	public void add(Job job) {

		System.out.printf("job: %s \n", job.name);

	}

	public void showw(Job job) {
		System.out.println("-------------------------");
		System.out.println("Job ID : " + job.id + "\n" + "Job Name : " + job.name + "\n" + "Job department: "
				+ job.department + "\n" + "" + "Graduate: " + job.graduate + "\n");

	}

}
