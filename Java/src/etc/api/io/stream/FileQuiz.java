package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz {

	public static void main(String[] args) {

		/*
        1. 스캐너를 통해서 파일명을 정확히 입력받습니다.
        
        2. file폴더에 해당 파일이 존재한다면 해당 파일을 
        upload폴더로 복사하세요.
        파일이 존재하지 않는다면 "파일명이 없습니다." 예외구문을 출력하세요.
        
        3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력.
        */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("파일명: ");
		String name = sc.next();
		
		
		FileInputStream fFile = null;
		FileOutputStream sfile = null;
		
//		try {
//			if() {
//				fFile = new FileInputStream("C:\\imbbo\\file\\" + name);				
//			} else if() {
//				sFile = new FileOutputStream("C:\\imbbo\\file\\upload\\" + name);
//			}
//			
//			byte[] arr = new byte[100];
//			
//			while(true) {
//				int result = fFile.read();
//				if(result == -1) break;
//				sFile.writer(arr, 0, result);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("파일 처리 중 예외 발생");
//		} finally {
//			fFile.close();
//		}							내가 쓰다 만거
//		
		
//		try {
//			fFile = new FileInputStream("C:\\imbbo\\file\\" + name + ".txt");
//			sfile = new FileOutputStream("C:\\imbbo\\file\\upload\\" + name + ".txt");
//		
//			byte[] arr = new byte[100];
//			
//			while((result = sFile.read(arr)) != -1) {
//				fFile.write(arr, 0, result);
//			}
////			while(true) {
////				int result = fFile.read(arr);
////				if(result == -1) break;
////				
////			}
//		
//		} catch (FileNotFoundException e) {
//			System.out.println("파일이나 경로 찾을 수 없음");
//		} catch ( IOException e) {
//			System.out.println("파일 처리 중에 에러가 발생");
//		} finally {
//			sfile.close();
//			fFile.close();
//		}
		
		
		
		
		
		
		
		
		
	}

}
