package co.yedam.student;
/*
 *학생의 정보 등록, 등록된 목록 출력, 성적의 합계, 최고점수를 계산.
 */
public class StudentApp {
	// 필드.
	Student[] students;
	int studentNum = 0;
	
	// 생성자
	StudentApp(){
		students = new Student[3];	
	}
	
	// 메소드. void-반환값이 없다
	boolean addStudent(Student std) {
		if(studentNum >= 3) { //등록할 공간 부족 > 실패메세지
			return false;
		}
		students[studentNum] = std;
		studentNum++;
		return true;
	}
	
//	void studentList() {
//		for (int i=0; i<studentNum; i++) {
//			System.out.printf("학생번호: %s, 이름: %s, 점수: %d, 키: %.1f\n", //
//					students[i].stdNo, students[i].stdName, students[i].score, students[i].height);
//		}
//	}
	Student[] studentList() {
		return students;
	}
	
	int sumScore() {
		int sum = 0;
		for (int i=0; i<studentNum; i++) {
			sum += students[i].score;
		}
		return sum;
//		System.out.println("점수의 합계: " + sum);
	}
	
//	void avgTall() {
//		int avg = 0;
//		for(int i=0; i<studentNum; i++) {
//			
//		}
//	}
	
	int maxPrint() {
		int maxP = 0;
		for (int i=0; i<studentNum; i++) {
			if(maxP<students[i].score) {
				maxP = students[i].score;
			}
		}
		return maxP;
//		System.out.println("최고점수: " + maxP);
	}
}
