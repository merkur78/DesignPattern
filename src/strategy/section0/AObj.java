package strategy.section0;

public class AObj {
	
	Ainterface ainterface;
	
	public AObj() {
		ainterface = new AinterfaceImpl();
	}
	
	void funcAA() {
		//�����Ѵ�.
		ainterface.funcA();
		ainterface.funcA();
		
//		System.out.println("AAA");
//		System.out.println("AAA");
		
		// ~ ����� �ʿ��մϴ�. �������ּ���.
		
	}
}
