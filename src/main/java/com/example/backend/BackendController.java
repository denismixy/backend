package com.example.backend;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BackendController {
    @GetMapping(value = "/changePin", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String changePin() {
        return CipherModuleClient.changePin();
    }

    @GetMapping(value = "/processingPinChange", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String processingPinChange(@RequestParam(name = "encryptedPin") String encryptedPin,
                                      @RequestParam(name = "encryptedPan") String encryptedPan) {
        return CipherModuleClient.processingPinChange(encryptedPin, encryptedPan);
    }
}
