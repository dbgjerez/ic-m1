
job('ic-m1-sonar') {
    scm {
        git('git://github.com/dbgjerez/ic-m1.git')
    }
    triggers {
    	 upstream('ic-m1-build', 'SUCCESS')
    }
    steps {
        gradle('sonarqube')
    }
}
