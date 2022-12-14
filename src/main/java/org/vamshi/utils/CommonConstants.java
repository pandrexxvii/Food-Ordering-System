package org.vamshi.utils;

public class CommonConstants {
    public static String AUTHOR = "Pandre Vamshi";
    public static String CONFIG_PATH = "src/main/resources/config.properties";
    public static String ERROR_CONFIG_PATH = "src/main/resources/error.properties";

    public static String STREAM_NAME = "Order-Stream";
    public static String MAPPER_NAME = "Stream-Mapper";
    public static String PUBLISHER = "Kafka-Publisher";
    public static String INSERT_QUERY = "INSERT INTO confirmed_table (?,?,?,?,?) VALUES (?)";

}
