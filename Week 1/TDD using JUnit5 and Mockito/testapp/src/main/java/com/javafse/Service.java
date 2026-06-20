package com.javafse;

public class Service {

    /*
        Service class to handle Api
    */
    private Api api;
    
    public Service(Api api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}
