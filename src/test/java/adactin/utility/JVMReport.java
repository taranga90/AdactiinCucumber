package adactin.utility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String jsonfile) {
		File file = new File(System.getProperty("user.dir")+"\\Reports");
		Configuration con = new Configuration(file,"Adactin");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonfile);
		
		ReportBuilder build = new ReportBuilder(li,con);
		build.generateReports();
	}

}
