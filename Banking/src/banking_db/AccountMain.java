package banking_db;


import java.util.Scanner;

public class AccountMain {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AccountDao dao = new AccountDao();
		
		
		boolean run = true;  // 실행 변수
		
		while(run) {
			System.out.println("-------------------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌검색 | 6.계좌삭제 | 7.종료");
			System.out.println("-------------------------------------------------------------------");
			System.out.print("선택> ");
			
			String selectNo = scanner.next();  // nextLine()이 자동 줄바꿈이 되는 경우있어 사용 x
			if(selectNo.equals("1")) {
				dao.createAccount();   //계좌생성
			}else if(selectNo.equals("2")) {
				dao.getAccountList();   //계좌 목록
			}else if(selectNo.equals("3")) {
				dao.deposit();   // 입금
			}else if(selectNo.equals("4")) {
				dao.withdraw();   // 출금
			}else if(selectNo.equals("5")) {
				dao.viewAccount(); // 검색
			}else if(selectNo.equals("6")) {
				dao.removeAccount(); // 삭제	
			}else if(selectNo.equals("7")) {
				run = false;     // 종료
			}else {
				System.out.println("지원되지 않는 기능입니다.");
			}
		}//while
		System.out.println("프로그램 종료!!");
		scanner.close();
	}

	/*
	private static void createAccount() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------------------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호 : ");
			String ano = scanner.next();
			if(findAccount(ano) != null) {
				System.out.println("중복 계좌입니다. 다시 입력하세요.");
			}else {
				System.out.print("계좌주 : ");
				String owner = scanner.next();
				
				while(true) {
					System.out.print("초기입금액 : ");
					int balance = scanner.nextInt();
					if(balance < 100) {
						System.out.println("초기 입금액 100원 이상입니다.");
					}else {
						//계좌 객체 생성
						Account newAccount = new Account(ano, owner, balance);
						accountArrayList.add(newAccount);
						System.out.println("결과: 계좌가 생성되었습니다.");
						break;
						}
					}//안쪽
					break;
				}
			}//바깥
	}

	

	private static void deposit() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("예금");
		System.out.println("-------------------------------------------------------------------");
		
		//입출금시 계좌번호 일치하지 않을때 
		while(true) {
			System.out.print("계좌 번호 : ");
			String ano = scanner.next();
			//계좌가 없습니다. 다시 입력하세요 - 
			if(findAccount(ano) == null) { //검색계좌 없으면 
				System.out.println("계좌가 없습니다. 다시입력하세요");
				//System.out.println("계좌번호 : ");
				//ano = scanner.next();
			}else {
				Account account = findAccount(ano);  // 계좌 객체 생성
				while(true) {
					System.out.print("입금액 : ");
					int money = scanner.nextInt();
					if(money < 0) {
						System.out.println("음수로 입력할 수 없습니다. 다시 입력하세요");
					}else {
						account.setBalance(account.getBalance() + money); 
						System.out.printf("%,d원 정상 입금되었습니다.\n", money);
						break;
					}
				} //안쪽 while
				break;
			}
		} //while
	}

	private static void withdraw() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("출금");
		System.out.println("-------------------------------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호 : ");
			String ano = scanner.next();
			
			if(findAccount(ano) == null) {
				System.out.println("계좌가 없습니다. 다시입력하세요");
			}else {
				Account account = findAccount(ano);  // 검색한 계좌번호의 account 반환
				while(true) {
				
				System.out.print("출금액 : ");
				int money = scanner.nextInt();
				if(money > account.getBalance()) {
					System.out.println("잔액이 부족합니다. 다시 입력하세요");
				}else if(money < 0){
					System.out.println("음수로 입력할 수 없습니다. 다시 입력하세요");
				}else {
					account.setBalance(account.getBalance() - money); 
					System.out.printf("%,d원 정상 출금되었습니다.\n", money);
					break;
					}	
				}
				break;
			}
		}//바깥 w
	}
	
	
	//계좌 검색 1개 상세보기
	private static void viewAccount() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("계좌 검색");
		System.out.println("-------------------------------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호 : ");
			String ano = scanner.next();
			
			if(findAccount(ano) == null) { // 계좌가 없을 경우
				System.out.println("계좌가 없습니다. 다시입력하세요");
			}else {
				Account account = findAccount(ano); // 검색한 계좌
				System.out.print("계좌번호 : " + account.getAno() + "\t");
				System.out.print("계좌주 : " + account.getOwner() + "\t");
				System.out.println("잔액 : " + account.getBalance());
				break;
			}
		}
	}
	
	//계좌 삭제
	private static void removeAccount() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("계좌 삭제");
		System.out.println("-------------------------------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호 : ");
			String ano = scanner.next();
			
			if(findAccount(ano) == null) { // 계좌가 없을 경우
				System.out.println("계좌가 없습니다. 다시입력하세요.");
			}else {
				Account account = findAccount(ano); // 검색한 계좌
				
				accountArrayList.remove(account); // 계좌 삭제
				System.out.println("결과 : 계좌가 삭제되었습니다.");
				break;
			}
		}
	}	
	
		//계좌찾기
	private static Account findAccount(String ano){
		Account account = null;
		for(int i = 0; i<accountArrayList.size(); i++) {
			String dbAno = accountArrayList.get(i).getAno();  // 저장된 계좌를 가져와서 
			if(dbAno.equals(ano)) {  // 이미 저장된 계좌와 일치하면 
				account = accountArrayList.get(i);
				break;
			}
		}
			return account;
	}*/
}
	