package creationalP.Template;

public class aTester {

	public static void main(String[] args) {

		DataRenderer renderer= new XMLDataRenderer();
		renderer.render();
		
		System.out.println("Template pattern testing done.");
	}
}
