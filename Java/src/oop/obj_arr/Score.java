package oop.obj_arr;

public class Score {

	/*
    - 이름, 국어, 영어, 수학, 총점, 평균(double)을
     담을 수 있는 객체를 디자인하세요.
     
    - 학생의 모든 정보를 한 눈에 확인할 수 있게
     scoreInfo() 메서드를 선언해 주세요.
     메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
     
    - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */
//	String name;
//	int kor;
//	int eng;
//	int mat;
//	
//	public Score(String name, int kor, int eng, int mat) {
//		this.kor = kor;
//		this.eng = eng;
//		this.mat = mat;
//	}
//	
//	void scoreInfo() {
//		System.out.println("이름: " + name);
//		System.out.println("국어: " + kor);
//		System.out.println("영어: " + eng);
//		System.out.println("수학: " + mat);
//		System.out.println("총합: " + (kor + eng + mat));
//		System.out.println("평균: " + (kor + eng + mat)/3);
//	}
	
	
	
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private double avg;
	
	public Score() {}
	
	public Score(String name, int kor, int eng, int mat, int total, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.total = total;
		this.avg = avg;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public void scoreInfo() {
		System.out.printf("이름: %s 국어: %d점 영어: %d점 수학: %d점\n총점: %d점\n평균: %d점 "
				, name, kor, eng, mat, total, avg);
	}
	
	
}
