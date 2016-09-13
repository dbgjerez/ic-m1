job('ic-w1-sonar') {
    scm {
        git('git://github.com/dbgjerez/ic-m1.git')
    }
    triggers {
    	 upstream('ic-w1-build', 'SUCCESS')
    }
    steps {
        gradle('sonarqube')
    }
}
