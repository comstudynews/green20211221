package org.comstudy21.miniproj;

import java.util.Scanner;

import static java.lang.System.out;

class Student {
	public int no; // 번호
	public String name; // 이름
	public int kor, eng, mat;
	public int sum; // 국영수의 총점
	public double avg; // 국영수 총점의 평균
	public String grade; // 학점
	public int rank; // 등수
	
	public Student() {
		// 디폴트생성자 - 인자가 없다. 아무일도 하지 않는다.
	}

	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		// 총점, 평균, 학점을 만들어준다.
		
	}
	
	// 객체를 사용하면 toString()이 자동 호출 된다.
	
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t"
				+ sum + "\t" + avg + "\t" + grade + "\t" + rank;
	}
}
// Student st1 = new Student();
// st1.name = "홍길동"
// Student st2 = new Student(1, "김길동", 60, 70, 80);

public class MainCls {
	public static final Scanner scan = new Scanner(System.in);
	
	public static final int MAX = 100;
	static Student[] sArr = new Student[MAX];
	static int top = 0; // 스텍 자료구조처럼.
	static int sequence = 1;
	
	// static 초기화 블럭
	static {
		sArr[top++] = new Student(sequence++, "KIM", 60, 60, 75);
		sArr[top++] = new Student(sequence++, "LEE", 90, 80, 80);
		sArr[top++] = new Student(sequence++, "PARK", 90, 100, 95);
	}
	
	public static int menu() {
		int no = 0;
		out.println("1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료");
		out.print("선택>> ");
		no = scan.nextInt();
		// 예외처리 및 유효성 검사
		return no;
	}
	
	public static void run() {
		switch(menu()) {
		case 1 : input(); break;
		case 2 : output(); break;
		case 3 : search(); break;
		case 4 : modify(); break;
		case 5 : delete(); break;
		case 6 : end(); break;
		default : out.println("--- 해당 사항 없습니다! ---");
		}
		System.out.println("------------------------------------");
	}
	
	private static void end() {
		System.out.println("::::: END :::::");
		System.out.println("프로그램 종료!");
		System.out.println("수고하셨습니다!");
		System.exit(0);
	}

	private static void delete() {
		System.out.println("::::: DELETE :::::");
		// 이름으로 검색 후 삭제
	}

	private static void modify() {
		System.out.println("::::: MODIFY :::::");
		// 이름으로 검색 후 수정
	}

	private static void search() {
		System.out.println("::::: SEARCH :::::");
		// 이름으로 검색
	}

	private static void output() {
		System.out.println(":::::::::::::::::::::::::::: OUTPUT ::::::::::::::::::::::::::::");
		// 배열의 목록 출력
		// 번호, 성명, 국어, 영어, 수학, 총점, 평균, 학점, 등수, 등수를 기준으로 정렬
		for(Student std : sArr) {
			if(std == null) break;
			out.println(std);
		}
	}

	private static void input() {
		System.out.println("::::: INPUT :::::");
		// 성명, 국어, 영어, 수학를 배열에 입력 받는다.
		// 입력 받은 국영수 점수의 총점과 평균, 평균의 학점, 
		// 입력 된 학생의 등수가 셋팅 된다.
	}

	public static void main(String[] args) {
		out.println("::::::::::::::: 성적 출력 프로그램 :::::::::::::::");
		while(true) {
			run();
		}
	}

}
