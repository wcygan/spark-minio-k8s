## Quick Start

To run this example, do the following commands:

```
helm repo add spark-operator https://googlecloudplatform.github.io/spark-on-k8s-operator

helm install spark-operator spark-operator/spark-operator --namespace spark-operator --create-namespace
    
kubectl apply -f service-account.yaml

kubectl apply -f spark-application/spark-application.yaml

kubectl logs -n spark-operator spark-minio-k8s-driver
```


## Install Spark Operator

Add

```
helm repo add spark-operator https://googlecloudplatform.github.io/spark-on-k8s-operator
```

Install

```
helm install spark-operator spark-operator/spark-operator --namespace spark-operator --create-namespace
```

Uninstall

```
helm uninstall spark-operator --namespace spark-operator
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


## Submitting a Spark Job

Apply it 

```
kubectl apply -f spark-application/spark-application.yaml 
```

Describe it

```
kubectl describe sparkapplication spark-minio-k8s -n spark-operator
```

View logs

```
kubectl logs -n spark-operator spark-minio-k8s-driver
```

Delete it

```
kubectl delete -f spark-application/spark-application.yaml
```