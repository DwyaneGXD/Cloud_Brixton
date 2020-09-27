package com.dwyane.brixton.client.controller;

import com.dwyane.brixton.client.config.ConfigInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("configConsumer")
public class ConfigClientController {
  @Autowired
  private ConfigInfoProperties configInfoValue;

  @RequestMapping("/getConfigInfo")
  public String getConfigInfo() {
    return configInfoValue.getConfig();
  }
}
