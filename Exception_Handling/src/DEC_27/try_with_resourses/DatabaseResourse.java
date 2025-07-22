package DEC_27.try_with_resourses;

public class DatabaseResourse implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Database Resourse cloed!!");
		
	}
}
