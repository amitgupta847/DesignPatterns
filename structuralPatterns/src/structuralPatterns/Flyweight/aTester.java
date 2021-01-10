package structuralPatterns.Flyweight;

import structuralPatterns.Flyweight.PaintApp.PaintApp;

public class aTester {
	public static void main(String[] args)
	{
		
		PaintApp app=new PaintApp();
		app.render(10);
		
		System.out.println("\n flyweight testing done");
	}
}
