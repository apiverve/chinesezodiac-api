// Converter.java

// To use this code, add the following Maven dependency to your project:
//
//
//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//     com.fasterxml.jackson.datatype : jackson-datatype-jsr310   : 2.9.0
//
// Import this package:
//
//     import com.apiverve.data.Converter;
//
// Then you can deserialize a JSON string with
//
//     ChineseZodiacData data = Converter.fromJsonString(jsonString);

package com.apiverve.chinesezodiac.data;

import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Converter {
    // Date-time helpers

    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_INSTANT)
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetDateTime parseDateTimeString(String str) {
        return ZonedDateTime.from(Converter.DATE_TIME_FORMATTER.parse(str)).toOffsetDateTime();
    }

    private static final DateTimeFormatter TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_TIME)
            .parseDefaulting(ChronoField.YEAR, 2020)
            .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
            .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetTime parseTimeString(String str) {
        return ZonedDateTime.from(Converter.TIME_FORMATTER.parse(str)).toOffsetDateTime().toOffsetTime();
    }
    // Serialize/deserialize helpers

    public static ChineseZodiacData fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(ChineseZodiacData obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        reader = mapper.readerFor(ChineseZodiacData.class);
        writer = mapper.writerFor(ChineseZodiacData.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}

// ChineseZodiacData.java

package com.apiverve.chinesezodiac.data;

import com.fasterxml.jackson.annotation.*;
import java.time.LocalDate;

public class ChineseZodiacData {
    private LocalDate date;
    private long zodiacYear;
    private String animal;
    private String animalChinese;
    private String element;
    private String elementChinese;
    private String elementColor;
    private String polarity;
    private String[] traits;
    private long sexagenaryCyclePosition;
    private String fullName;
    private LocalDate chineseNewYear;

    @JsonProperty("date")
    public LocalDate getDate() { return date; }
    @JsonProperty("date")
    public void setDate(LocalDate value) { this.date = value; }

    @JsonProperty("zodiacYear")
    public long getZodiacYear() { return zodiacYear; }
    @JsonProperty("zodiacYear")
    public void setZodiacYear(long value) { this.zodiacYear = value; }

    @JsonProperty("animal")
    public String getAnimal() { return animal; }
    @JsonProperty("animal")
    public void setAnimal(String value) { this.animal = value; }

    @JsonProperty("animalChinese")
    public String getAnimalChinese() { return animalChinese; }
    @JsonProperty("animalChinese")
    public void setAnimalChinese(String value) { this.animalChinese = value; }

    @JsonProperty("element")
    public String getElement() { return element; }
    @JsonProperty("element")
    public void setElement(String value) { this.element = value; }

    @JsonProperty("elementChinese")
    public String getElementChinese() { return elementChinese; }
    @JsonProperty("elementChinese")
    public void setElementChinese(String value) { this.elementChinese = value; }

    @JsonProperty("elementColor")
    public String getElementColor() { return elementColor; }
    @JsonProperty("elementColor")
    public void setElementColor(String value) { this.elementColor = value; }

    @JsonProperty("polarity")
    public String getPolarity() { return polarity; }
    @JsonProperty("polarity")
    public void setPolarity(String value) { this.polarity = value; }

    @JsonProperty("traits")
    public String[] getTraits() { return traits; }
    @JsonProperty("traits")
    public void setTraits(String[] value) { this.traits = value; }

    @JsonProperty("sexagenaryCyclePosition")
    public long getSexagenaryCyclePosition() { return sexagenaryCyclePosition; }
    @JsonProperty("sexagenaryCyclePosition")
    public void setSexagenaryCyclePosition(long value) { this.sexagenaryCyclePosition = value; }

    @JsonProperty("fullName")
    public String getFullName() { return fullName; }
    @JsonProperty("fullName")
    public void setFullName(String value) { this.fullName = value; }

    @JsonProperty("chineseNewYear")
    public LocalDate getChineseNewYear() { return chineseNewYear; }
    @JsonProperty("chineseNewYear")
    public void setChineseNewYear(LocalDate value) { this.chineseNewYear = value; }
}