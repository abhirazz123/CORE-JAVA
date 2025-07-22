package DEC_27.try_with_resourses;
import java.io.Closeable;
import java.io.IOException;

public class FileResourse implements Closeable{
	@Override
	public void close() throws IOException {
		System.out.println("File Resourse Closed!!!");
		
	}

}

