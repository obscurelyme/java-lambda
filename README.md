# Java Lambda

This is an example project of a working Lambda function using Java.

For more information on how to work with AWS Lambdas in Java refer to the offical [docs](https://docs.aws.amazon.com/lambda/latest/dg/lambda-java.html).

To build and package into a shaded .jar that can be deployed to AWS Lambda

```sh
mvn install
mvn package
```

It is highly recommended to leverage [Jeeves](https://github.com/obscurelyme/jeeves) alongside this for development.

To start the Lambda function locally
```sh
jeeves faas start
```