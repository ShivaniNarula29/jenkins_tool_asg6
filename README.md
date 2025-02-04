# jenkins_tool_asg6

Create an ansible shared library in Jenkins for your tool with the following steps: 

- clone 
- User Approval 
- Playbook Execution 
- Notification 

Required inputs for the shared library should be passed via a configuration file 

eg: 
SLACK_CHANNEL_NAME  = build-status 
ENVIRONMENT         = prod 
CODE_BASE_PATH      = env/prod 
ACTION_MESSAGE      = <channel message> 
KEEP_APPROVAL_STAGE = true" 
