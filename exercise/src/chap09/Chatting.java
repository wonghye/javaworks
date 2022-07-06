package chap09;

public class Chatting {
	void startCaht(String chatID) {
		//String nickName = null;
		//nickName = chatID; // 수정 불가
		String nickName = chatID;
		
		class Chat{
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
			
			void sendMessage(String message) {
				
			}
		}
		
		Chat chat = new Chat();
		chat.start();
	}
}
