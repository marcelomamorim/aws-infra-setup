package br.com.awsinfrasetup.enumeration;

public enum TipoServicoAWS {

    SIMPLE_QUEUE_SERVICE("SQS"),
    SIMPLE_NOTIFICATION_SERVICE("SNS"),
    API_GATEWAY("APIGATEWAY"),
    DYNAMO_DB("DYNAMODB");

    TipoServicoAWS(String servico) {}

}
