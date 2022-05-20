package inheritence;

import java.util.ArrayList;
import java.util.List;

public class StateBank  extends Bank{

	public void belongsTo(String name) {
		List<String> list= new ArrayList();
		list.add("MH state Bank");
		list.add("HR state Bank");
		list.add("UP state Bank");
		list.add("GJ state Bank");
		list.add("MP state Bank");
		list.add("AP state Bank");
		list.add("BLR state Bank");
		list.add("PJ state Bank");
		
		if(list.contains(name)) {
			System.out.println(name+ ": Bank belongs to state bank");
		}
		else {
			
				System.out.println(name+": Bank does not belongs to state bank");
			
		}
	}
	



}
