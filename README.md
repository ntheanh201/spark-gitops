# spark-gitops

## Run manually

```shell
./bin/spark-submit \
  --master k8s://https://spark-server:spark-api-server-port \
  --deploy-mode cluster \
  --name spark-pi \
  --conf spark.kubernetes.driverEnv.SPARK_MASTER_URL=spark://spark-master-svc:spark-master-port \
  --conf spark.kubernetes.container.image=bitnami/spark:3 \
  --conf spark.kubernetes.file.upload.path='local://<path>/spark-gitops' \
  --conf spark.kubernetes.authenticate.driver.serviceAccountName=spark \
  --conf spark.kubernetes.namespace=spark \
  --driver-memory 1g \
  --executor-memory 1g \
  --executor-cores 1 \
  --class com.ntheanh201.uw.Main \
  ./target/spark-poc-0.0.1.jar
```

## GitOps