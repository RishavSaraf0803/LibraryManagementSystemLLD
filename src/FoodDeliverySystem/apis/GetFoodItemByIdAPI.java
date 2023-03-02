package FoodDeliverySystem.apis;

import FoodDeliverySystem.Data.FoodItem;
import FoodDeliverySystem.searcher.FoodItemSearcher;


public class GetFoodItemByIdAPI {

	public FoodItem searchFoodItemById(int foodItemId) {
		
		if(foodItemId >=0) {
			FoodItem foodItem = new FoodItemSearcher().searchById(foodItemId);
			return foodItem;
		}
		return null;
	}
}
