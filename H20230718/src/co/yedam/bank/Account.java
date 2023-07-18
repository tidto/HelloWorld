package co.yedam.bank;

public class Account {
	//필드
	int bankNo; //계좌번호
	String taker;//예금주
	String shooter;//입금주
	int inMoney;//입금액
	int outMoney;//출금액
	int inner;//잔고
	
	//생성자
	Account(){}//기본
	
	Account(int bankNo){
		this.bankNo = bankNo;
	}
	
	Account(int bankNo,String shooter,int inMoney){
		this.bankNo = bankNo;
		this.shooter = shooter;
		this.inMoney = inMoney;
		
	}
	
	Account(int bankNo, int inMoney, int inner){
		this.bankNo = bankNo;
		this.inMoney = inMoney;
		this.inner = inner;
	}

	public Account(int bankNo, String taker, String shooter, int inMoney, int outMoney, int inner) {
		super();
		this.bankNo = bankNo;
		this.taker = taker;
		this.shooter = shooter;
		this.inMoney = inMoney;
		this.outMoney = outMoney;
		this.inner = inner;
	}
	
	
	
	
	
}
