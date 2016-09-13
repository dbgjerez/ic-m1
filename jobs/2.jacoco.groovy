job('ic-w1-jacoco') {
    scm {
        git('git://github.com/dbgjerez/ic-m1.git')
    }
    triggers {
    	 upstream('ic-w1-clean', 'SUCCESS')
    }
    steps {
        gradle('jacocoTestReport')
    }
}
