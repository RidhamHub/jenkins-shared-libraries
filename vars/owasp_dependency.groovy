def call() {
    dependencyCheck additionalArguments: '--scan ./ --noupdate', odcInstallation: 'OWASP'
}
