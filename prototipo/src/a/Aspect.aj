package a;

import java.awt.event.ActionEvent;

public aspect Aspect {
	pointcut greeting() : execution(* ventanajframe.actionPerformed(..));
	after() returning(): greeting(){
		System.out.println("Nombre de color");
	};
}
