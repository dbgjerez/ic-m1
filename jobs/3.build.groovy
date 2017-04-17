
job('ic-m1-build') {
    scm {
        git('git://github.com/dbgjerez/ic-m1.git')
    }
    triggers {
    	 upstream('ic-m1-jacoco', 'SUCCESS')
    }
    steps {
        gradle('build')
    }
}
