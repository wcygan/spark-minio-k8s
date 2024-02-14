# spark-minio-k8s

This project follows the [Spark, MinIO and Kubernetes](https://blog.min.io/spark-minio-kubernetes/) article.

## Create a Persistent Volume

```bash
kubectl apply -f minio/pv.yaml
kubectl get pv
```

## Create a Persistent Volume Claim

```bash
kubectl apply -f minio/pvc.yaml
kubectl get pvc
```

## Create a MinIO Deployment

```bash
kubectl apply -f minio/deployment.yaml
kubectl get pods
```