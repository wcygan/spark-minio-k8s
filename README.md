# spark-minio-k8s

This project uses Spark and MinIO running on Kubernetes.

## Prerequisites

Make sure you have the following tools installed:

- [kubectl](https://kubernetes.io/docs/tasks/tools/install-kubectl/)
- [helm](https://helm.sh/docs/intro/install/)
- [skaffold](https://skaffold.dev/docs/install/)

Further, you will need a cluster to deploy to. You can use [minikube](https://minikube.sigs.k8s.io/docs/start/) for
local development.

## Quickstart

This project uses https://skaffold.dev/ to build and deploy the project.

Deploy the project:

```
skaffold run
```

Delete the deployment:

```
skaffold delete
```

## Notes

I'm recording some notes here for future reference.

- [Spark Setup Notes](documentation/spark-setup-notes.md)
- [MinIO Setup Notes](documentation/minio-setup-notes.md)

## References

- [Running Spark on Kubernetes](https://spark.apache.org/docs/latest/running-on-kubernetes.html)
- [Spark, MinIO and Kubernetes](https://blog.min.io/spark-minio-kubernetes/)
- [Skaffold Documentation](https://skaffold.dev/docs/)