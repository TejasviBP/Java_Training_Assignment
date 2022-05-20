package abstractionAndEncapsulation;

public class Bank {
	
		private long acctNo;
		private long  id;
		private String name;
		
		public long getAcctNo() {
			return acctNo;
		}
		
		public long getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name= name;	
		}
		public void setId(long id) {
	       this.id=id;		
		}
		public void setAcctNO(long acctNo) {
		      this.acctNo=acctNo;		
			}
	
}
