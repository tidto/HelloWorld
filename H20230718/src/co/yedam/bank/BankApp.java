package co.yedam.bank;

// 기능구현
public class BankApp {
	//필드
	Account[] accounts;
	int accountNo = 0;
	//생성자
	BankApp(){
		accounts = new Account[10];
	}
	
// 계좌등록기능   registerAccount (계좌번호/ 입금주/ 임금액)
	void registerAccount(Account act) {
		accounts[accountNo++] = act;
	}
	

// 계좌입금기능   deposit(계좌번호/ 입금액)
	int deposit() {
		int plus = 0;
		for (int i=0; i<accountNo; i++) {
			plus += accounts[i].inner + accounts[i].inMoney;
		}
		return plus;
	}
	
// 출금 	      withdraw(계좌번호/ 출금액)
	int withdraw() {
		int minus = 0;
		for (int i=0; i<accountNo; i++) {
			if(accounts[i].inner >= 0) {
			minus += accounts[i].inner - accounts[i].inMoney;
			}
		}
		return minus;
	}
	
	
// 잔액조회	  checkBalance(계좌번호)
	int checkBalance() {
		int nam = 0;
		for(int i=0; i<accountNo; i++) {
			if(accounts[i].inner >= 0) {
				nam = accounts[i].inner;
			}
		}
		return nam;
	}
	
	
// 계좌목록확인   accountList()
	void accountList() {
		for(int i=0; i<accountNo; i++) {
			System.out.printf("계좌목록: ", accounts[i].bankNo);
		}
	}
	
	
}
