package com.company;

public class Main {

    class Author {
        private String email;
        private String name;
        private char gender;

        Author( String name, String email, char gender){
            this.email =email;
            this.name=name;
            this.gender = gender;
        }

        public String getEmail(){
            return this.email;
        }
        public void setEmail(String email){
            this.email=email;
        }
        public String getName(){
            return this.name;
        }
        public int getGender(){
            return this.gender;
        }

        public String toString(){
            String result = "";
            result += "Author[name=" + this.name +",email=" + this.email + ",gender=" + this.gender +"]";
            return result;
        }
    }
    class Book {
        private String name;
        private Author author ;
        private double price;
        private int qty=0;

        Book( String name, double price, Author author ){
            this.name=name;
            this.price=price;
            this.author=author;
        }
        Book( String name, double price, Author author,int qty ){
            this.name=name;
            this.price=price;
            this.author=author;
            this.qty=qty;
        }

        public String getName(){
            return this.name;
        }
        public Author getAuthor(){
            return this.author;
        }
        public double getPrice(){
            return this.price;
        }
        public void setPrice(double price){
            this.price=price;
        }
        public int getQty(){
            return this.qty;
        }
        public void setQty(int qty){
            this.qty=qty;
        }


        public String toString(){
            String result = "";
            result += "Book[name=" + this.name +",author=" + this.author.toString() + ",price=" + this.price + ",qty=" + this.qty+"]";
            return result;
        }
    }





    public static void main(String[] args) {
	// write your code here
    }
}
