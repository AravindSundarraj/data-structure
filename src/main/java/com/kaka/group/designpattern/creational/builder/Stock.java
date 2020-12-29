package com.kaka.group.designpattern.creational.builder;

public class Stock {

    private final String ceo;
    private final String company;
    private final int employees;
    private final String headQuarters;
    private final String founded;
    private final String capital;
    private final String dividend;

    public String getCeo() {
        return ceo;
    }

    public String getCompany() {
        return company;
    }

    public int getEmployees() {
        return employees;
    }

    public String getHeadQuarters() {
        return headQuarters;
    }

    public String getFounded() {
        return founded;
    }

    public String getCapital() {
        return capital;
    }

    public String getDividend() {
        return dividend;
    }

    public static class StockBuilder{

        private  String ceo;
        private  String company;
        private int employees;
        private String headQuarters;
        private String founded;
        private String capital;
        private String dividend;

        public StockBuilder ceo(String ceo){

            this.ceo = ceo;
            return this;
        }
        public StockBuilder company(String company){

            this.company = company;
            return this;
        }
        public StockBuilder employees(int employees){

            this.employees = employees;
            return this;
        }
        public StockBuilder headQuarters(String headQuarters){

            this.headQuarters = headQuarters;
            return this;
        }
        public StockBuilder founded(String founded){

            this.founded = founded;
            return this;
        }
        public StockBuilder capital(String capital){

            this.capital = capital;
            return this;
        }
        public StockBuilder dividend(String dividend){

            this.dividend = dividend;
            return this;
        }

        public Stock build(){
            if(this.ceo == null) throw new BuilderException("CEO  cannot be empty !!!");
            if(this.company == null) throw new BuilderException("Company Name cannot be empty !!!");
            Stock stock = new Stock(this);
            return stock;
        }

    }

    private Stock(StockBuilder stockBuilder){

        this.ceo = stockBuilder.ceo;
        this.capital = stockBuilder.capital;
        this.company = stockBuilder.company;
        this.dividend = stockBuilder.dividend;
        this.employees = stockBuilder.employees;
        this.founded = stockBuilder.founded;
        this.headQuarters = stockBuilder.headQuarters;
    }
}
