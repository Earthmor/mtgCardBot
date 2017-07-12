package com.x2b.mcb;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update; 
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException; 

public class MtgCardBot extends TelegramLongPollingBot 
{  
    public void onUpdateReceived(Update update) 
    {
        if(update.hasMessage() && update.getMessage().hasText())
        {
            String text = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            SendMessage msg = new SendMessage();
            msg.setChatId(chatId);
            msg.setText(text);

            try
            {
                sendMessage(msg);
            } catch (TelegramApiException ex) 
            {
                ex.printStackTrace();
            }
        }
    } 
    
    public String getBotUsername() 
    { 
        return "MtgCardBot"; 
    } 
    
    @Override 
    public String getBotToken() 
    { 
        return "393847626:AAFIwNqqCWBzeeboGDqZuKhOn8Y1WBn0RTA"; 
    } 
} 
