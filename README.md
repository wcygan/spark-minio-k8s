# spark-minio-k8s

This project uses Spark and MinIO running on Kubernetes.

## Quickstart

This project uses https://skaffold.dev/ to build and deploy the project.

```
skaffold run
```

To delete the deployment, run:

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