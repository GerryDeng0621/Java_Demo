
public class ExcepDemo{

		public void foo() {
		try {
		bar();
		}
		catch (MyException e) {}
		finally {
		baz();
		} 
		}
		public void bar() throws MyException {
		throw new MyException();
		}
		public void baz() throws RuntimeException {
		throw new RuntimeException();
		}
		}