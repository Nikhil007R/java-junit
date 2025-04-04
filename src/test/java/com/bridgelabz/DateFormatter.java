package com.bridgelabz;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatter {

    public String formatDate(String inputDate){
        if(inputDate == null || inputDate.isEmpty()){
            throw new IllegalArgumentException("Input date can be null. ");
        }

        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

        try{
            Date date = inputFormat.parse(inputDate);
            return outputFormat.format(date);
        }
        catch (ParseException e){
            throw new IllegalArgumentException("Invalid date format, expected yyyy-MM-dd");
        }
    }
}
