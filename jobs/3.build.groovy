job('ic-w1-build') {
    scm {
        git('git://github.com/dbgjerez/ic-m1.git')
    }
    triggers {
    	 upstream('ic-w1-jacoco', 'SUCCESS')
    }
    steps {
        gradle('build')
    }
}
