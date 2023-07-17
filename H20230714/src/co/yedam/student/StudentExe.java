package co.yedam.student;

public class StudentExe {
	public static void main(String[] args) {
		// 학생번호, 학생이름, 점수.
		Student std1 = new Student(); // 인스턴트.
		std1.setStudentNo(100);
		std1.setStudentName("홍길동");
		std1.setScore(80);
		
		//System.out.println(std1.studentName);
		
		Student std2 = new Student(); //인스턴트.
		std2.setStudentNo(110);
		std2.setStudentName("김길동");
		std2.setScore(85);
		
		Student[] students = {std1,std2};
		students = new Student[5];
		students[0] = std1;
		students[1] = std2;
		
		Student std3 = new Student();
		std3.setStudentNo(120);
		std3.setStudentName("박길동");
		std3.setScore(90);
		
		students[2] = std3;
		
		String searchName = "홍길동";
		//최고점수를 받은 학생의 정보 출력.
		int maxScore = 0;
		//평균점수
		Student maxStd = new Student();
		//
		int sum = 0, cnt = 0;
		double avg = 0;
		
		for (int i=0; i< students.length; i++) {
			if(students[i] != null) {
		//		//4,5번째 위치는 null이기에 if로 걸러서 출력
		//		if(students[i].studentName.equals(searchName)) {
		//			System.out.printf("학생번호는: %d, 이름: %s, 점수: %d \n",
		//					students[i].studentNo, students[i].studentName, students[i].score);
		//		}
				//최고점수의 학생 정보
				if(students[i].getScore() > maxScore) {
					maxScore = students[i].getScore();
					maxStd = students[i];
				}
				//합계, 횟수
				sum += students[i].getScore();
				cnt++;
			}
		}
			System.out.printf("최고점수자  name: %s, score: %d, No: %d",
					maxStd.getStudentName(), maxStd.getScore(), maxStd.getStudentNo());
			avg = (double) sum/ cnt;
			System.out.printf("\n합계점수: %d, 평균: %.1f", sum, avg);
		
	}
}
