load('ext://helm_resource', 'helm_resource', 'helm_repo')

helm_repo('spark-operator', 'https://googlecloudplatform.github.io/spark-on-k8s-operator')

helm_resource(
  name='spark-operator-deployment',
  chart='spark-operator/spark-operator',
  namespace='spark-operator',
  resource_deps=['spark-operator'],
  flags=[
    '--set=webhook.enable=true',
    '--set=image.repository=openlake/spark-operator',
    '--set=image.tag=3.3.1',
    '--create-namespace'
  ]
)

k8s_yaml([
  'admin.yaml',
  'service-account.yaml',
])