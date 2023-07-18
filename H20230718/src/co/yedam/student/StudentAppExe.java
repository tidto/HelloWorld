package co.yedam.student;

import java.util.Scanner;

public class StudentAppExe {
	public static void main(String[] args) {
		
		// 메뉴 : 1.등록 2.목록 3.합계 4.최고점 5.종료
		Scanner scn = new Scanner(System.in);
		StudentApp app = new StudentApp();
		boolean run = true;
		Student[] students = new Student[10];
		
		app.addStudent(new Student("001", "치킨", 95, 183.7));
		app.addStudent(new Student("002", "햄버거", 85, 178.1));
		app.addStudent(new Student("003", "피자", 90, 175.0));


		
		while(run) {
			
			System.out.println("1.등록 2.목록 3.합계 4.최고점 5.종료");
			System.out.print("메뉴를 선택하세요> ");
			int choice = Integer.parseInt(scn.nextLine());
			
			if(choice == 1) {
				System.out.println("등록 기능");
				
				System.out.print("학생_이름> ");
				String name = scn.nextLine();
				System.out.print("학생_번호> ");
				String no = scn.nextLine();
				System.out.print("학생_점수> ");
				int score  = Integer.parseInt(scn.nextLine());
				System.out.print("학생_키> ");
				double tall  = Integer.parseInt(scn.nextLine());
				
				//app.addStudent(new Student(name, no, score, tall));
				Student student = new Student(name, no, score, tall);
				if (app.addStudent(student)) {
					System.out.println("정상등록되었습니다.");
				}else {
					System.out.println("등록되지 않았습니다.");
				}

				
				
			}else if(choice ==2 ) {
				System.out.println("목록 확인");
				Student[] ary = app.studentList();
				for (int i=0; i<ary.length; i++) {
					if(ary[i] != null) {
					System.out.printf("학생번호: %s, 이름: %s, 점수: %d, 키: %.1f\n", //
							ary[i].stdNo, ary[i].stdName, ary[i].score, ary[i].height);
					}
				}
				
			}else if(choice ==3 ) {
				System.out.println("점수합계 확인");
				int result = app.sumScore();
				System.out.println("합계점수는 " + result);
				
			}else if(choice ==4 ) {
				System.out.println("최고점 확인");
				int result =app.maxPrint();
				System.out.println("최고점수는 " + result);
				
			}else if(choice ==5 ) {
				run = false;
				System.out.println("종료");
				break;
			}
			System.out.println("end of prog");
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
//		app.addStudent(new Student("001", "홍길동", 80, 177.7));
//		app.addStudent(new Student("002", "김길동", 85, 179.3));
//
//		app.studentList();
//		app.sumScore();
//		app.maxPrint();
		
	}
}
