package com.example.backend;

public class Templates {
    public static final String FAILED = "<head>\n" +
            "    <title>Getting Started: Serving Web Content</title>\n" +
            "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
            "</head>\n" +
            "<body>\n" +
            "<h2>Произошла ошибка</h2>\n" +
            "<form id=\"failedForm\" name=\"failedForm\" method=\"get\" action=\"/changePin\">\n" +
            "    <input type=\"submit\" name=\"pinButton\" value=\"Попробовать еще раз\"/>\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";
}
