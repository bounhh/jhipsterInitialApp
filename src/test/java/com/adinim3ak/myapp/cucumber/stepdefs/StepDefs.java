package com.adinim3ak.myapp.cucumber.stepdefs;

import com.adinim3ak.myapp.MonApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MonApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
