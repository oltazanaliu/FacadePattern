public class Seller {
	
	
	private CarShop mercedes;
	private CarShop porsche;
	private CarShop jeep;
	
	public Seller(){
		
		mercedes= new Mercedes();
		
		porsche=new Porsche();
		
		jeep=new Jeep();
		
	}
	
	public void MercedesSale(){
		
		mercedes.Model();
		mercedes.Price();
		
	}
	
    public void PorscheSale(){
		
		porsche.Model();
		porsche.Price();
	}

   public void JeepSale(){
	
	jeep.Model();
	jeep.Price();
	
}
	

}