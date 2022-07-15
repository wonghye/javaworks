package writer;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		// 파일 클래스는 입,출력 기능없지만 파일 이름, 경로 등 알 수 있음
		File file = new File("C:/File/newFile.txt");
		file.createNewFile();  // 파일 생성
		
		System.out.println(file.isFile());  // 파일인지 여부 확인
		System.out.println(file.isDirectory());
		System.out.println(file.getName());  // 파일이름
		System.out.println(file.getPath());  // 파일 경로
	}

}
