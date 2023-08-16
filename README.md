# spark-gitops

## Run manually

```shell
./bin/spark-submit \
  --master k8s://https://13.214.156.23:6443 \
  --deploy-mode cluster \
  --name spark-pi \
  --conf spark.kubernetes.driverEnv.SPARK_MASTER_URL=spark://13.214.156.23:30086 \
  --driver-memory 1g \
  --executor-memory 1g \
  --executor-cores 1  \
  --py-files /home/vtn-anhnt645/Downloads/ntheanh201/uw/spark-gitops/python/pi.py
```

## GitOps