package creationalP.Template;

public class XMLDataRenderer extends DataRenderer {

	public String readData() {
		return "xml data";
	}

	public String processData(String data) {
		return "processed: " + data;
	}

}
