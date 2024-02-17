load('ext://helm_resource', 'helm_resource', 'helm_repo')

helm_repo('spark-operator', 'https://googlecloudplatform.github.io/spark-on-k8s-operator')

k8s_yaml([
  'admin.yaml',
  'service-account.yaml',
])