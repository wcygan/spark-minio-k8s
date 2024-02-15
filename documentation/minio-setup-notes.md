## Storage Setup

### Create a Persistent Volume

```bash
kubectl apply -f minio/pv.yaml
kubectl get pv
```

### Create a Persistent Volume Claim

```bash
kubectl apply -f minio/pvc.yaml
kubectl get pvc
```

## Create a MinIO Deployment

```bash
kubectl apply -f minio/deployment.yaml
kubectl get pods
```

## Access MinIO Console

## Port-Forward the MinIO Console

```bash
kubectl port-forward deployment/minio 9001:9001
```

## Access MinIO Console

Navigate to http://127.0.0.1:9001 after port-forwarding. Log in with username `minioadmin` and password `minioadmin`.

## Access MinIO with MinIO Client

We will use [mc](https://min.io/docs/minio/linux/reference/minio-mc.html) to access the server.

## Port Forward MinIO S3-API

```bash
kubectl port-forward deployment/minio 9000:9000
```

## Set Up MinIO Client

```bash
mc alias set minio http://127.0.0.1:9000 minioadmin minioadmin
```

## Check if MinIO is Accessible

```bash
mc ls minio
```