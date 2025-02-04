def sendSlackNotification(channel, message, color = 'good') {
    slackSend(channel: channel, message: message, color: color)
}
