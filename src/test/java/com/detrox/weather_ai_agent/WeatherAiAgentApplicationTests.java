package com.detrox.weather_ai_agent;

import com.detrox.weather_ai_agent.tools.WeatherTool;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WeatherAiAgentApplicationTests {

	private @Autowired WeatherTool weatherTool;

	@Test
	void getWeatherTest(){
		var response = weatherTool.getWeather("Delhi India");
		System.out.println(response);
	}

}
