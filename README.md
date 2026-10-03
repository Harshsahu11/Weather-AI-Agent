# 🌦️ Weather AI Agent — Spring AI + Gemini

### A Spring Boot AI agent that uses Google Gemini with Spring AI Tool Calling to answer weather and date/time-related queries. The application demonstrates how an LLM can understand a user's request, decide which tool is required, invoke that tool, and generate a final natural-language response.

## 🚀 Features

- 🤖 Google Gemini integration using Spring AI
- 🌤️ Real-time weather information using WeatherAPI
- 🕐 Current date and time tool
- ⏰ Alarm-setting action tool
- 🛠️ Spring AI `@Tool` and `@ToolParam` annotations
- 🔄 Automatic LLM tool calling
- 🌐 REST API based application
- 🧩 Clean service/tool separation

## 🔄 Control Flow

<img width="1536" height="1024" alt="Complete Weather AI Flow Diagram" src="https://github.com/user-attachments/assets/de49367a-2ff0-42da-9574-33c5409fbaf1" />

## ⚙️ Configuration

```properties
spring.application.name=weather-ai-agent
server.port=8081

spring.ai.google.genai.api-key=${GEMINI_API_KEY}
spring.ai.google.genai.chat.model=YOUR_GEMINI_MODEL

logging.level.org.springframework.ai.chat.client.advisor=DEBUG

app.weather.api-key=${WEATHER_API_KEY}

```

## 👨‍💻 Author

### Harsh Sahu

- GitHub: [Harshsahu11](https://github.com/Harshsahu11)
