package com.example.final2mycityapp.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.final2mycityapp.CoffeeShop;
import com.example.final2mycityapp.R;
import com.example.final2mycityapp.viewmodels.CoffeeShopsViewModel;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShopsViewModel extends ViewModel {
    private final MutableLiveData<List<CoffeeShop>> coffeeShops = new MutableLiveData<>();

    public CoffeeShopsViewModel() {
        loadCoffeeShops();
    }

    public LiveData<List<CoffeeShop>> getCoffeeShops() {
        return coffeeShops;
    }

    private void loadCoffeeShops() {
        List<CoffeeShop> coffeeShopList = new ArrayList<>();
        coffeeShopList.add(new CoffeeShop("Café by the Ruins", "A café with a beautiful view and rich history.", R.drawable.cafe_by_the_ruins));
        coffeeShopList.add(new CoffeeShop("Arca’s Yard", "A cozy place with great coffee and a relaxing ambiance.", R.drawable.arcas_yard));
        coffeeShopList.add(new CoffeeShop("Choco-late de Batirol", "Famous for its hot chocolate and traditional Filipino snacks.", R.drawable.chocolate_batirol));

        coffeeShops.setValue(coffeeShopList);
    }
}
