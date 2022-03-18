package chap09.book.exercise.p6;

public class Chatting {

	
	// 메소드
	void StarChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		
/*		class MyChat extends Chat{
			@Override
			void start() {
				String inputData = "안녕하세요.";
				String message = "[" + nickName + "]" + inputData;
				sendMesaage(message);
			}
		} 
		Chat chat = new Chat();
		
		chat.Star();
		*/
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요.";
					String message = "[" + nickName + "]" + inputData;
					sendMesaage(message);
				}
			}
		};
		chat.start();
	}
	
	
	// 중첩 인스턴스 클래스
	class Chat{
		void start() {}
		void sendMesaage(String message) {}
	}
}
