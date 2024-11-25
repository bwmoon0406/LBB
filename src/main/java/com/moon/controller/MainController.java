package com.moon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/player-registration")
    public String showPlayerRegistrationPage() {
        return "playerRegistration";
    }

    @GetMapping("record-sheet")
    public String showRecordSheetPage() {
        return "record-sheet";
    }

    @GetMapping("record-room")
    public String showRecordRoomPage() {
        return "record-room";
    }

    @GetMapping("player-info")
    public String showPlayerInfoPage() {
        return "player-info";
    }

    @GetMapping("setting")
    public String showSettingPage() {
        return "setting";
    }
}
