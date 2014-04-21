package org.openfaces.sample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;


/**
 * @author max.yurin
 */

@Controller
public class IndexController {
    private static Logger LOGGER = Logger.getLogger(String.valueOf(IndexController.class));

    @RequestMapping(value={"/index", "/home"}, method = RequestMethod.GET)
    public String home(){
        LOGGER.info("GO TO THE HOME PAGE!!!!!!!!!!!");
        return "home";
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String root(){
        LOGGER.info("GO TO THE HOME PAGE!!!!!!!!!!!");
        return "home";
    }
}