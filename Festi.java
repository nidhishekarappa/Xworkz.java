class Festi{
	public static void food(String foodName){
		System.out.println(" Food name : " +foodName);
	}
	
	public static void decoration(String itemName, int price , int quantity){
		System.out.println(" Item name : " + itemName);
		int totalPrice = price*quantity;
		System.out.println(" Totalprice  : " + totalPrice);
	}
	
	public static void shopping(String typeOfItem){
		System.out.println(" Item type : " + typeOfItem);
	}
	
	public static void crackers(String crackerType, int crackerPrice , int crackerQuantity){
		System.out.println(" Cracker Type : " + crackerType);
		int totalCrackerPrice = crackerPrice * crackerQuantity;
		System.out.println(" Totalprice  : " + totalCrackerPrice);
	}
	
	public static void pooja(String time, String flowers , String typeOfItem){
		System.out.println(" Time : " + time);
		System.out.println(" Flowers  : " + flowers);
		System.out.println(" Item : " + typeOfItem);
	}
	
	public static void festivalType(String nameOfFestival){
		System.out.println(" Festival name : " +nameOfFestival);
	}
	
	public static void festivalMonth(String month){
		System.out.println(" Festival Month : " +month);
	}
	
	public static void totalCost(int cost){
		System.out.println(" Total Cost  : " +cost);
	}
	
}