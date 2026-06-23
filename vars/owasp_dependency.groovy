def call() {
    dependencyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP'
}
