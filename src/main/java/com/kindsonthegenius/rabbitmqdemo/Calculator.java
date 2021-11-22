package com.kindsonthegenius.rabbitmqdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @GetMapping("/sum/{x}/{y}")
    public Response sum(@PathVariable double x, @PathVariable double y)
    {
        return new Response(x, y, x+y);
    }

    @GetMapping("/sub/{x}/{y}")
    public Response sub(@PathVariable double x, @PathVariable double y)
    {
        return new Response(x, y, x-y);
    }

    @GetMapping("/div/{x}/{y}")
    public Response div(@PathVariable double x, @PathVariable double y)
    {
        return new Response(x, y, x/y);
    }

    @GetMapping("mult/{x}/{y}")
    public Response mult(@PathVariable double x, @PathVariable double y)
    {
        return new Response(x, y, x*y);
    }



}
