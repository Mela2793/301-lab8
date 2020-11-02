package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();

        assertEquals(1, cityList.countCities());

        cityList.add(new City("Regina", "Saskatchewan"));

        assertEquals(2, cityList.countCities());
        assertTrue(cityList.hasCity(new City("Regina", "Saskatchewan")));
    }

    @Test
    void testGetCities(){
        CityList citylist = mockCityList();

        assertEquals(0, mockCity().compareTo(citylist.getCities().get(0)));

        City city = new City("Charlottetown", "Prince Edward Island");
        citylist.add(city);

        assertEquals(0, city.compareTo(citylist.getCities().get(1)));
        assertEquals(0, mockCity().compareTo(citylist.getCities().get(1)));
    }
}
