class Cricket{
 public static void main (String [] args){
	String match = "IND vs PAK" ;
	float overs = 50.0f;
	String toss = "PAK won the toss and decided to bowl";
	int total_runs = 2589
;
	int count = 0;
	while(total_runs!= 0){
	System.out.println(total_runs/10);	
	total_runs = total_runs / 10;
        System.out.println(total_runs);
	if(total_runs%2 == 0){
	 System.out.println("Digit is even");
	 }
	else{
	 System.out.println("Digit is odd");
	 }
	++count;
	 }
	
	String batsman = "Virat Kholi";
	String batsman1 = "K L Rahul";
	int wicket = 3;
	boolean won = true;
	String summaryInd = "355(50)";
	String summaryPak =  "128(32)";
	System.out.println(match);
	System.out.println("Overs : " + overs);
	System.out.println(toss);
	System.out.println("Target : " + total_runs);
	System.out.println(batsman);
	System.out.println(batsman1);
	if (wicket % 2 == 0){
	System.out.println("Wicket is even");
   	}
	  else{
	     System.out.println("Wicket is odd");
 	  }

	System.out.println("India won the match : " + won);
	System.out.println("INDIA : " + summaryInd);
	System.out.println("PAKISTAN : " + summaryPak);
	System.out.println("Number of digits in total runs :  " + count);


 }


}