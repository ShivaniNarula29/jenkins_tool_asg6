def runAnsiblePlaybook(environment, codeBasePath, actionMessage, prometheusHost) {
    // Ensure Ansible environment is properly set up before running
    sh '''
    export ANSIBLE_CONFIG=ansible.cfg
    ansible-playbook -i ${codeBasePath}/inventory/${environment}.ini ${codeBasePath}/deploy.yml
    '''

    // Call Prometheus after playbook execution to monitor the deployment
    sh """
    curl -X POST -H 'Content-Type: application/json' \
    -d '{"status": "completed", "message": "${actionMessage}", "host": "${prometheusHost}"}' \
    http://prometheus-server.example.com/api/v1/notify-deployment
    """
}
