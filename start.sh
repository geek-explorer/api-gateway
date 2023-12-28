#!/bin/ksh
nohup /usr/java/jdk1.8.0_191/bin/java -jar -Dspring.cloud.bootstrap.location=/app/cce/services/api-gateway/conf/bootstrap.yml cam-ccer-api-gateway-1.0-SNAPSHOT.jar > /dev/null 2>&1
