## Install Spark Operator

Add

```
helm repo add spark-operator https://googlecloudplatform.github.io/spark-on-k8s-operator
```

Install

```
helm install spark-operator spark-operator/spark-operator \
    --namespace spark-operator \
    --set webhook.enable=true \
    --set image.repository=openlake/spark-operator \
    --set image.tag=3.3.1 \
    --create-namespace
```

Delete

```
helm delete spark-operator --namespace spark-operator
```

See what's running

```
kubectl get pods -n spark-operator
```

Create a service account to run spark jobs

```
kubectl apply -f service-account.yaml
```

## Package and Run the Spark Application with Docker

```
docker build . -t spark-applicationdocke
docker run spark-application
```

## Submitting a Spark Job

Apply it 

```
kubectl apply -f spark-application/spark-application.yaml 
```

Describe it

```
kubectl describe sparkapplication spark-minio-k8s -n spark-operator
```

Delete it

```
kubectl delete -f spark-application/spark-application.yaml
```