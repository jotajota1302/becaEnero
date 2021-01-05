package edu.es.eoi.disney;

public class Child extends Parent {

	public String childAttribute = "chield field";

	@Override
	public void doSomething(String param) {
		System.out.println("realizo el doSomething desde el child: " + param + "; att:" + childAttribute);
	}
	
	public String doSomethingFromChild() {
			return "perete";
	}

	public static void main(String[] args) {

		Parent child = new Child();
		child.doSomething(child.attribute);		

	}

}
