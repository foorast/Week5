package com.origamisoftware.teach.advanced.services;

import com.origamisoftware.teach.advanced.model.StockQuote;
import org.junit.Test;

import java.util.Calendar;
import java.util.List;

import static junit.framework.Assert.assertNotNull;

public class SimpleStockServiceTest {

    /**
     * Test the SimpleStockService getQuote(symbol) method
     */
    @Test
    public void getQuoteTest (){
        SimpleStockService stockService = new SimpleStockService();
        String symbol = "APPL";
        StockQuote stockQuote = stockService.getQuote(symbol);
        assertNotNull("Can we get a Quote.",  stockQuote);
    }


    /**
     * Test the SimpleStockService getQuote(symbol, calendar, calendar) method
     */
    @Test
    public void getMultiQuoteTest(){
        SimpleStockService stockService = new SimpleStockService();

        String symbol = "GOOG";
        Calendar start = Calendar.getInstance();
        start.set(1999, 11, 14, 0,0,0);
        Calendar end = Calendar.getInstance();
        end.set(2020, 11, 14, 0, 0, 0);

        List<StockQuote> stockQuote = stockService.getQuote(symbol, start, end);

        assertNotNull("Can we get a Quote",  stockQuote);
    }
}
