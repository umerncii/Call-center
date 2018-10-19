/*
CallCenter.java
Umer Iqbal
30 04 2018
*/
	public class CallCenter{
		//var
		private String name;
		private String location;
		private String number;
		private String verdict;
		private String voucher;
		//constructor
		public CallCenter(){
			name="";
			location="";
			number="";
			verdict="";
			voucher="";
	}
		//setter
		public void setName(String name){
			this.name=name;
}

		public void setNumber(String number){
			this.number=number;
}

		public void setLocation(String location){
			this.location=location;
}
		//compute
		public void compute(){
			if(location.equalsIgnoreCase("Dublin")){
				for(int i=0; i<number.length();i++){
					if(number.charAt(0)=='1' && number.charAt(1)=='2' && number.charAt(2)=='3' && number.length()==7){
						verdict="valid";
						if(number.charAt(i)=='!'){
							voucher="20 euros";
						}
						else{
							voucher="0";
						}
					}
					else{
						verdict="invalid";
					}
				}
			}
				else{
							verdict="invalid";
						}


	}






	}