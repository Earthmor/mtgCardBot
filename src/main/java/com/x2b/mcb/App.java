package com.x2b.mcb;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class App 
{
    public static void main( String[] args )
    {
        ApiContextInitializer.init();
        TelegramBotsApi botsApi = new TelegramBotsApi();

        try
        {
            botsApi.registerBot(new MtgCardBot());
        } catch (TelegramApiException ex) 
        {
            ex.printStackTrace();
        }
    }
}
