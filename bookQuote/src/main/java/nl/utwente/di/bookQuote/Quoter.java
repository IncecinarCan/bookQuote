package nl.utwente.di.bookQuote;

import java.util.HashMap;

public class Quoter {
    public double getBookPrice(String isbn) {
        HashMap<String , Double> books = new HashMap<String, Double>();
        books.put("1" , 10.0);
        books.put("2" , 45.0);
        books.put("3" , 20.0);
        books.put("4" , 35.0);
        books.put("5" , 50.0);
        if (!books.containsKey(isbn)) return 0;
        return books.get(isbn);
    }
}