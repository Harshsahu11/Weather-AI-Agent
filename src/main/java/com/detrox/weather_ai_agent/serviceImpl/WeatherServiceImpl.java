package com.detrox.weather_ai_agent.serviceImpl;

import com.detrox.weather_ai_agent.service.WeatherService;
import com.detrox.weather_ai_agent.tools.SimpleDataTool;
import com.detrox.weather_ai_agent.tools.WeatherTool;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {

    private WeatherTool weatherTool;

    private ChatClient chatClient ;

    public WeatherServiceImpl(ChatClient chatClient,WeatherTool weatherTool){
        this.chatClient = chatClient;
        this.weatherTool = weatherTool;
    }

    public String chat(String query){
        return chatClient
                .prompt(query)
                .tools(new SimpleDataTool(),weatherTool)
                .call()
                .content();
    }

}
