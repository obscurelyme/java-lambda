package com.example.app;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Example Lambda Function
 */
public class Handler implements RequestHandler<ExampleRequest, ExampleResponse> {
    
    @Override
    public ExampleResponse handleRequest(ExampleRequest req, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Example of a Lambda function written in Java.");
    
        String name = "Java";

        if (req.name() != null) {
            name = req.name();
        }

        return new ExampleResponse("Hello, " + name);
    }

}

record ExampleRequest(String name) {}

record ExampleResponse(String message) {}