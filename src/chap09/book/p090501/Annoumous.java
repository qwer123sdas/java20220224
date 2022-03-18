package chap09.book.p090501;

public class Annoumous {
	// 필드 초기값으로 대입
	Person field = new Person() {
		void work() {
			System.out.println("출근을 합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};

	void method1() {
		Person localVar = new Person() {
			void work() {
				System.out.println("산책을 합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				super.wake();
			}
		};

		// 로컬변수 사용
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}

}
